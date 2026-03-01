package ru.diana.collection;

public class CustomStack<T> extends GenericCustomList<T> {

    /**
     * Добавляет элемент в начало списка
     *
     * @param storage Добавляемое значение
     * @return true
     */

    public boolean add(T storage) {
        lenList += 1;
        CustomListCell<T> newFirstElement = new CustomListCell<>(storage);
        newFirstElement.nextStorageCell = storageCell;
        storageCell = newFirstElement;
        return true;
    }

    public void printClassDescription() {
        System.out.println("Добавляет все элементы в начало списка");
    }
}

