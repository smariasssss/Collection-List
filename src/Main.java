import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = new ArrayList<>();
        products.add("Молоко");
        products.add("Хлеб");
        products.add("Яйца");

        int[] list = new int[3];
        List<String> commands = Arrays.asList("Добавить", "Показать", "Удалить");

        while (true) {
            System.out.println("Выберите операцию:");
            int input = scanner.nextInt();
            int productCount = 0; // итог

            if (input == 1) {
                System.out.println("Какую покупку хотите добавить?");
                int bought = scanner.nextInt();
                productCount++;
                System.out.println("Итого в списке покупок: " + productCount);
            }

            if (input == 2) {
                for (int i = 0; i < products.size(); i++) {
                    System.out.println((i+1) + "." + " " + products.get(i));
                }
            }

            if (input == 3) {
                System.out.println("Список покупок: ");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println((i+1) + "." + " " + products.get(i));
                }
                System.out.println("Какую покупку хотите удалить?");
                int bought = scanner.nextInt();
                System.out.println("Покупка " + bought + " удалена, список покупок:" );
            }

        }

    }
}
