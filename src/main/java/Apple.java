public class Apple extends Product implements Food {
    //TODO
    // Open Closed Principle - имплементируя интерфейс Food, мы тем самым добавляем
    // классу новую функциональность, не изменяя при этом его код.
    private final String name = "Яблоки";
    private final int price = 150;

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
        System.out.println("Яблоки были съедены");
    }
}
