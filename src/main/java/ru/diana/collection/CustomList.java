package ru.diana.collection;

import java.util.Collection;
import java.util.Iterator;

public class CustomList<T> extends GenericCustomList<T>  {



    @Override
    public boolean add(T storage) {
        lenList += 1;
        if (storageCell == null) { //добавить ошибки(4):UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException
            storageCell = new CustomListCell<>(storage);
        } else {
            storageCell.addNext((T) storage);
        }
        objectCount++;
        return true;
    }

    public void printClassDescription() {

    }


}