package SOLID_Principle.Application;

import SOLID_Principle.Notification.GP;
import SOLID_Principle.Notification.GmailAndGP;
import SOLID_Principle.OrderProcessing.OnlineOrderProcessor;
import SOLID_Principle.OrderProcessing.Order;
import SOLID_Principle.OrderProcessing.OrderProcessor;
import SOLID_Principle.Payment.BkashPayment;
import SOLID_Principle.Payment.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Coffee", 2.5);
        Product product2 = new Product("Tea", 1.5);
        Product product3 = new Product("Chocolate", 3.0);

        Cart cart = new Cart();

        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);

        PaymentMethod paymentMethod = new BkashPayment();

        Order order = new Order(cart, paymentMethod);
        OrderProcessor orderProcessor = new OnlineOrderProcessor();

        order.processOrder(orderProcessor);

        GmailAndGP user = new GmailAndGP();

        GP user2 = new GP();

        user.sendEmail();
        user.sendSMS();

        user2.sendSMS();

    }
}
