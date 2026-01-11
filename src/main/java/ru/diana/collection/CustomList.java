package ru.diana.collection;

public class CustomList {
    CustomListCell storageCell;
    int lenList = 0;

    public void add(int storage) {
        lenList += 1;
        if (storageCell == null) {
            storageCell = new CustomListCell(storage);
        } else {
            storageCell.addNext(storage);
        }
    }

    public void printStorage() {
        System.out.println("Начало нового списка");
        if (storageCell != null) {
            System.out.println(storageCell.storage);
            storageCell.printListCell();
        }
    }

    public void size() {
        System.out.println("Длина списка " + lenList);
    }

    public void set(int index, int newValue) {
        if (index >= 0 && index < lenList) {
            if (index != 0) {
                index -= 1;
                storageCell.setNext(index, newValue);
            } else {
                storageCell.storage = newValue;
            }
        } else {
            System.out.println("Неправильны индекс " + index);
        }
    }
}