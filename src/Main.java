public class Main {

    public static boolean demonstrateLengthEquality(
            Length length1,
            Length length2
    ) {

        return length1.equals(length2);
    }

    public static boolean demonstrateLengthComparison(
            double value1,
            LengthUnit unit1,
            double value2,
            LengthUnit unit2
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

    public static Length demonstrateLengthConversion(
            double value,
            LengthUnit fromUnit,
            LengthUnit toUnit
    ) {

        Length length =
                new Length(value, fromUnit);

        return length.convertTo(toUnit);
    }

    public static Length demonstrateLengthConversion(
            Length length,
            LengthUnit toUnit
    ) {

        return length.convertTo(toUnit);
    }

    public static Length demonstrateLengthAddition(
            Length length1,
            Length length2
    ) {

        return length1.add(length2);
    }

    public static Length demonstrateLengthAddition(
            Length length1,
            Length length2,
            LengthUnit targetUnit
    ) {

        return length1.add(
                length2,
                targetUnit
        );
    }

    public static void main(String[] args) {

        System.out.println(
                "===== UC8 Refactored Design ====="
        );

        Length result =
                demonstrateLengthAddition(
                        new Length(
                                1.0,
                                LengthUnit.FEET
                        ),

                        new Length(
                                12.0,
                                LengthUnit.INCHES
                        ),

                        LengthUnit.FEET
                );

        System.out.println(result);

        Length converted =
                demonstrateLengthConversion(
                        1.0,
                        LengthUnit.FEET,
                        LengthUnit.INCHES
                );

        System.out.println(converted);
    }
}