package ru.diana.collection;

public class CustomListCell <T> {
    T storage;
    CustomListCell<T> nextStorageCell;

    public CustomListCell(T storage) {
        this.storage = storage;
    }

    public void addNext(T storage) {
        if (nextStorageCell == null) {
            nextStorageCell = new CustomListCell<>(storage);
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
            nextStorageCell.storage = newValue;
        }
    }

    public void removeNext(){
        System.out.println("Удалённый элемент " + nextStorageCell.storage);
        nextStorageCell = nextStorageCell.nextStorageCell;
    }

    public void findPreviousCell(int index){
        if (index - 1 != 0) {
            index -= 1;
            nextStorageCell.findPreviousCell(index);
        } else {
            nextStorageCell.removeNext();
        }
    }
}
