package ru.diana.collection;

public class CustomListCell <T> {
    T storage;
    CustomListCell<T> nextStorageCell;

    public CustomListCell(T storage) {
        this.storage = storage;
    }

//    public void addNext(T storage) {
//        if (nextStorageCell == null) {
//            nextStorageCell = new CustomListCell<>(storage);
//        } else {
//            nextStorageCell.addNext(storage);
//        }
//    }

    public void addNext(T storage) {
        if (nextStorageCell == null) {
            nextStorageCell = new CustomListCell<>(storage);//просто добавляет в конец списка
        } else {
            nextStorageCell.addNext(storage);
        }
    }

    public void addNext2(T storage) {
        if (nextStorageCell == null) {
            nextStorageCell = new CustomListCell<>(storage);//просто добавляет в конец списка
        } else {
            nextStorageCell.addNext(storage);
        }
    }

    public void printListCell() {
        if (nextStorageCell != null) {
            System.out.println(nextStorageCell.storage);
            nextStorageCell.printListCell();
        }
    }

    public void setNext(int index, T newValue){
        if (index != 0) {
            index -= 1;
            nextStorageCell.setNext(index, newValue);
        } else {
            storage = newValue;
        }
    }


    public T removeNext(){
        T firstStorage = nextStorageCell.storage;
        nextStorageCell = nextStorageCell.nextStorageCell;
        return firstStorage;
    }

    public T findPreviousCell(int index){
        if (index - 1 != 0) {
            index -= 1;

            return nextStorageCell.findPreviousCell(index);
        } else {
            return nextStorageCell.removeNext();
        }
    }

    public boolean removeNext2(){
        nextStorageCell = nextStorageCell.nextStorageCell;
        return true;
    }

    public boolean findPreviousCell2(T value) {
        if (nextStorageCell.nextStorageCell != null && nextStorageCell.nextStorageCell.storage != value) {
            nextStorageCell.findPreviousCell2(value);
        } else if (nextStorageCell.nextStorageCell != null && nextStorageCell.nextStorageCell.storage == value){
            return nextStorageCell.removeNext2();
        }
        return false;
    }


}
