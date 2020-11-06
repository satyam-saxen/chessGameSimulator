package chess_game_simulator;

public class Game {
    private static boolean isValidInput(String input)
    {
        String []splitArray = input.split(" ");
        String type = splitArray[0].toLowerCase();

        if(type.equals("king") || type.equals("queen") || type.equals("horse") || type.equals("bishop")
                || type.equals("rook") || type.equals("pawn"))
        {
            return splitArray[1].charAt(0) >= 'A' && splitArray[1].charAt(0) <= 'H' && splitArray[1].charAt(1) >= '1' && splitArray[1].charAt(1) <= '8';
        }
        return false;
    }
    public static void main(String []args)
    {
//        System.out.println("Hello World");
        Piece piece;
        String s = "King G6";
        if(isValidInput(s)) {
            piece = Piece.getPiece(s);
            PossibleMove possibleMove = new PossibleMove(piece);
            String output = possibleMove.ExpectedPossibleMoves();
            System.out.println(output);
        }else{
            System.out.println("Please enter valid input String in format like : Type [A-H][1-8]");
        }
    }

}
