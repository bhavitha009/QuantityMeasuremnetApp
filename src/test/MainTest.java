import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private static final double EPSILON = 0.0001;

    @Test
    public void testConversion_FeetToInches() {

        Length result =
                Main.demonstrateLengthConversion(
                        1.0,
                        Length.LengthUnit.FEET,
                        Length.LengthUnit.INCHES
                );

        assertEquals(
                12.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testConversion_InchesToFeet() {

        Length result =
                Main.demonstrateLengthConversion(
                        24.0,
                        Length.LengthUnit.INCHES,
                        Length.LengthUnit.FEET
                );

        assertEquals(
                2.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testConversion_YardsToInches() {

        Length result =
                Main.demonstrateLengthConversion(
                        1.0,
                        Length.LengthUnit.YARDS,
                        Length.LengthUnit.INCHES
                );

        assertEquals(
                36.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testConversion_InchesToYards() {

        Length result =
                Main.demonstrateLengthConversion(
                        72.0,
                        Length.LengthUnit.INCHES,
                        Length.LengthUnit.YARDS
                );

        assertEquals(
                2.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testConversion_CentimetersToInches() {

        Length result =
                Main.demonstrateLengthConversion(
                        2.54,
                        Length.LengthUnit.CENTIMETERS,
                        Length.LengthUnit.INCHES
                );

        assertEquals(
                1.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testConversion_FeetToYards() {

        Length result =
                Main.demonstrateLengthConversion(
                        6.0,
                        Length.LengthUnit.FEET,
                        Length.LengthUnit.YARDS
                );

        assertEquals(
                2.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testConversion_RoundTrip_PreservesValue() {

        Length converted =
                Main.demonstrateLengthConversion(
                        5.0,
                        Length.LengthUnit.FEET,
                        Length.LengthUnit.INCHES
                );

        Length roundTrip =
                Main.demonstrateLengthConversion(
                        converted,
                        Length.LengthUnit.FEET
                );

        assertEquals(
                5.0,
                roundTrip.getValue(),
                EPSILON
        );
    }

    @Test
    public void testConversion_ZeroValue() {

        Length result =
                Main.demonstrateLengthConversion(
                        0.0,
                        Length.LengthUnit.FEET,
                        Length.LengthUnit.INCHES
                );

        assertEquals(
                0.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testConversion_NegativeValue() {

        Length result =
                Main.demonstrateLengthConversion(
                        -1.0,
                        Length.LengthUnit.FEET,
                        Length.LengthUnit.INCHES
                );

        assertEquals(
                -12.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testConversion_InvalidUnit_Throws() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Length(
                        1.0,
                        null
                )
        );
    }

    @Test
    public void testConversion_NaNOrInfinite_Throws() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Length(
                        Double.NaN,
                        Length.LengthUnit.FEET
                )
        );
    }

    @Test
    public void testConversion_PrecisionTolerance() {

        Length result =
                Main.demonstrateLengthConversion(
                        1.0,
                        Length.LengthUnit.CENTIMETERS,
                        Length.LengthUnit.INCHES
                );

        assertEquals(
                0.393701,
                result.getValue(),
                EPSILON
        );
    }
}