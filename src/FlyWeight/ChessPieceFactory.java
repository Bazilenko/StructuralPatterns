package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ChessPieceFactory {
    private static ChessPieceFactory instance;
    private Map<String, ChessPiece> piece;

    private ChessPieceFactory(){
        piece = new HashMap<>();
    }

    public static ChessPieceFactory getInstance() {
        if (instance == null) {
            instance = new ChessPieceFactory();
        }
        return instance;
    }

    public ChessPiece getChessPiece(String key) {
        if (piece.containsKey(key)) {
            return piece.get(key);
        } else {
            String[] details = key.split(":");
            ChessPiece piece1 = new ChessPiece(details[0], details[1]);
            piece.put(key, piece1);
            return piece1;
        }
    }
}
