package com.company;  //Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целые цисла: ");
        int value = scanner.nextInt();
        int sum = 0;
        int com = 1;
        while (value != 0) {
            sum = sum + value % 10;
            value = value / 10;
        }
        System.out.println("Cумма введённых чисел: " + sum);
        com *= value % 10;
        value = value / 10;

        System.out.print("Произведение введённых чисел: " + com);
    }
}