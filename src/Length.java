public class Length {

    private double value;
    private LengthUnit unit;

    public enum LengthUnit {

        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }

        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    private double convertToBaseUnit() {

        return value * unit.getConversionFactor();
    }

    private boolean compare(Length thatLength) {

        return Double.compare(
                this.convertToBaseUnit(),
                thatLength.convertToBaseUnit()
        ) == 0;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Length thatLength = (Length) obj;

        return compare(thatLength);
    }

    public Length convertTo(LengthUnit targetUnit) {

        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        double baseValue = convertToBaseUnit();

        double convertedValue =
                baseValue / targetUnit.getConversionFactor();

        return new Length(convertedValue, targetUnit);
    }

    // UC6 Add method
    public Length add(Length thatLength) {

        return add(thatLength, this.unit);
    }

    // UC7 Add with target unit
    public Length add(Length thatLength,
                      LengthUnit targetUnit) {

        if (thatLength == null) {
            throw new IllegalArgumentException("Length cannot be null");
        }

        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        return addAndConvert(
                thatLength,
                targetUnit
        );
    }

    // Private utility method
    private Length addAndConvert(Length length,
                                 LengthUnit targetUnit) {

        double thisBase =
                this.convertToBaseUnit();

        double otherBase =
                length.convertToBaseUnit();

        double totalBase =
                thisBase + otherBase;

        double result =
                totalBase /
                        targetUnit.getConversionFactor();

        return new Length(result, targetUnit);
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