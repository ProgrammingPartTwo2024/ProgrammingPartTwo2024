package io_61_Aleshchenko.extra;

public class Task {
    public static void main(String[] args) {
//        ==================== Завдання: змінити(!) один(!) символ, щоб вивелося 20 зірочок
//        (в Java - 2 розв'язки, а в С/С++ - 3 розв'язки)
        int n = 20;
        for (int i = 0; i < n; i--) {
            print("*");
        }
        //=====================
        /*int a = 1;
        if (a==n) {

        }*/
    }

    private static void print(String s) {
        System.out.print(s);
    }
}
