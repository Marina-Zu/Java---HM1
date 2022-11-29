package HW1;

//Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= (i/2) + 1; j++){
                if (i % j == 0) {
                    count += 1;
            }
            }
            if (count == 0){
                System.out.print(i + " ");
            }
        }

    }
}
