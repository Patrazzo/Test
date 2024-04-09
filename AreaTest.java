import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AreaTest {

    @Test
    public void TriangleTests() {
        assertEquals(6.0, TriangleAreaCalculator.calculateArea(3.0, 4.0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(-1.0, 4.0));
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(3.0, -4.0));
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(0.0, 4.0));
    }

    @Test
    public void RectangleTests() {
        assertEquals(12.0, RectangleAreaCalculator.calculateArea(3.0, 4.0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> RectangleAreaCalculator.calculateArea(-3.0, 4.0));
        assertThrows(IllegalArgumentException.class, () -> RectangleAreaCalculator.calculateArea(3.0, -4.0));
        assertThrows(IllegalArgumentException.class, () -> RectangleAreaCalculator.calculateArea(-3.0, -4.0));
    }
}