package Adapter;

public class CreditCardPayment implements IPaymentSystem{
    private String cardNumber;
    private String ownerInfo;
    private String cardExpMonth;
    private double amount;

    public CreditCardPayment(String cardNumber, String ownerInfo, String cardExpMonth, double amount){
        this.cardNumber = cardNumber;
        this.ownerInfo = ownerInfo;
        this.cardExpMonth = cardExpMonth;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Payed " + amount + " with Credit card");
    }

    @Override
    public double getAmount() {
        return 0;
    }

    public String getCardNumber(){
        return this.cardNumber;
    }

    public String getCardExpMonth(){
        return this.cardExpMonth;
    }

    public String getOwnerInfo(){
        return this.ownerInfo;
    }
}
