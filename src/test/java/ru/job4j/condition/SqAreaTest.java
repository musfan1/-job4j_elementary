package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2square2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenP7K3square2dot296875() {
        int p = 7;
        int k = 3;
        double expected = 2.296875;
        double out = SqArea.square(p, k);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenP14K1square12dot25() {
        int p = 14;
        int k = 1;
        double expected = 12.25;
        double out = SqArea.square(p, k);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }
}