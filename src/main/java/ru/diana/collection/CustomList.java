package ru.diana.collection;

public class CustomList <T>{
    private CustomListCell<T> storageCell;
    private int lenList = 0;

    /**
     * Добавляет элемент в конец списка
     *
     * @param storage Добавляемое значение
     */
    //     * @return Сумма чисел a и b
    //     * @throws IllegalArgumentException Если одно из чисел слишком большое
    public void add(T storage) {
        lenList += 1;
        if (storageCell == null) {
            storageCell = new CustomListCell<>(storage);
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

    public void set(int index, T newValue) {
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

    public void remove(int index){
        if (index >= 0 && index < lenList){
            lenList -= 1;
            if (index != 0 && index - 1 != 0) {
                index -= 1;
                storageCell.findPreviousCell(index);
            } else if (index - 1 == 0) {
                storageCell.removeNext();
            } else {
                System.out.println("Удалённый элемент " + storageCell.storage);
                storageCell = storageCell.nextStorageCell;
            }
        }else {
            System.out.println("Неправильны индекс " + index);
        }
    }
}