import java.util.Scanner;

public class IfElseStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите первое число:");
        long a = scanner.nextLong();
        System.out.println("Пожалуйста, введите второе число:");
        long b = scanner.nextLong();
        long result;

        if (a>b) {
            System.out.println("Первое число больше второго, вычитаем из первого второе");
            result = a - b;
        } else if (b>a) {
                System.out.println("Второе число больше первого, вычитаем из второго первое");
                result = b - a;
        } else {
            System.out.println("Оба числа равны");
            result = 0;
        }

        System.out.println("Результат вычитания: ");
        System.out.println(result);


    }
}
