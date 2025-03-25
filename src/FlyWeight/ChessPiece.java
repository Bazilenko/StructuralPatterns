package FlyWeight;

public class ChessPiece implements IChessPiece{
    private String type;
    private String color;

    public ChessPiece(String type, String color){
        this.color = color;
        this.type = type;
    }

    @Override
    public void placePiece(String position){
        System.out.println("Placing " + color + " " + type + " on " + position);
    }
}
