package ru.diana.collection;

import java.util.Collection;
import java.util.Iterator;

public abstract class GenericCustomList<T> implements Collection<T> {
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

    @Override
    public boolean isEmpty() {
        return lenList == 0;
    }

    @Override
    public String toString() {
        return printStorage();
    }



    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public abstract void printClassDescription();

    public static void trz(){
        System.out.println(objectCount);
    }

    /**
     * Выводит элементы списка
     */
    public String printStorage() { //такого у списка нет
        String allStorage = "";
        if (storageCell != null) {
            allStorage = storageCell.printListCell();
            storageCell.printListCell();
        } else {return "[]";}
        return "[" + String.valueOf(storageCell.storage) + allStorage + "]";
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

    public boolean remove(Object value) { //remove
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