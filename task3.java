package HW1;

import java.util.Scanner;

// Реализовать простой калькулятор

public class task3 {
    public static void main(String[] args){
        System.out.print("Введите первое число => ");
        Scanner num1 = new Scanner(System.in);
        int n1 = num1.nextInt();
        System.out.print("Введите второе число => ");
        Scanner num2 = new Scanner(System.in);
        int n2 = num2.nextInt();
        System.out.print("Что будем делать? \n"
                            + " '+' => 1\n"
                            + " '-' => 2\n"
                            + " '*' => 3\n"
                            + " '/' => 4\n");
        Scanner step = new Scanner(System.in);
        int s = step.nextInt();
        if (s == 1){
            System.out.printf("%s + %s = %s", n1, n2, n1 + n2);
        }
        if (s == 2){
            System.out.printf("%s - %s = %s", n1, n2, n1 - n2);
        }
        if (s == 3){
            System.out.printf("%s * %s = %s", n1, n2, n1 * n2);
        }
        if (s == 4){
            System.out.printf("%s / %s = %s", n1, n2, n1 / n2);
        }
           
    }
}
