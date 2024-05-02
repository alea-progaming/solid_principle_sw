package SOLID_4;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PaymentMethod eWallet= new EWallet();
        PaymentMethod cash = new Cash();
        PaymentMethod credit = new CreditCard();

        Map<String, PaymentMethod> paymentMethods = new HashMap<>();

        paymentMethods.put("ewallet", eWallet);
        paymentMethods.put("cash", cash);
        paymentMethods.put("cc", credit);

        PaymentProcess paymentProcessor = new PaymentProcess(paymentMethods);

        Order order1 = new Order("Order1", 500.00, "ewallet");
        Order order2 = new Order("Order2", 200.00, "cash");
        Order order3 = new Order("Order3", 200.00, "cc");

        paymentProcessor.processPayment(order1);
        System.out.println("---");
        paymentProcessor.processPayment(order2);
        
        paymentProcessor.processPayment(order3);
    }
}