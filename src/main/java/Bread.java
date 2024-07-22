public class Bread extends Product implements Food {
    private final String name = "Хлеб";
    private final int price = 85;

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
        System.out.println("Хлеб был съеден");
    }
}
