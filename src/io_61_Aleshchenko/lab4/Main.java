package io_61_Aleshchenko.lab4;

import java.util.HashSet;
import java.util.Set;

//todo find real cases of using protected and private
/*public*//*private*//*final*//*protected*/ class Main/*2*/ {
    //    todo 1: 5 fields
    //    todo 2: array+sort
    //    todo 3: JCC



    public static void main(String[] args) {
        /*for (int i = 0; i < 19; i++) {
            System.out.println(i);
        }*/

        int[] arr = {1, 2, 3, 4, 5};
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        Computer/*<Integer>*/ computer = new Computer(true, 11);
        Computer computer2 = new Computer(false, 0);
//        computer.turnedOn = true;
//        computer.setTurnedOn(true);

        /*Computer<Double> doubleComputer = new Computer();

        Set<Integer> arr2 = new HashSet();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        for (int element : arr2) {
            System.out.println(element);
        }*/


        /*System.out.println("Hello, World!");
//        Computer.turnedOn = true;
//        Computer computer = null;
        Computer computer = new Computer();
        Computer computer2 = new Computer();
//        !!!
//        computer.turnedOn = true;

        System.out.println(Computer.i);
        System.out.println(computer.i);
        System.out.println(computer2.i);
        System.out.println(computer.turnedOn);
        System.out.println(computer2.turnedOn);
//        Computer.i = 2000;
        computer.turnedOn = true;

        System.out.println(Computer.i);
        System.out.println(computer.i);
        System.out.println(computer2.i);
        System.out.println(computer.turnedOn);
        System.out.println(computer2.turnedOn);*/
//        !!!
        /*computer.i = 3000;

        System.out.println(Computer.i);
        System.out.println(computer.i);
        System.out.println(computer2.i);
//        !!!
        computer2.i = 4000;

        System.out.println(Computer.i);
        System.out.println(computer.i);
        System.out.println(computer2.i);*/
    }

    protected class Main4 {

    }
}

/*class Main5 extends Main2 {


}*/
