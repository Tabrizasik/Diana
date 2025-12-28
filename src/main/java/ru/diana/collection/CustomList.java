package ru.diana.collection;

public class CustomList {
    CustomListCell storageCell;

    public void add(int storage){
        if (storageCell == null){
            storageCell = new CustomListCell(storage);
        } else{
            storageCell.addNext(storage);
        }
    }

    public void printStorage(){
        System.out.println("Начало нового списка");
        if (storageCell != null){
            System.out.println(storageCell.storage);
            storageCell.printListCell();
        }
    }
}