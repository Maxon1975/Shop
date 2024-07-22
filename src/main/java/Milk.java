public class Milk extends Product implements Food {
    //TODO
    // Single Responsibility Principle - класс Milk описывает не все продукты,
    // а только товар (класс) "Молоко".
    private final String name = "Молоко";
    private final int price = 300;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Молоко выпито");
    }
}
