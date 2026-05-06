import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testFeetEquality() {

        Main.Length feet1 =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.FEET);

        Main.Length feet2 =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.FEET);

        assertTrue(feet1.equals(feet2));
    }

    @Test
    public void testInchesEquality() {

        Main.Length inches1 =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.INCHES);

        Main.Length inches2 =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.INCHES);

        assertTrue(inches1.equals(inches2));
    }

    @Test
    public void testFeetInchesComparison() {

        Main.Length feet =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.FEET);

        Main.Length inches =
                new Main.Length(12.0,
                        Main.Length.LengthUnit.INCHES);

        assertTrue(feet.equals(inches));
    }

    @Test
    public void testFeetInequality() {

        Main.Length feet1 =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.FEET);

        Main.Length feet2 =
                new Main.Length(2.0,
                        Main.Length.LengthUnit.FEET);

        assertFalse(feet1.equals(feet2));
    }

    @Test
    public void testInchesInequality() {

        Main.Length inches1 =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.INCHES);

        Main.Length inches2 =
                new Main.Length(2.0,
                        Main.Length.LengthUnit.INCHES);

        assertFalse(inches1.equals(inches2));
    }

    @Test
    public void testCrossUnitInequality() {

        Main.Length feet =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.FEET);

        Main.Length inches =
                new Main.Length(10.0,
                        Main.Length.LengthUnit.INCHES);

        assertFalse(feet.equals(inches));
    }

    @Test
    public void testMultipleFeetComparison() {

        Main.Length feet =
                new Main.Length(2.0,
                        Main.Length.LengthUnit.FEET);

        Main.Length inches =
                new Main.Length(24.0,
                        Main.Length.LengthUnit.INCHES);

        assertTrue(feet.equals(inches));
    }

    @Test
    public void yardEquals36Inches() {

        Main.Length yard =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.YARDS);

        Main.Length inches =
                new Main.Length(36.0,
                        Main.Length.LengthUnit.INCHES);

        assertTrue(yard.equals(inches));
    }

    @Test
    public void centimeterEqualsPoint393701Inches() {

        Main.Length centimeters =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.CENTIMETERS);

        Main.Length inches =
                new Main.Length(0.393701,
                        Main.Length.LengthUnit.INCHES);

        assertTrue(centimeters.equals(inches));
    }

    @Test
    public void threeFeetEqualsOneYard() {

        Main.Length feet =
                new Main.Length(3.0,
                        Main.Length.LengthUnit.FEET);

        Main.Length yard =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.YARDS);

        assertTrue(feet.equals(yard));
    }

    @Test
    public void thirtyPoint48CmEqualsOneFoot() {

        Main.Length centimeters =
                new Main.Length(30.48,
                        Main.Length.LengthUnit.CENTIMETERS);

        Main.Length feet =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.FEET);

        assertTrue(centimeters.equals(feet));
    }

    @Test
    public void yardNotEqualTo11Inches() {

        Main.Length yard =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.YARDS);

        Main.Length inches =
                new Main.Length(11.0,
                        Main.Length.LengthUnit.INCHES);

        assertFalse(yard.equals(inches));
    }

    @Test
    public void referenceEqualitySameObject() {

        Main.Length feet =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.FEET);

        assertTrue(feet.equals(feet));
    }

    @Test
    public void equalsReturnsFalseForNull() {

        Main.Length feet =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.FEET);

        assertFalse(feet.equals(null));
    }

    @Test
    public void reflexiveSymmetricAndTransitiveProperty() {

        Main.Length yard =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.YARDS);

        Main.Length feet =
                new Main.Length(3.0,
                        Main.Length.LengthUnit.FEET);

        Main.Length inches =
                new Main.Length(36.0,
                        Main.Length.LengthUnit.INCHES);

        assertTrue(yard.equals(feet));
        assertTrue(feet.equals(inches));
        assertTrue(yard.equals(inches));
    }

    @Test
    public void differentValuesSameUnitNotEqual() {

        Main.Length yard1 =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.YARDS);

        Main.Length yard2 =
                new Main.Length(2.0,
                        Main.Length.LengthUnit.YARDS);

        assertFalse(yard1.equals(yard2));
    }

    @Test
    public void crossUnitEqualityDemonstrateMethod() {

        Main.Length feet =
                new Main.Length(1.0,
                        Main.Length.LengthUnit.FEET);

        Main.Length inches =
                new Main.Length(12.0,
                        Main.Length.LengthUnit.INCHES);

        assertTrue(
                Main.demonstrateLengthEquality(feet, inches)
        );
    }
}