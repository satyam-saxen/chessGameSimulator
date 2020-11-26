package chess_game_simulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RunChess {
    Map<String,PieceType> PieceMap = new HashMap<>();

    public void run()
    {
        Board board = new Board('A','H','1','8');
        Validation.board = board;
        PieceMap.put("king",new King());
        PieceMap.put("horse",new Knight());
        PieceMap.put("bishop",new Bishop());
        PieceMap.put("rook",new Rook());
        PieceMap.put("queen",new Queen());
        PieceMap.put("pawn",new Pawn());
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
                if (Validation.isValidInput(inputString)) {
                    String []input = inputString.split(" ");
                    PieceType pieceType = PieceMap.get(input[0].toLowerCase());
                    pieceType.setRow(input[1].toUpperCase().charAt(0));
                    pieceType.setColumn(input[1].toUpperCase().charAt(1));
                    String outputString = pieceType.PossibleMoves(board);
                    System.out.println(outputString);
                } else {
                    System.out.println("Type of Piece or its location is incorrect, please try again with correct data");
                }
                System.out.println();
            }

        }while(playChess);
    }
}
