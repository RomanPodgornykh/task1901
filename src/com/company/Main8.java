package com.company;

import java.util.Scanner; //Наибольшее число.

public class Main8 {

    public static void main(String[] args) {

        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите Enter: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = scanner.nextInt();
        }
        int max = sourceNumbers[0];
        for (int i = 0; i < size; i++) {
            if (max < sourceNumbers[i])
                max = sourceNumbers[i];
        }
        System.out.println("Наибольшее число:" + max);
    }
}