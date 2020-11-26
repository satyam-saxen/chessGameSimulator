package chess_game_simulator;

public class KingMove implements MoveType {
    @Override
    public String moves(char row, char column) {
        int []X={-1,-1,-1,0,0,1,1,1};
        int []Y={-1,0,1,-1,1,-1,0,1};
        String possibleValidMoves="";
        for(int i=0;i<X.length;i++)
        {
            char rowIndex = (char) (row + X[i]);
            char columnIndex= (char) (column + Y[i]);
            if(Validation.isPossibleMove(rowIndex,columnIndex))
                possibleValidMoves += (rowIndex +""+ columnIndex +", ");
        }
        return possibleValidMoves;
    }
}
