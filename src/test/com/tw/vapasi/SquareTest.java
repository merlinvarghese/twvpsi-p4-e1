package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    void expect100AreaForSide10()
    {
        Square square = new Square(10);
        assertEquals(100.0, square.area());
    }

    @Test
    void expectPerimeter8WithInput2()
    {
        Square square = new Square(2);
        assertEquals(8,square.perimeter());
    }

}
