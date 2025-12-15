package ru.diana;

import ru.diana.cage.Array;
import ru.diana.cage.Belki;
import ru.diana.cage.Belki2;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Belki f = new Belki(6);
        f.consoleOut();

        f = new Belki2(8,9);
        f.consoleOut();

        Array z = new Array();
        z.findMinMax();
        z.findMinMax(-67);
        z.findMinMax(36);

//        Random random = new Random();
//        int num = random.nextInt(1000);
//        System.out.println(num);
//        array1();
//        array6();
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

    public static void numbers(int b) {
        int result = 0;
        for (int i = 1; i <= b; i++) {
            String num = String.valueOf(i);
            for (int n = 0; n < num.length(); n++) {
                if (num.charAt(n) == '3') {
                    result += 1;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static void numbers_2(int a, int b) {
        a += b;
        b = a - b;
        a -= b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void plane(double aircraftSpeed, double windSpeed, double s) {
        double t1 = 2 * s / aircraftSpeed;
        double t2 = s / (aircraftSpeed + windSpeed) + (s / (aircraftSpeed - windSpeed));
        System.out.println(t2 - t1);
    }

    public static void shipment(int trucks, double s) {
        double result = 0;
        for (int i = 1; i <= trucks; i++) {
            result += s / i;
        }
        System.out.println(result);
    }

    public static void shipmentConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество грузовиков");
        int trucks = scanner.nextInt();
        System.out.println("Введите максимальное растояние");
        int s = scanner.nextInt();
        double result = 0;
        for (int i = 1; i <= trucks; i++) {
            result += s / i;
        }
        System.out.println(result);
    }
}