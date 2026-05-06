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

        Main.Length feet1 =
                new Main.Length(2.0,
                        Main.Length.LengthUnit.FEET);

        Main.Length inches =
                new Main.Length(24.0,
                        Main.Length.LengthUnit.INCHES);

        assertTrue(feet1.equals(inches));
    }
}