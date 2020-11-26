package chess_game_simulator;

public class Rook extends PieceType{
    @Override
    public String PossibleMoves(Board board) {
        moveType = new RookMove();
        char row = this.getRow();
        char column = this.getColumn();
        return moveType.moves(row,column,board);
    }
}
