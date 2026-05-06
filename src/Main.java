public class Main {

    // Length class
    public static class Length {

        // Instance variables
        private double value;
        private LengthUnit unit;

        // Enum for units
        public enum LengthUnit {

            FEET(12.0),
            INCHES(1.0);

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
            this.value = value;
            this.unit = unit;
        }

        // Convert to base unit
        private double convertToBaseUnit() {
            return value * unit.getConversionFactor();
        }

        // Compare two lengths
        public boolean compare(Length thatLength) {
            return Double.compare(
                    this.convertToBaseUnit(),
                    thatLength.convertToBaseUnit()
            ) == 0;
        }

        // Override equals
        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Length thatLength = (Length) obj;

            return this.compare(thatLength);
        }
    }

    // Generic method
    public static boolean demonstrateLengthEquality(
            Length length1,
            Length length2
    ) {
        return length1.equals(length2);
    }

    // Feet equality
    public static void demonstrateFeetEquality() {

        Length feet1 = new Length(1.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(1.0, Length.LengthUnit.FEET);

        System.out.println(
                "Input: Quantity(1.0, \"feet\") and Quantity(1.0, \"feet\")"
        );

        System.out.println(
                "Output: Equal (" +
                        demonstrateLengthEquality(feet1, feet2) +
                        ")"
        );
    }

    // Inches equality
    public static void demonstrateInchesEquality() {

        Length inches1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length inches2 = new Length(1.0, Length.LengthUnit.INCHES);

        System.out.println(
                "Input: Quantity(1.0, \"inch\") and Quantity(1.0, \"inch\")"
        );

        System.out.println(
                "Output: Equal (" +
                        demonstrateLengthEquality(inches1, inches2) +
                        ")"
        );
    }

    // Feet and Inches comparison
    public static void demonstrateFeetInchesComparison() {

        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);

        System.out.println(
                "Input: Quantity(1.0, \"feet\") and Quantity(12.0, \"inches\")"
        );

        System.out.println(
                "Output: Equal (" +
                        demonstrateLengthEquality(feet, inches) +
                        ")"
        );
    }

    // Main method
    public static void main(String[] args) {

        demonstrateFeetEquality();

        demonstrateInchesEquality();

        demonstrateFeetInchesComparison();
    }
}