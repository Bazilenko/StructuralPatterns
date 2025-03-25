package Adapter;

public class PayPalAdapter implements IPaymentSystem{
    private PayPalPayment paypal;

    public PayPalAdapter(PayPalPayment paypal){
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount){
        paypal.makeTransaction(amount);
    }

    @Override
    public double getAmount(){
        return this.paypal.getBalance();
    }

    @Override
    public String getCardNumber(){
        return this.paypal.getEmail();
    }


}
