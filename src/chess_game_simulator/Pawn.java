package chess_game_simulator;

public class Pawn extends PieceType {
    @Override
    public String PossibleMoves(Board board) {
        moveType = new PawnMove();
        char row = this.getRow();
        char column = this.getColumn();
        return moveType.moves(row,column,board);
    }
}
