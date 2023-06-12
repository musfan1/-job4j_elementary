package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] rsl = new int[0];
        double half = target / 2.0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > half) {
                break;
            } else {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == target) {
                        rsl = new int[2];
                        rsl[0] = i;
                        rsl[1] = j;
                        break;
                    }
                }
            }
        }
        return rsl;
    }
}
