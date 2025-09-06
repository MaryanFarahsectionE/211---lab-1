public class Main {
    public static void main(String[] args) {

        Cake[] cakes = new Cake[20];

        cakes[0] = new ReadyCake("Chocolate Cake", 25.0);
        cakes[1] = new CustomCake("Birthday Cake", 40.0, 2.5, 15.0);
        cakes[2] = new ReadyCake("Carrot Cake", 30.0);
        cakes[3] = new CustomCake("Wedding Cake", 50.0, 5.0, 50.0);
        cakes[4] = new ReadyCake("Vanilla Cake", 20.0);
        cakes[5] = new CustomCake("Anniversary Cake", 35.0, 1.5, 10.0);
        cakes[6] = new ReadyCake("Red Velvet Cake", 35.0);
        cakes[7] = new CustomCake("Graduation Cake", 45.0, 3.0, 20.0);
        cakes[8] = new ReadyCake("Lemon Drizzle Cake", 22.0);
        cakes[9] = new CustomCake("Baby Shower Cake", 38.0, 2.0, 18.0);
        cakes[10] = new ReadyCake("Cheesecake", 40.0);
        cakes[11] = new CustomCake("Corporate Event Cake", 42.0, 4.0, 30.0);
        cakes[12] = new ReadyCake("Coffee Cake", 18.0);
        cakes[13] = new CustomCake("Holiday Cake", 48.0, 3.5, 25.0);
        cakes[14] = new ReadyCake("Strawberry Shortcake", 28.0);
        cakes[15] = new CustomCake("Engagement Cake", 55.0, 4.5, 40.0);
        cakes[16] = new ReadyCake("Banana Bread Cake", 15.0);
        cakes[17] = new CustomCake("Retirement Cake", 30.0, 2.8, 12.0);
        cakes[18] = new ReadyCake("Angel Food Cake", 23.0);
        cakes[19] = new CustomCake("Christening Cake", 33.0, 1.8, 14.0);

        double totalPrice = 0.0;
        
        for (int i = 0; i < cakes.length; i++) {
            if (cakes[i] != null) {
                totalPrice += cakes[i].calculatePrice();
            }
        }

        System.out.println("Total price for all cakes: $" + String.format("%.2f", totalPrice));
    }
}