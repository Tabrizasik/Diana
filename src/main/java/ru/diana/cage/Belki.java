package ru.diana.cage;

public class Belki {

    protected int a = 3;

    public Belki(int a) {
        this.a = a;
    }

    public  Belki(){
        consoleOut();
    }

    public void consoleOut(){
        System.out.println(a);
    }
}