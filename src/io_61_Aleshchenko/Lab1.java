package io_61_Aleshchenko;

public class Lab1 {
//    #6101
//    O1 = 1 (-)
//    C = 2
//    O2 = 1 (/)
//    тип i та j: char

    public static void main(String[] args) {
//        todo user input
//        todo assign int for char variable
//        final int a = 1;

        final char a = 3;
        final char b = 0;
        final char n = 4;
        final char m = 2;
        final char C = 2;
//        final char a = '1';
//        System.out.print("111");
//        ++a;
//        System.out.println(a++);
//        System.out.println((int) a);

//        System.out.println(Integer.parseInt("1"));

        /*double d = (double) 1 / 2;
        System.out.println(d);
        System.out.printf("%f", (double) 1 / 2);
        System.out.println();*/
        double s = 0;
        for (int i = a; i <= n; ++i) {
            for (int j = b; j <= m; j++) {
                if (j != 0 && i - C != 0) {
                    s += (double) i / j / (i - C);
                } else {
                    System.out.println("Error: division by zero");
//                    todo use return
                    break;
                }
            }
        }
        System.out.println(s);
//        System.out.print("222");


        System.out.println("Done!");
    }
}
