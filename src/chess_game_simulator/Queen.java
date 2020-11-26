package chess_game_simulator;

public class Queen extends PieceType{
    @Override
    public String PossibleMoves(Board board) {
        moveType = new QueenMove();
        char row = this.getRow();
        char column = this.getColumn();
        return moveType.moves(row,column,board);
    }
}
