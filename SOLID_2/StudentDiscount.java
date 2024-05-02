package SOLID_2;

public class StudentDiscount implements Discount{

    @Override
    public double calculateDiscount(double amount) {
        return amount * .05;
    }
    
}
