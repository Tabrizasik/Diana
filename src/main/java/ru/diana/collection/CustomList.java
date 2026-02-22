package ru.diana.collection;

public class CustomList<T> {
    private CustomListCell<T> storageCell;
    private int lenList = 0;

    /**
     * Добавляет элемент в конец списка
     *
     * @param storage Добавляемое значение
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

    public boolean add(T storage) { //просто add
        lenList += 1;
        if (storageCell == null) { //добавить ошибки(4):UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException
            storageCell = new CustomListCell<>(storage);
        } else {
            storageCell.addNext2(storage);
        }
        return true; //функция возвращает true
    }

    public void printStorage() { //такого у списка нет
        System.out.println("Начало нового списка");
        if (storageCell != null) {
            System.out.println(storageCell.storage);
            storageCell.printListCell();
        }
    }

    public int size() { //не знаю что такое abstract int
        return lenList;//функция возвращает число длины списка
    }

    public void set(int index, T newValue) { //добавить ошибки(4):UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException
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

    public T remove(int index) throws IllegalArgumentException{
        if (index >= 0 && index < lenList) { //проверка правильности индекса
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
        }else {
            throw new IllegalArgumentException("Неправильны индекс " + index);
        }
    }

    public boolean remove(T value){ //remove Удаляет первое появление указанного элемента из этого списка, если он присутствует
        //добавить ошибки(3):ClassCastException, NullPointerException, UnsupportedOperationException
        if (storageCell.storage == value){
            lenList -= 1;
            storageCell = storageCell.nextStorageCell;
            return true;
        }else if (storageCell.nextStorageCell.storage == value) {
            lenList -= 1;
            return storageCell.removeNext2();
        } //ошибка с size
        return storageCell.findPreviousCell2(value);//функция возвращает true, если элемент был удалён, и false, если элемента нету в списке
        }
    }