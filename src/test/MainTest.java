import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testEquality_SameValue() {

        Main.Feet f1 = new Main.Feet(1.0);
        Main.Feet f2 = new Main.Feet(1.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquality_DifferentValue() {

        Main.Feet f1 = new Main.Feet(1.0);
        Main.Feet f2 = new Main.Feet(2.0);

        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquality_NullComparison() {

        Main.Feet f1 = new Main.Feet(1.0);

        assertFalse(f1.equals(null));
    }

    @Test
    public void testEquality_NonNumericInput() {

        Main.Feet f1 = new Main.Feet(1.0);

        assertFalse(f1.equals("abc"));
    }

    @Test
    public void testEquality_SameReference() {

        Main.Feet f1 = new Main.Feet(1.0);

        assertTrue(f1.equals(f1));
    }
}