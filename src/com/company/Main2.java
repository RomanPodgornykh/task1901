package com.company;   //Отобразить в окне консоли аргументы командной строки в обратном порядке

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Введите последовательность чисел: ");

            Scanner scan = new Scanner(System.in);
            String name = scan.next();


            for (int i = args.length - 1; i >= 0; i--) {
                System.out.println(args[i]);
            }
        }
    }