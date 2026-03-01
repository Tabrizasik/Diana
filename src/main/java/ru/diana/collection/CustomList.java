package ru.diana.collection;

public class CustomList<T> {
    protected CustomListCell<T> storageCell;
    protected int lenList = 0;

    /**
     * Добавляет элемент в конец списка
     *
     * @param storage Добавляемое значение
     * @return true
     */
    //     * @return Сумма чисел a и b
    //     * @throws IllegalArgumentException Если одно из чисел слишком большое

//    public void add(int index, T storage) { //add с индексом
//        lenList += 1;
//        if (storageCell == null && index == 0) { //добавить ошибки(5):IndexOutOfBoundsException, UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException
//            storageCell = new CustomListCell<>(storage);
//        } else {
//            storageCell.addNext(storage);
//        }
//    } //функция ничего не возвращает
    public boolean add(T storage) {
        lenList += 1;
        if (storageCell == null) { //добавить ошибки(4):UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException
            storageCell = new CustomListCell<>(storage);
        } else {
            storageCell.addNext(storage);
        }
        return true;
    }

    /**
     * Выводит элементы списка
     */
    public void printStorage() { //такого у списка нет
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