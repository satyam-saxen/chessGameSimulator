package chess_game_simulator;

public class RookMove implements MoveType{
    @Override
    public String moves(char row, char column,Board board) {
        String possibleValidMoves = "";
        for(char columnIndex=board.getColumnLowerRange();columnIndex<=board.getColumnHigherRange();columnIndex++)
        {
            if(columnIndex!=column)
                possibleValidMoves += (row + "" +columnIndex  +", ");
        }
        for(char rowIndex=board.getRowLowerRange();rowIndex<=board.getRowHigherRange();rowIndex++)
        {
            if(rowIndex!=row)
                possibleValidMoves += (rowIndex +"" +column +", ");
        }
        return possibleValidMoves;
    }
}
