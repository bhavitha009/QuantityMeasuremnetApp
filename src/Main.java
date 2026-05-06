public class Main {

    public static class Length {

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
            this.value = value;
            this.unit = unit;
        }

        // Convert to base unit (inches)
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

    // Generic comparison method
    public static boolean demonstrateLengthEquality(
            Length length1,
            Length length2
    ) {
        return length1.equals(length2);
    }

    // Display method
    public static void demonstrateLengthComparison(
            double value1,
            Length.LengthUnit unit1,
            double value2,
            Length.LengthUnit unit2
    ) {

        Length length1 = new Length(value1, unit1);
        Length length2 = new Length(value2, unit2);

        System.out.println(
                "Input: Quantity(" + value1 + ", " + unit1 + ") and Quantity("
                        + value2 + ", " + unit2 + ")"
        );

        System.out.println(
                "Output: Equal (" +
                        demonstrateLengthEquality(length1, length2) +
                        ")"
        );

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Feet and Inches
        demonstrateLengthComparison(
                1.0,
                Length.LengthUnit.FEET,
                12.0,
                Length.LengthUnit.INCHES
        );

        // Yards and Inches
        demonstrateLengthComparison(
                1.0,
                Length.LengthUnit.YARDS,
                36.0,
                Length.LengthUnit.INCHES
        );

        // Centimeters and Inches
        demonstrateLengthComparison(
                1.0,
                Length.LengthUnit.CENTIMETERS,
                0.393701,
                Length.LengthUnit.INCHES
        );

        // Feet and Yards
        demonstrateLengthComparison(
                3.0,
                Length.LengthUnit.FEET,
                1.0,
                Length.LengthUnit.YARDS
        );

        // Centimeters and Feet
        demonstrateLengthComparison(
                30.48,
                Length.LengthUnit.CENTIMETERS,
                1.0,
                Length.LengthUnit.FEET
        );
    }
}