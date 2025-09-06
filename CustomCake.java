public class CustomCake extends Cake {
    private double weight;
    private double fee;

    public CustomCake(String name, double price, double weight, double fee) {
        super(name);
        this.price = price;
        this.weight = weight;
        this.fee = fee;
    }

    @Override
    public double calculatePrice() {
        return (this.price * this.weight) + this.fee;
    }
}