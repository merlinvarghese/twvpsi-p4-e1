import com.tw.vapasi.RectangleShape;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class RectangleShapeTest {
    @Test
    public void IsLengthGreaterThanWidthTest()
    {
        RectangleShape rectangle = new RectangleShape();
        assertEquals(true, rectangle.isLengthGreaterThanWidth(6,3));

    }

}
