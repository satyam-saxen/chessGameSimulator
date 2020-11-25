package chess_game_simulator;

import java.util.Scanner;

public class RunChess {
    private boolean isValidInput(String input,Board board)
    {
        String []splitArray = input.split(" ");
        if(splitArray.length>1)
        {
            String type = splitArray[0].toLowerCase();

            if(type.equals("king") || type.equals("queen") || type.equals("horse") || type.equals("bishop")
                    || type.equals("rook") || type.equals("pawn"))
            {
                return splitArray[1].toUpperCase().charAt(0) >= board.getRowLowerRange() && splitArray[1].toUpperCase().charAt(0) <= board.getRowHigherRange() && splitArray[1].toUpperCase().charAt(1) >= board.getColumnLowerRange() && splitArray[1].toUpperCase().charAt(1) <= board.getColumnHigherRange();
            }
        }
        return false;
    }
    public void run()
    {
        Board board = new Board();
        board.setRowLowerRange('A');
        board.setRowHigherRange('H');
        board.setColumnLowerRange('1');
        board.setColumnHigherRange('8');

        Scanner scanner = new Scanner(System.in);
        boolean playChess = true;
        do{
            System.out.println("Please enter the type of Piece and its Location");
            System.out.println("Or, press 1 for exit ");
            String inputString = scanner.nextLine();
            if(inputString.equals("1"))
            {
                playChess = false;
            }else {
                System.out.println();
                if (isValidInput(inputString,board)) {
                    Piece piece = Piece.getPiece(inputString);
                    String outputString = new PossibleMove(piece).ExpectedPossibleMoves();
                    System.out.println(outputString);
                } else {
                    System.out.println("Type of Piece or its location is incorrect, please try again with correct data");
                }
                System.out.println();
            }

        }while(playChess);
    }
}
