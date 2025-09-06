public abstract class Cake {
    private String name;
    protected double price;

    public Cake(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePrice();
}