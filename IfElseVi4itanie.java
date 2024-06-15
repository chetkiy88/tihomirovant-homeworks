public class IfElseVi4itanie {
    public static void main(String[] args) {
        int x = 1;
        int r = 1;
        int result;


        if (x > r) {
            System.out.println("Результат");
            result = x - r;

        } else if (r > x) {
            System.out.println("Результат");
            result = r - x;
        } else {
            System.out.println("Нет результата");
            result = 0;
        }

        System.out.println("Результат вычитания: ");
        System.out.println(result);
    }
}


