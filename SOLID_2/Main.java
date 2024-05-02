package SOLID_2;

public class Main {
    public static void main(String[] args) {
        Customer student = new Customer("Mika", new StudentDiscount());
        Customer senior = new Customer("Precy", new SeniorDiscount());
        Customer regular = new Customer("Shawn", new RegularDiscount());

        System.out.println("---Applied discounts---");
        System.out.println(student.getName() + "'s discount: " + student.applyDiscount(100));
        System.out.println(senior.getName() + "'s discount: " + senior.applyDiscount(100));
        System.out.println(regular.getName() + "'s discount: " + regular.applyDiscount(100));
    }
}
