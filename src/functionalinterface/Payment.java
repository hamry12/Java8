package functionalinterface;

/**
 * Functional Interface: A single abstract method which can be represented using lambda expression;
 * It can have multiple default and static methods as described in below example.
 */

@FunctionalInterface
public interface Payment {

    void processPayment(double amount);

    default double applyCoupon(double amount, double percentage) {
        return 0;
    }

    static void generateReport(String paymentType){
        System.out.println("Report Generated");
    }

}
