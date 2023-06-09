package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Karim Benzema";
        names[1] = "Robert Lewandowski";
        names[2] = "Kylian Mbappe";
        names[3] = "Kevin De Bruyne";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
