package HW1;

import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)


public class task1{
    public static void main(String[] args) {
        System.out.print("Введите число => ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int f = 1;
        sum = (n * (n + 1)) / 2;
        System.out.printf("Сумма от 1 до %s равна %s \n", n, sum);
        for(int i=1; i <= n; i++) {
            f = f*i;
        }
        System.out.printf("Произведение от 1 до %s равно %s", n, f);

    }
}