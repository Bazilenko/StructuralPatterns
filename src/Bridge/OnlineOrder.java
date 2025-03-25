package Bridge;

import Adapter.IPaymentSystem;

public class OnlineOrder extends Order{
    public OnlineOrder(IPaymentSystem payment){
        super(payment);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Online payment");
        payment.pay(amount);
    }
}
