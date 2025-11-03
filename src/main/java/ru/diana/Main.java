package ru.diana;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

//        Random random = new Random();
//        int num = random.nextInt(1000);
//        System.out.println(num);
//        array1();
        array6();

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

    public static void array() {
        Integer[] a = new Integer[]{1, 2, 3};
        int[] b = new int[10];
        b[0] = 1;
        int[][] asd = new int[10][20];

        List<Integer> z = List.of(1, 2, 3);
        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(0, 1);
        c.addAll(z);

        Random random = new Random();
        random.nextInt();


//        List<String> b = new ArrayList<>();
//        b.get(0);
//        a[0];

    }

    public static void array1() {
        List<Integer> b = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            b.add(random.nextInt(1, 11));
        }
        System.out.println(b);
        for (int i = 0; i < 15; i++) {
            b.set(i, b.get(random.nextInt(15)));
        }
        System.out.println(b);

    }

    public static void array2() {
        List<Integer> b = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            b.add(random.nextInt(1, 11));
        }
        System.out.println(b);
        List<Integer> ind = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ind.add(i);
        }
        int len = 3;
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int a = random.nextInt(len);
            System.out.println(ind.get(a));
            while (true) {
                if (ind.get(a) == i) {
                    a = random.nextInt(len);
                } else {
                    break;
                }
                if (len == 1) {

                }
            }
            System.out.println(ind.get(a));
            c.add(b.get(ind.get(a)));
            ind.remove(a);
            len -= 1;
        }
        System.out.println(c);

    }

    public static void array3() {
        List<Integer> b = new ArrayList<>();
        Random random = new Random();
        int n = random.nextInt(1, 34);
        b.add(n);
        int min = n;
        int max = n;
        for (int i = 0; i < 14; i++) {
            n = random.nextInt(1, 34);
            b.add(n);
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println(b);
        System.out.println("min " + min);
        System.out.println("max " + max);
    }

    public static void array4() {
        List<Integer> b = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> ind = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            b.add(random.nextInt(1, 11));
        }
        System.out.println(b);
        int ind1 = 0;
        for (Integer i : b) {
            if (a.contains(i)) {
                b.set(ind1, 0);
                for (Integer s : ind) {
                    if (i == b.get(s)) {
                        b.set(s, 0);
                    }
                }
            } else {
                a.add(i);
                ind.add(ind1);
            }
            ind1 += 1;
        }
        System.out.println(b);
    }
    public static List<Integer> array5() {
        List<Integer> b = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            b.add(random.nextInt(1, 11));
        }
        System.out.println(b);
        for (int j = 0; j < 16; j++) {
            for (int i = 0; i < 16; i++) {
                if (i < 15) {
                    if (b.get(i) > b.get(i + 1)) {
                        int n = b.get(i);
                        b.set(i, b.get(i + 1));
                        b.set(i + 1, n);
                    }
                }
            }
        }
        System.out.println(b);
        return b;
    }
    public static void array6(){
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        List<Integer> b = array5();
        int len = b.size() / 2;
        for (int i = 0; i < 8; i++) {

        }
    }

}