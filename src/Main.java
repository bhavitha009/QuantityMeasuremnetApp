public class Main {

    // Equality method
    public static boolean demonstrateLengthEquality(
            Length length1,
            Length length2
    ) {

        return length1.equals(length2);
    }

    // Comparison method
    public static boolean demonstrateLengthComparison(
            double value1,
            Length.LengthUnit unit1,
            double value2,
            Length.LengthUnit unit2
    ) {

        Length length1 =
                new Length(value1, unit1);

        Length length2 =
                new Length(value2, unit2);

        return demonstrateLengthEquality(length1, length2);
    }

    // Conversion method
    public static Length demonstrateLengthConversion(
            double value,
            Length.LengthUnit fromUnit,
            Length.LengthUnit toUnit
    ) {

        Length length =
                new Length(value, fromUnit);

        return length.convertTo(toUnit);
    }

    // Overloaded conversion method
    public static Length demonstrateLengthConversion(
            Length length,
            Length.LengthUnit toUnit
    ) {

        return length.convertTo(toUnit);
    }

    // Main method
    public static void main(String[] args) {

        Length feetToInches =
                demonstrateLengthConversion(
                        1.0,
                        Length.LengthUnit.FEET,
                        Length.LengthUnit.INCHES
                );

        System.out.println(
                "Input: convert(1.0, FEET, INCHES)"
        );

        System.out.println(
                "Output: " +
                        feetToInches.getValue()
        );

        System.out.println();

        Length yardsToFeet =
                demonstrateLengthConversion(
                        3.0,
                        Length.LengthUnit.YARDS,
                        Length.LengthUnit.FEET
                );

        System.out.println(
                "Input: convert(3.0, YARDS, FEET)"
        );

        System.out.println(
                "Output: " +
                        yardsToFeet.getValue()
        );

        System.out.println();

        Length inchesToYards =
                demonstrateLengthConversion(
                        36.0,
                        Length.LengthUnit.INCHES,
                        Length.LengthUnit.YARDS
                );

        System.out.println(
                "Input: convert(36.0, INCHES, YARDS)"
        );

        System.out.println(
                "Output: " +
                        inchesToYards.getValue()
        );

        System.out.println();

        Length cmToInches =
                demonstrateLengthConversion(
                        1.0,
                        Length.LengthUnit.CENTIMETERS,
                        Length.LengthUnit.INCHES
                );

        System.out.println(
                "Input: convert(1.0, CENTIMETERS, INCHES)"
        );

        System.out.println(
                "Output: " +
                        cmToInches.getValue()
        );

        System.out.println();

        Length zeroValue =
                demonstrateLengthConversion(
                        0.0,
                        Length.LengthUnit.FEET,
                        Length.LengthUnit.INCHES
                );

        System.out.println(
                "Input: convert(0.0, FEET, INCHES)"
        );

        System.out.println(
                "Output: " +
                        zeroValue.getValue()
        );
    }
}