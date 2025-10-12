package ru.diana;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
//        System.out.println(nutsInMinute(1.5, 1.5));
//        System.out.println(minimum(new int[]{7, 9, 5, 6, 3, 4, 1, 8}));
    }

    public static double nutsInMinute(double belki, double minute) {
        double v = (double) 2 / 3;
        return v * minute * belki;
    }

    public static int minimum(int[] numbers) {
        int minimum = numbers[0];
        for (int number : numbers) {
            if (minimum > number) {
                minimum = number;
            }

        }
        return minimum;

    }



}