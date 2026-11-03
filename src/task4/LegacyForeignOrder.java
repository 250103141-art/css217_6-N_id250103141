package task4;

public class LegacyForeignOrder {

    private final   String orderId;
    private final double priceGBP;

    public LegacyForeignOrder(String orderId,
                              double price){
        this.orderId = orderId;
        this.priceGBP = price;
    }
    public String getOrderId() {
        return orderId;
    }
    public double getPriceGBP() {
        return priceGBP;
    }

}
