package ru.diana.cage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Array {
    List<Integer> b;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int arraySize;

    public Array(){
        System.out.println("Введите размер массива: ");
        this.arraySize = scanner.nextInt();
    }

    public void getRandomArray(int arraySize) {
        b = new ArrayList<>();
        if (arraySize < 1) {
            arraySize = this.arraySize;
        }
        for (int i = 0; i < arraySize; i++) {
            b.add(random.nextInt(1, 31));
        }
        System.out.println("Длина массива " + b.size());
    }

    /*
    //файл "Диана 2" Перемешать его элементы случайным образом так, чтобы каждый элемент оказался на новом месте, но сделано неправильно.
    public void array1() {
        getRandomArray();
        System.out.println(b);
        for (int i = 0; i < b.arraySize(); i++) {
            b.set(i, b.get(random.nextInt(15)));
        }
        System.out.println(b);

    }

    //Попытка № 2 файл "Диана 2" Перемешать его элементы случайным образом так, чтобы каждый элемент оказался на новом месте, но сделано неправильно.
    public void array2() {
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
*/

    public void findMinMax() {
        findMinMax(arraySize);
    }

    //файл "Диана 2" Найти максимальное и минимальное значение.
    public void findMinMax(int arraySize) {
        getRandomArray(arraySize);
        System.out.println(b);
        int min = b.get(0);
        int max = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            if (b.get(i) > max) {
                max = b.get(i);
            } else if (b.get(i) < min) {
                min = b.get(i);
            }

        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }

    public void replaceValuesWithZero() {
        replaceValuesWithZero(arraySize);
    }

    //файл "Диана 2" Заменить повторяющиеся значения нулями.
    public void replaceValuesWithZero(int arraySize) {
        List<Integer> a = new ArrayList<>();
        List<Integer> ind = new ArrayList<>();
        getRandomArray(arraySize);
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

    public void sortAsc() {
        sortAsc(arraySize);
    }

    //файл "Диана 2" Расположить числа по возрастанию.
    public List<Integer> sortAsc(int arraySize) {
        getRandomArray(arraySize);
        System.out.println(b);
        for (int j = 0; j < b.size(); j++) {
            for (int i = 0; i < b.size() + 1; i++) {
                if (i < b.size() - 1) {
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

    public void findInt() {
        findInt(arraySize);
    }

    //Поиск числа в отсортированом массиве.
    public void findInt(int arraySize) {
        int s = scanner.nextInt();
        List<Integer> b = sortAsc(arraySize);
        int left = 0;
        int right = b.size() - 1;
        if (b.contains(s)) {
            while (true) {
                int middle = (left + right) / 2;
                if (b.get(middle) == s) {
                    List<Integer> n = new ArrayList<>(b);
                    n.remove(middle);
                    if (n.contains(s)) {
                        while (b.get(middle) == b.get(middle - 1)) {
                            middle -= 1;
                        }
                    }
                    System.out.println("Индекс первого числа " + s + " в списке - " + middle);
                    break;
                } else if (b.get(middle) < s) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        } else {
            System.out.println("Такого числа нет в списке");
        }
    }
}
