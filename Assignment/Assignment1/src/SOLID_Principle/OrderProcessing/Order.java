
package SOLID_Principle.OrderProcessing;

import SOLID_Principle.Application.Cart;
import SOLID_Principle.Payment.PaymentMethod;

public class Order {
    private Cart cart;
    private PaymentMethod paymentMethod;

    public Order(Cart cart, PaymentMethod paymentMethod) {
        this.cart = cart;
        this.paymentMethod = paymentMethod;
    }

    public void processOrder(OrderProcessor orderProcessor) {
       
        orderProcessor.processOrder(this);

        System.out.println("Order processed!");
        paymentMethod.processPayment(cart.getTotalPrice());
    }
}
