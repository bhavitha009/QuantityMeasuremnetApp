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

    // Convert to base unit (inches)
    public double convertToBaseUnit(double value) {

        return value * conversionFactor;
    }

    // Convert from base unit (inches)
    public double convertFromBaseUnit(double baseValue) {

        return baseValue / conversionFactor;
    }
}