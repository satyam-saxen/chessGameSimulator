package chess_game_simulator;

public class Knight extends PieceType{
    @Override
    public String PossibleMoves() {
        System.out.println("Hey I'm here1");
        moveType = new KnightMove();
        char row = this.getRow();
        char column = this.getColumn();
        return moveType.moves(row,column);
    }
}
