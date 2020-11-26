package chess_game_simulator;

public class KnightMove implements MoveType{
    @Override
    public String moves(char row, char column) {
        System.out.println("Hey I'm here");
        int []X={ 2, 1, -1, -2, -2, -1, 1, 2 };
        int []Y={ 1, 2, 2, 1, -1, -2, -2, -1 };
        String possibleValidMoves = "";
        for(int i=0;i<X.length;i++)
        {
            char rowIndex= (char) (row + X[i]);
            char columnIndex= (char) (column + Y[i]);
            if(Validation.isPossibleMove(rowIndex,columnIndex))
                possibleValidMoves += (rowIndex+""+columnIndex+", ");
        }
        return possibleValidMoves;
    }
}
