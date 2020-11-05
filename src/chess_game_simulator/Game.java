package chess_game_simulator;

public class Game {
    public static void main(String []args)
    {
//        System.out.println("Hello World");
        Piece piece;
        String s = "Pawn A2";
        piece = Piece.getPiece(s);
//        System.out.println(piece.getPieceName());
//        System.out.println("Position - "+piece.getRow()+piece.getColumn());
        String output = PossibleMove.PawnMove(piece);
        System.out.println(output);
    }

}
