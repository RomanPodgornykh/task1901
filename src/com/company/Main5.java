package com.company;  //Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целые цисла: ");
        int s=0, p=1;
        for(int i=0; i<args.length; i++)
        {
            int x=Integer.parseInt(args[i]);
            s=s+x;
            p=p*x;
        }
        System.out.println("Сумма = " + s);
        System.out.println("Произведение = "+ p);
    }
}


