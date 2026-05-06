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

        return demonstrateLengthEquality(
                length1,
                length2
        );
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

    // Overloaded conversion
    public static Length demonstrateLengthConversion(
            Length length,
            Length.LengthUnit toUnit
    ) {

        return length.convertTo(toUnit);
    }

    // Addition method
    public static Length demonstrateLengthAddition(
            Length length1,
            Length length2
    ) {

        return length1.add(length2);
    }

    // Main method
    public static void main(String[] args) {

        System.out.println(
                "===== UC6 - Addition Operations ====="
        );

        Length length1 =
                new Length(
                        1.0,
                        Length.LengthUnit.FEET
                );

        Length length2 =
                new Length(
                        12.0,
                        Length.LengthUnit.INCHES
                );

        Length result1 =
                demonstrateLengthAddition(
                        length1,
                        length2
                );

        System.out.println(
                "1 FEET + 12 INCHES = "
                        + result1
        );

        Length length3 =
                new Length(
                        12.0,
                        Length.LengthUnit.INCHES
                );

        Length length4 =
                new Length(
                        1.0,
                        Length.LengthUnit.FEET
                );

        Length result2 =
                demonstrateLengthAddition(
                        length3,
                        length4
                );

        System.out.println(
                "12 INCHES + 1 FEET = "
                        + result2
        );

        Length length5 =
                new Length(
                        1.0,
                        Length.LengthUnit.YARDS
                );

        Length length6 =
                new Length(
                        3.0,
                        Length.LengthUnit.FEET
                );

        Length result3 =
                demonstrateLengthAddition(
                        length5,
                        length6
                );

        System.out.println(
                "1 YARD + 3 FEET = "
                        + result3
        );

        Length length7 =
                new Length(
                        5.0,
                        Length.LengthUnit.FEET
                );

        Length length8 =
                new Length(
                        -2.0,
                        Length.LengthUnit.FEET
                );

        Length result4 =
                demonstrateLengthAddition(
                        length7,
                        length8
                );

        System.out.println(
                "5 FEET + (-2 FEET) = "
                        + result4
        );
    }
}