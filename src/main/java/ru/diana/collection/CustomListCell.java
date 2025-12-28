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

}
