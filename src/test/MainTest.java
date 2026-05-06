import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private static final double EPSILON = 0.0001;

    @Test
    public void testAddition_SameUnit_FeetPlusFeet() {

        Length length1 =
                new Length(
                        1.0,
                        Length.LengthUnit.FEET
                );

        Length length2 =
                new Length(
                        2.0,
                        Length.LengthUnit.FEET
                );

        Length result =
                Main.demonstrateLengthAddition(
                        length1,
                        length2
                );

        assertEquals(
                3.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testAddition_SameUnit_InchPlusInch() {

        Length length1 =
                new Length(
                        6.0,
                        Length.LengthUnit.INCHES
                );

        Length length2 =
                new Length(
                        6.0,
                        Length.LengthUnit.INCHES
                );

        Length result =
                Main.demonstrateLengthAddition(
                        length1,
                        length2
                );

        assertEquals(
                12.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testAddition_CrossUnit_FeetPlusInches() {

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

        Length result =
                Main.demonstrateLengthAddition(
                        length1,
                        length2
                );

        assertEquals(
                2.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testAddition_CrossUnit_InchPlusFeet() {

        Length length1 =
                new Length(
                        12.0,
                        Length.LengthUnit.INCHES
                );

        Length length2 =
                new Length(
                        1.0,
                        Length.LengthUnit.FEET
                );

        Length result =
                Main.demonstrateLengthAddition(
                        length1,
                        length2
                );

        assertEquals(
                24.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testAddition_CrossUnit_YardPlusFeet() {

        Length length1 =
                new Length(
                        1.0,
                        Length.LengthUnit.YARDS
                );

        Length length2 =
                new Length(
                        3.0,
                        Length.LengthUnit.FEET
                );

        Length result =
                Main.demonstrateLengthAddition(
                        length1,
                        length2
                );

        assertEquals(
                2.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testAddition_WithZero() {

        Length length1 =
                new Length(
                        5.0,
                        Length.LengthUnit.FEET
                );

        Length length2 =
                new Length(
                        0.0,
                        Length.LengthUnit.INCHES
                );

        Length result =
                Main.demonstrateLengthAddition(
                        length1,
                        length2
                );

        assertEquals(
                5.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testAddition_NegativeValues() {

        Length length1 =
                new Length(
                        5.0,
                        Length.LengthUnit.FEET
                );

        Length length2 =
                new Length(
                        -2.0,
                        Length.LengthUnit.FEET
                );

        Length result =
                Main.demonstrateLengthAddition(
                        length1,
                        length2
                );

        assertEquals(
                3.0,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testAddition_NullSecondOperand() {

        Length length1 =
                new Length(
                        1.0,
                        Length.LengthUnit.FEET
                );

        assertThrows(
                IllegalArgumentException.class,
                () -> Main.demonstrateLengthAddition(
                        length1,
                        null
                )
        );
    }

    @Test
    public void testAddition_LargeValues() {

        Length length1 =
                new Length(
                        1e6,
                        Length.LengthUnit.FEET
                );

        Length length2 =
                new Length(
                        1e6,
                        Length.LengthUnit.FEET
                );

        Length result =
                Main.demonstrateLengthAddition(
                        length1,
                        length2
                );

        assertEquals(
                2e6,
                result.getValue(),
                EPSILON
        );
    }

    @Test
    public void testAddition_SmallValues() {

        Length length1 =
                new Length(
                        0.001,
                        Length.LengthUnit.FEET
                );

        Length length2 =
                new Length(
                        0.002,
                        Length.LengthUnit.FEET
                );

        Length result =
                Main.demonstrateLengthAddition(
                        length1,
                        length2
                );

        assertEquals(
                0.003,
                result.getValue(),
                EPSILON
        );
    }
}