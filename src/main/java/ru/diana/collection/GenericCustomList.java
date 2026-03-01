package ru.diana.collection;

import java.util.Collection;

public abstract class GenericCustomList<T> implements Collection {
    protected CustomListCell<T> storageCell;
    protected int lenList = 0;

    protected static Integer objectCount = 0;
    /**
     * Добавляет элемент в конец списка
     *
     * @param storage Добавляемое значение
     * @return true
     */

    public abstract boolean add(T storage);

    public abstract void printClassDescription();

    public static void trz(){
        System.out.println(objectCount);
    }

    /**
     * Выводит элементы списка
     */
    public final void printStorage() { //такого у списка нет
        System.out.println("Начало нового списка");
        if (storageCell != null) {
            System.out.println(storageCell.storage);
            storageCell.printListCell();
        }
    }

    /**
     * Возвращает длину списка
     *
     * @return длина списка
     */

    public int size() { //не знаю что такое abstract int
        return lenList;//функция возвращает число длины списка
    }

    /**
     * Заменяет значения по индексу на новое
     *
     * @param index    индекс элемента
     * @param newValue новое значение
     * @throws IllegalArgumentException если index меньше 0 или больше длины списка
     */

    public void set(int index, T newValue) {
        checkIndex(index);
        storageCell.setNext(index, newValue);
    }

    /**
     * Удаляет значения по индексу
     *
     * @param index индекс элемента для удаления
     * @return удалённое значение
     * @throws IllegalArgumentException если index меньше 0 или больше длины списка
     */

    public T remove(int index) {
        checkIndex(index);//проверка правильности индекса
        lenList -= 1;
        if (index > 1) { //элемент второй или дальше
            index -= 1;
            return storageCell.findPreviousCell(index);
        } else if (index == 1) { // элемент второй
            return storageCell.removeNext();
        } else { // первый элемент
            T firstStorage = storageCell.storage;
            storageCell = storageCell.nextStorageCell;
            return firstStorage;
        }

    }

    /**
     * Удаляет первое появление указанного элемента из этого списка, если он присутствует
     *
     * @param value значение которое нужно удалить
     * @return true, если элемент был удалён, и false, если элемента нету в списке
     */

    public boolean remove(T value) { //remove
        //добавить ошибки(3):ClassCastException, NullPointerException, UnsupportedOperationException
        if (storageCell.storage == value) {
            lenList -= 1;
            storageCell = storageCell.nextStorageCell;
            return true;
        } else if (storageCell.nextStorageCell.storage == value) {
            lenList -= 1;
            return storageCell.removeNext2();
        } //ошибка с size
        return storageCell.findPreviousCell2(value);
    }

    protected void checkIndex(int index) throws IllegalArgumentException {
        if (index < 0 || index >= lenList) {
            throw new IllegalArgumentException("Неправильны индекс " + index);
        }
    }


}