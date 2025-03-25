import Adapter.*;
import Adapter.CreditCardPayment;
import Adapter.PayPalPayment;
import Bridge.*;
import Decorator.*;
import Facade.GitFacade;
import FlyWeight.ChessPiece;
import FlyWeight.ChessPieceFactory;

public class Main{
    public static void main(String[] args){
        FlyWeightMenu();
    }

    public static void facadeMenu(){
        GitFacade facade = new GitFacade();

        facade.initializeAndAdd(".");
        facade.commitAndPush("v 1.1", "main");
    }
    public static void decoratorMenu(){
        BasicCoffee coffee = new BasicCoffee();
        coffee.prepare();

        MilkCoffeeDecorator milkCoffee = new MilkCoffeeDecorator(coffee);
        milkCoffee.prepare();

        SugarCoffeeDecorator sugar = new SugarCoffeeDecorator(milkCoffee);
        sugar.prepare();


    }

    public static void FlyWeightMenu(){
        ChessPieceFactory factory = ChessPieceFactory.getInstance();

        ChessPiece whitePawn = factory.getChessPiece("Pawn:White");
        whitePawn.placePiece("E2");

        ChessPiece blackQueen = factory.getChessPiece("Queen:Black");
        blackQueen.placePiece("D8");

        ChessPiece whitePawnAgain = factory.getChessPiece("Pawn:White");
        whitePawnAgain.placePiece("E3");

        ChessPiece blackQueenAgain = factory.getChessPiece("Queen:Black");
        blackQueenAgain.placePiece("E7");
    }

    public static void adapterAndBridgeMenu(){
        IPaymentSystem payment;

        Order order;

        payment = new CreditCardPayment(
                "5555-5555-5555-5555",
                "Petro Ivanenko",
                "09/29",
                10000);
        payment.pay(100);

        order = new OnlineOrder(payment);
        order.pay(1000);

        PayPalPayment paypal = new PayPalPayment("kifiukvasyl@gmail.com", 50000);

        payment = new PayPalAdapter(paypal);
        order = new SubscriptionOrder(payment);
        order.pay(650);

        payment.pay(150);
    }
}