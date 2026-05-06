import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // Feet Test Cases

    @Test
    public void testFeetEquality_SameValue() {

        Main.Feet f1 = new Main.Feet(1.0);
        Main.Feet f2 = new Main.Feet(1.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    public void testFeetEquality_DifferentValue() {

        Main.Feet f1 = new Main.Feet(1.0);
        Main.Feet f2 = new Main.Feet(2.0);

        assertFalse(f1.equals(f2));
    }

    @Test
    public void testFeetEquality_NullComparison() {

        Main.Feet f1 = new Main.Feet(1.0);

        assertFalse(f1.equals(null));
    }

    @Test
    public void testFeetEquality_DifferentClass() {

        Main.Feet f1 = new Main.Feet(1.0);

        assertFalse(f1.equals("abc"));
    }

    @Test
    public void testFeetEquality_SameReference() {

        Main.Feet f1 = new Main.Feet(1.0);

        assertTrue(f1.equals(f1));
    }

    // Inches Test Cases

    @Test
    public void testInchesEquality_SameValue() {

        Main.Inches i1 = new Main.Inches(1.0);
        Main.Inches i2 = new Main.Inches(1.0);

        assertTrue(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_DifferentValue() {

        Main.Inches i1 = new Main.Inches(1.0);
        Main.Inches i2 = new Main.Inches(2.0);

        assertFalse(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_NullComparison() {

        Main.Inches i1 = new Main.Inches(1.0);

        assertFalse(i1.equals(null));
    }

    @Test
    public void testInchesEquality_DifferentClass() {

        Main.Inches i1 = new Main.Inches(1.0);

        assertFalse(i1.equals("abc"));
    }

    @Test
    public void testInchesEquality_SameReference() {

        Main.Inches i1 = new Main.Inches(1.0);

        assertTrue(i1.equals(i1));
    }
}