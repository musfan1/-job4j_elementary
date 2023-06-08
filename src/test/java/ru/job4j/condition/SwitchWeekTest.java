package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void when0() {
        int day = 0;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when4() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when5() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when6() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when7() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when8() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }
}