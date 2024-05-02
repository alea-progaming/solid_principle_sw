package SOLID_2;

public class Customer {
    private String name;
    private Discount discountType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name, Discount discountType) {
        this.name = name;
        this.discountType = discountType;
    }

    public double applyDiscount(double amount){
        double discount = discountType.calculateDiscount(amount);
        return amount - discount;
    }
}
