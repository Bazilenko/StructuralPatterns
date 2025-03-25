package Adapter;

public class PayPalPayment {
    private String email;
    double balance;

    public PayPalPayment(String email, double balance){
        this.balance = balance;
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public double getBalance(){
        return this.balance;
    }

    public void makeTransaction(double amount){
        System.out.println("Payed " + amount + " by PayPal");
    }

}
