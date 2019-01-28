package com.company; //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

public class Main3 {
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : x) {
            System.out.println(i);
        }
        for (int i : x) {
            System.out.print(i);
        }
    }
}
