import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number = 0;
        int factorial = number;

        for(int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Факториал равен " + factorial);
    }
}

