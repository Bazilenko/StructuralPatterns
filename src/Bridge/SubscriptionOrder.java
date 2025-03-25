package Bridge;

import Adapter.IPaymentSystem;

public class SubscriptionOrder extends Order{
    public SubscriptionOrder(IPaymentSystem payment){
        super(payment);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Subscribe payment");
        payment.pay(amount);
    }
}
