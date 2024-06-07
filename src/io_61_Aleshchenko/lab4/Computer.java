package io_61_Aleshchenko.lab4;

public class Computer/*<T>*/ {
//    todo play with access modifiers
    private boolean turnedOn;
    private int power/* = 10*/;
//    todo box/system_block/PC_case

    static final int MAX_POWER = 1000;
    static int i/* = 0*/;
//    T t;
//    todo Integer (copy and reference)

    public Computer(boolean turnedOn, int power) {
        this.turnedOn = turnedOn;
        this.power = power;
    }

    public Computer() {
        this.turnedOn = true;
        this.power = 10;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Computer.i = i;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    /*@Override
    public String toString() {
        return "Computer{" +
                "turnedOn=" + turnedOn +
                ", power=" + power +
                '}';
    }*/

    @Override
    public String toString() {
        return "Computer{" +
                "turnedOn=" + turnedOn +
                ", power=" + power +
                '}';
    }


}
