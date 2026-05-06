public class Main {

    public static boolean demonstrateLengthEquality(
            Length length1,
            Length length2
    ) {

        return length1.equals(length2);
    }

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

    public static Length demonstrateLengthConversion(
            double value,
            Length.LengthUnit fromUnit,
            Length.LengthUnit toUnit
    ) {

        Length length =
                new Length(value, fromUnit);

        return length.convertTo(toUnit);
    }

    public static Length demonstrateLengthConversion(
            Length length,
            Length.LengthUnit toUnit
    ) {

        return length.convertTo(toUnit);
    }

    // UC6 Addition
    public static Length demonstrateLengthAddition(
            Length length1,
            Length length2
    ) {

        return length1.add(length2);
    }

    // UC7 Addition with target unit
    public static Length demonstrateLengthAddition(
            Length length1,
            Length length2,
            Length.LengthUnit targetUnit
    ) {

        return length1.add(
                length2,
                targetUnit
        );
    }

    public static void main(String[] args) {

        System.out.println(
                "===== UC7 Addition With Target Unit ====="
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

        System.out.println(
                demonstrateLengthAddition(
                        length1,
                        length2,
                        Length.LengthUnit.FEET
                )
        );

        System.out.println(
                demonstrateLengthAddition(
                        length1,
                        length2,
                        Length.LengthUnit.INCHES
                )
        );

        System.out.println(
                demonstrateLengthAddition(
                        length1,
                        length2,
                        Length.LengthUnit.YARDS
                )
        );
    }
}