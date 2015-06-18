public enum Menu{
    PIZZA(2.50),
    ICE_CREAM(2.00),
    SODA(1.50),
    TV(1000.00);

    public final double price;

    Menu(double price){
        this.price = price;
    }

    public double price() { return price;}


}


