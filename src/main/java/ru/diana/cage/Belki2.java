package ru.diana.cage;

public class Belki2 extends Belki {

    Integer d = 7;

    public Belki2(int a, int d) {
        super(a);
        this.d = d;
    }

    public Belki2() {
        super();
    }

    public Belki2(int a) {
        super(a);
    }

    @Override
    public void consoleOut() {
        System.out.println(a + " " + d);
    }

}