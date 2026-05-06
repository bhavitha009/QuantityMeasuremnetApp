public class Length {

    // Instance variables
    private double value;
    private LengthUnit unit;

    // Enum for units
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

    // Constructor
    public Length(double value, LengthUnit unit) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid numeric value");
        }

        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    // Convert to base unit
    private double convertToBaseUnit() {
        return value * unit.getConversionFactor();
    }

    // Compare method
    private boolean compare(Length thatLength) {

        return Double.compare(
                this.convertToBaseUnit(),
                thatLength.convertToBaseUnit()
        ) == 0;
    }

    // Equals method
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

    // Convert to another unit
    public Length convertTo(LengthUnit targetUnit) {

        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        double baseValue = convertToBaseUnit();

        double convertedValue =
                baseValue / targetUnit.getConversionFactor();

        return new Length(convertedValue, targetUnit);
    }

    // Add method
    public Length add(Length thatLength) {

        if (thatLength == null) {
            throw new IllegalArgumentException("Length cannot be null");
        }

        double thisBase =
                this.convertToBaseUnit();

        double thatBase =
                thatLength.convertToBaseUnit();

        double totalBase =
                thisBase + thatBase;

        double resultValue =
                totalBase / this.unit.getConversionFactor();

        return new Length(resultValue, this.unit);
    }

    // toString
    @Override
    public String toString() {

        return String.format(
                "%.2f %s",
                value,
                unit
        );
    }

    // Getters
    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }
}