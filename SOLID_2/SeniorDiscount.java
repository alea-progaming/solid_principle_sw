package SOLID_2;

public class SeniorDiscount implements Discount{

    @Override
    public double calculateDiscount(double amount) {
        return amount * .10;
    }

}