import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> listProd = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию:" + "\n1.Добавить" + "\n2.Показать" + "\n3.Удалить" + "\n4.Найти" + "\nend - для выхода.");

            String input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int oper = Integer.parseInt(input);

            if (oper == 1) {
                System.out.println("Какую покупку хотите добавить?");
                input = scan.nextLine();
                String add = input;
                listProd.add(add);
                List(listProd);
            } else if (oper == 2) {
                List(listProd);
            } else if (oper == 3) {
                List(listProd);
                System.out.println("Какую хотите удалить? Введите номер или название.");
                String del = scan.nextLine();

                try {
                    int delNum = Integer.parseInt(del);
                    System.out.println("Продукт: " + listProd.get(delNum - 1) + ", удалён из списка покупок.");
                    listProd.remove(delNum - 1);
                    List(listProd);
                } catch (NumberFormatException E) {
                    System.out.println("Продукт: " + del + ", удалён из списка покупок.");
                    listProd.remove(del);
                    List(listProd);

                }

            } else if (oper == 4) {
                System.out.println("Введите текст для поиска:");
                input = scan.nextLine();
                String item = input.toLowerCase();
                System.out.println("Найти:");
                for (int i = 0; i < listProd.size(); i++) {
                    String itemLower = listProd.get(i).toLowerCase();
                    if (itemLower.contains(item)) {
                        System.out.println((i + 1) + ". " + listProd.get(i));
                    }
                }

            }
        }
    }

    private static void List(List<String> ArrayList) {
        for (int i = 0; i < ArrayList.size(); i++) {
            System.out.println("Список покупок: " + (i + 1) + ". " + ArrayList.get(i));
        }
    }
}