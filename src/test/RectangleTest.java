import com.tw.vapasi.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleTest {

    //region area
    @Test
    void isLengthGreaterThanWidthTest()
    {//6 3
        Rectangle rectangle =  Rectangle.createRectangle(6,3);
        assertTrue(rectangle.isLengthGreaterThanWidth());
    }

    @Test
    void isArea8WithInput2and4()
    {
        Rectangle rectangle =  Rectangle.createRectangle(4,2);
        assertEquals(8, rectangle.area());
    }
    //endregion

    //region perimeter
    @Test
    void isPerimeter12WithInput2and4()
    {
        Rectangle rectangle =  Rectangle.createRectangle(4.0,2.0);
        assertEquals(12.0,rectangle.perimeter());
    }

    @Test
    void isPerimeterEqualsWithFractionInput()
    {
        Rectangle rectangle =  Rectangle.createRectangle(4.2,2.2);
        assertEquals(12.8,rectangle.perimeter());
    }
    //endregion

}
