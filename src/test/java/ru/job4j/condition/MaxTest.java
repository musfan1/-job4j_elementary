package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenLeft2Right1max2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeft2Right10max10() {
        int left = 2;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeft5Right5max5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst1Second2Third3max3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst100Second20Third3max100() {
        int first = 100;
        int second = 20;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst1Second20Third3max20() {
        int first = 1;
        int second = 20;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst10Second10Third10max10() {
        int first = 10;
        int second = 10;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst1Second2ThirdFourth4max4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst100Second20Third3Fourth4max100() {
        int first = 100;
        int second = 20;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst1Second20Third3Fourth4max20() {
        int first = 1;
        int second = 20;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst10Second10Third10Fourth10max10() {
        int first = 10;
        int second = 10;
        int third = 10;
        int fourth = 10;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}