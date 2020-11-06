package chess_game_simulator;

import java.util.Scanner;

public class Game {
    private static boolean isValidInput(String input)
    {
        String []splitArray = input.split(" ");
        String type = splitArray[0].toLowerCase();

        if(type.equals("king") || type.equals("queen") || type.equals("horse") || type.equals("bishop")
                || type.equals("rook") || type.equals("pawn"))
        {
            return splitArray[1].toUpperCase().charAt(0) >= 'A' && splitArray[1].toUpperCase().charAt(0) <= 'H' && splitArray[1].toUpperCase().charAt(1) >= '1' && splitArray[1].toUpperCase().charAt(1) <= '8';
        }
        return false;
    }
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Please enter the type of Piece and its Location");
            System.out.println("Or, press 1 for exit ");
            String inputString = scanner.nextLine();
            if(inputString.equals("1"))
            {
                break;
            }
            System.out.println();
            if(isValidInput(inputString)){
                Piece piece = Piece.getPiece(inputString);
                String outputString = new PossibleMove(piece).ExpectedPossibleMoves();
                System.out.println(outputString);
            }else{
                System.out.println("Type of Piece or its location is incorrect, please try again with correct data");
            }
            System.out.println();
        }

    }

}
