package Bridge;

import Adapter.IPaymentSystem;

public abstract class Order {
    protected IPaymentSystem payment;

    public Order(IPaymentSystem payment){
        this.payment = payment;
    }
    public abstract void pay(double amount);
}
