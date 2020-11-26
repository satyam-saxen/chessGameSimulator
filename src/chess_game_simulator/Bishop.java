package chess_game_simulator;

public class Bishop extends PieceType {
    @Override
    public String PossibleMoves(Board board) {
        moveType = new BishopMove();
        char row = this.getRow();
        char column = this.getColumn();
        return moveType.moves(row,column,board);
    }
}
