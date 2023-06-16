package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX0Y0X2Y0Then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double expected = 2;
        double out = point1.distance(point2);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenX1Y2X3Y4Then2dot83() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        double expected = 2.83;
        double out = point1.distance(point2);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenX5Y6X17Y18Then16dot97() {
        Point point1 = new Point(5, 6);
        Point point2 = new Point(17, 18);
        double expected = 16.97;
        double out = point1.distance(point2);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }
}