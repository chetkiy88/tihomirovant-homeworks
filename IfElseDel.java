public class IfElseDel {
    public static void main(String[] args) {
        int x = 11;
        int r = 11;
        int result;


        if (x > r) {
            System.out.println("Результат");
            result = x / r;

        } else if (r > x) {
            System.out.println("Результат");
            result = r / x;
        } else {
            System.out.println("Нет результата");
            result = 1;
        }

        System.out.println("Результат деления: ");
        System.out.println(result);
    }
}

