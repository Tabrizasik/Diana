package ru.diana.collection;

import java.util.Collection;
import java.util.Iterator;

public class CustomList<T> extends GenericCustomList<T>  {



    @Override
    public boolean add(Object storage) {
//        lenList += 1;
//        if (storageCell == null) { //добавить ошибки(4):UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException
//            storageCell = new CustomListCell<>(storage);
//        } else {
//            storageCell.addNext((T) storage);
//        }
//        objectCount++;
        return true;
    }

    public void printClassDescription() {

    }

    @Override
    public String toString() {

        return "hello \n";
    }

    @Override
    public boolean isEmpty() {
        return false;
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
    public boolean remove(Object o) {
        return false;
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
}