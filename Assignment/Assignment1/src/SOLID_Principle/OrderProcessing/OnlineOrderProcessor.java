package SOLID_Principle.OrderProcessing;

public class OnlineOrderProcessor implements OrderProcessor {

    @Override
    public void processOrder(Order order) {
        System.out.println("Online order processed.");
    }

}
