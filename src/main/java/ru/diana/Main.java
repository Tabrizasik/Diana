package ru.diana;

import ru.diana.collection.CustomList;
import ru.diana.collection.CustomListCell;
import ru.diana.collection.GenericCustomList;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        CustomList<Integer> customlist = new CustomList<>();
        for (int i = 0; i < 10; i++) {
            customlist.add(random.nextInt(1, 31));
        }
        System.out.println(customlist);


        Iterator<Integer> itr = customlist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }



//        Map<String, Integer> diana = new HashMap<>();
//        diana.put("abs", 1);
//        diana.put("nbv", 2);
//        diana.put("afawf", 137);
//
//        Iterator<Integer> itr = diana.values().iterator();
//        int i = 0;
//        while (itr.hasNext()) {
//            Integer d = itr.next();
//            i++;
//            if (i == 2) {
//                System.out.println(" aaa " + d);
//            } else {
//                System.out.println(" bbb " + d);
//            }
//        }


////        for(Integer number : list){
////            System.out.print(number );
////        }
//
//        CustomList<Integer> customlist = new CustomList<>();
//
//        customlist.add(1);
//        customlist.add(2);
//        customlist.add(3);
//        customlist.add(4);
//        customlist.add(5);
//        System.out.print(customlist);


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