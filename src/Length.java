public class Length {

    private double value;
    private LengthUnit unit;

    public Length(double value,
                  LengthUnit unit) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException(
                    "Invalid value"
            );
        }

        if (unit == null) {
            throw new IllegalArgumentException(
                    "Unit cannot be null"
            );
        }

        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null ||
                getClass() != obj.getClass()) {

            return false;
        }

        Length thatLength = (Length) obj;

        return compare(thatLength);
    }

    public Length convertTo(
            LengthUnit targetUnit
    ) {

        double baseValue =
                convertToBaseUnit();

        double convertedValue =
                convertFromBaseToTargetUnit(
                        baseValue,
                        targetUnit
                );

        return new Length(
                convertedValue,
                targetUnit
        );
    }

    public Length add(Length thatLength) {

        return add(
                thatLength,
                this.unit
        );
    }

    public Length add(
            Length length,
            LengthUnit targetUnit
    ) {

        if (length == null) {
            throw new IllegalArgumentException(
                    "Length cannot be null"
            );
        }

        if (targetUnit == null) {
            throw new IllegalArgumentException(
                    "Target unit cannot be null"
            );
        }

        return addAndConvert(
                length,
                targetUnit
        );
    }

    private boolean compare(
            Length thatLength
    ) {

        return Double.compare(
                this.convertToBaseUnit(),
                thatLength.convertToBaseUnit()
        ) == 0;
    }

    private Length addAndConvert(
            Length length,
            LengthUnit targetUnit
    ) {

        double thisBase =
                this.convertToBaseUnit();

        double otherBase =
                length.convertToBaseUnit();

        double totalBase =
                thisBase + otherBase;

        double convertedValue =
                convertFromBaseToTargetUnit(
                        totalBase,
                        targetUnit
                );

        return new Length(
                convertedValue,
                targetUnit
        );
    }

    // Delegates conversion to enum
    private double convertToBaseUnit() {

        return unit.convertToBaseUnit(
                value
        );
    }

    // Delegates conversion to enum
    private double convertFromBaseToTargetUnit(
            double baseValue,
            LengthUnit targetUnit
    ) {

        return targetUnit.convertFromBaseUnit(
                baseValue
        );
    }

    @Override
    public String toString() {

        return String.format(
                "%.2f %s",
                value,
                unit
        );
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }
}