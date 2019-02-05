package com.company; //Ввести с консоли n целых чисел. На консоль вывести: Четные и нечетные числа.

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        System.out.print("Введите целые цисла: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int[] sourceNumbers = new int[number];
        for (int i = 0; i < number; i++) {
            sourceNumbers[i] = scan.nextInt();
        }
        for (int i = 0; i < number; i++)
            if (sourceNumbers[i] % 2 != 0) {
                System.out.println("Нечётное число:" + sourceNumbers[i]);
            } else if (sourceNumbers[i] % 2 == 0) {
                System.out.println("Чётное число:" + sourceNumbers[i]);
            }
    }

}
