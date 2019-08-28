package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void expect100AreaForSide10()
    {
        Square square = new Square(10);
        Assertions.assertEquals(100.0, square.area());
    }

}
