package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX0Y0X2Y0Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenX1Y2X3Y4Then2dot83() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double expected = 2.83;
        double out = Point.distance(x1, y1, x2, y2);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenX5Y6X17Y18Then16dot97() {
        int x1 = 5;
        int y1 = 6;
        int x2 = 17;
        int y2 = 18;
        double expected = 16.97;
        double out = Point.distance(x1, y1, x2, y2);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }
}