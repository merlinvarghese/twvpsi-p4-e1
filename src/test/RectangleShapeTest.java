import com.tw.vapasi.RectangleShape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleShapeTest {
    @Test
    public void IsLengthGreaterThanWidthTest()
    {
        RectangleShape rectangle = new RectangleShape(6,3);
        assertTrue(rectangle.isLengthGreaterThanWidth());
    }

    @Test
    public void isArea8WithInput2and4()
    {
        RectangleShape rectangle = new RectangleShape(4,2);
        assertEquals(8, rectangle.area());
    }
}
