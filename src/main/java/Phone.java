public class Phone extends Product implements Device, Mobile {
    //TODO
    // Interface Segregation Principle - здесь я применяю разные интерфейсы
    // вместо одного большого и многофункционального.
    // Dependency Inversion Principle - теперь, разделяя интерфейсы,я не завишу от их общей функциональности и
    // могу поменять один интерфейс на другой.
    private final String name = "Мобильный телефон";
    private final int price = 6500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void enable() {
        System.out.println("Телефон включен");
    }

    @Override
    public void carry() {
        System.out.println("Телефон доступен");
    }
}
