package functionalinterface;

public class PaymentProcessor {
    public static void main(String[] args) {
        double totalAmount=999.99;

        // 1. Generic Implementation

        Payment upiPayment= new UPI();
        double discountedPrice=upiPayment.applyCoupon(totalAmount, 5);
        upiPayment.processPayment(discountedPrice);


        // 2. Implementation using Lambda
        Payment cardsPayment= (amount)->{
            System.out.println("Amount "+amount+" paid using Cards");
        };
        cardsPayment.processPayment(totalAmount);

        // 3. passing it method as reference;
        Payment netBanking= (amount)->{
            System.out.println("Amount "+amount+" would be paid using Net Banking");
        };
        process(netBanking, totalAmount);
    }

    private static void process(Payment paymentType, double totalAmount){
        paymentType.processPayment(totalAmount);
    }
}
