package chess_game_simulator;

public class BishopMove implements MoveType{
    @Override
    public String moves(char row, char column,Board board) {
        String possibleValidMoves="";
        int minRangeOnBoard = -7;
        int maxRangeOnBoard = 7;
        for(int index=minRangeOnBoard;index<=maxRangeOnBoard;index++)
        {
            if(index!=0)
            {
                char rowIndex = (char) (row+index);
                char columnIndex = (char) (column+index);
                if(Validation.isPossibleMove(rowIndex,columnIndex))
                    possibleValidMoves += (rowIndex+""+columnIndex+", ");
                columnIndex = (char) (column-index);
                if(Validation.isPossibleMove(rowIndex,columnIndex))
                    possibleValidMoves += (rowIndex+""+columnIndex+", ");
            }
        }
        return possibleValidMoves;
    }
}
