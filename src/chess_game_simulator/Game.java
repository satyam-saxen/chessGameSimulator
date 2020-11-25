package chess_game_simulator;

import java.util.Scanner;

public class Game {

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
//        boolean play = true;
        RunChess runChess = new RunChess();
        runChess.run();

    }

}
