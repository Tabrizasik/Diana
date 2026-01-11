package ru.diana.collection;

public class CustomListCell {
    Integer storage;
    CustomListCell nextStorageCell;

    public CustomListCell(int storage) {
        this.storage = storage;
    }

    public void addNext(int storage) {
        if (nextStorageCell == null) {
            nextStorageCell = new CustomListCell(storage);
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

    public void setNext(int index, int newValue){
        if (index != 0) {
            index -= 1;
            nextStorageCell.setNext(index, newValue);
        } else {
            nextStorageCell.storage = newValue;
        }
    }
}
