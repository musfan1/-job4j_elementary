package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol && i < input.length() - 1) {
                counter++;
            } else {
                result = result + symbol + counter;
            }
        }
        return result;
    }
}
