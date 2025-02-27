package functionalinterface;

public class UPI implements Payment{

    private static final Integer MAX_ALLOWED=100;

    @Override
    public void processPayment(double amount) {
        System.out.println("Amount "+amount+" would be paid using UPI");
    }

    @Override
    public double applyCoupon(double amount, double percentage) {
            if(amount == 0 || percentage == 0){
                return amount;
            }
            double totalDiscount=(amount*percentage)/100;
            return amount-Math.min(MAX_ALLOWED, totalDiscount);
    }
}
