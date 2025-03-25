package Adapter;

public interface IPaymentSystem {
    void pay(double amount);
    double getAmount();
    String getCardNumber();

}
