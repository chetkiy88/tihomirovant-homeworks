import java.util.Scanner;

public class Cikl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Пожалуйста, введите второе число:");
        int b = scanner.nextInt();

        int cash;

        for (cash=a; cash<=b; cash=cash+1){
            System.out.println(cash);
        }


        System.out.println("Cколько чисел");
        System.out.println(b-a+1);
        System.out.println("Я молодец");
    }
}