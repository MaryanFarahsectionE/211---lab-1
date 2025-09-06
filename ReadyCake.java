public class ReadyCake extends Cake {
    public ReadyCake(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}