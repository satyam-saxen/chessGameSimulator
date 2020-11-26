package chess_game_simulator;

public class King extends PieceType{

    @Override
    public String PossibleMoves() {
        moveType = new KingMove();
        char row = this.getRow();
        char column = this.getColumn();
        return moveType.moves(row,column);
    }
}
