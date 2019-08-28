import com.tw.vapasi.RectangleShape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleShapeTest {
    @Test
    void isLengthGreaterThanWidthTest()
    {
        RectangleShape rectangle = new RectangleShape(6,3);
        assertTrue(rectangle.isLengthGreaterThanWidth());
    }

    @Test
    void isArea8WithInput2and4()
    {
        RectangleShape rectangle = new RectangleShape(4,2);
        assertEquals(8, rectangle.area());
    }

    @Test
    void isPerimeter12WithInput2and4()
    {
        RectangleShape rectangle = new RectangleShape(4.0,2.0);
        assertEquals(12.0,rectangle.perimeter());
    }

}
