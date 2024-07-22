import java.util.Scanner;

public class Main {
    //TODO
    // Magic Numbers Principle - вместо чисел использую константу.
    public static final char RUB = (char) 0x20BD;

    public static void main(String[] args) {
        //TODO
        // Liskov substitution principle - наследники класса Product полностью берут на себя роль родительского класса.
        Product[] products = {new Bread(), new Apple(), new Milk(), new Phone()};
        //TODO
        // Принцип DRY - повторные выводы списка продуктов на экран выношу в специальный метод.
        printProducts(products);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара, его количество  или введите `end` ");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
        printProducts(products);
        printBasket(products);
    }

    private static void printProducts(Product[] products) {
        System.out.println("Список товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void printBasket(Product[] products) {
        int costProducts = 0;
        System.out.println("Ваша корзина: ");
        for (Product product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + " 'количество'= " + product.getCount() + " шт."
                        + " 'цена'= " + product.getPrice() + " " + RUB
                        + " 'стоимость'= " + product.getCount() * product.getPrice() + " " + RUB);
            }
        }
        System.out.println("Итого: " + costProducts + " " + RUB);
    }
}
