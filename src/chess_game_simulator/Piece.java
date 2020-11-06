package chess_game_simulator;

public class Piece {
    private final String pieceName;
    private final char row;
    private final int column;

    public Piece(String input)
    {
        String []s = input.split(" ");
        this.pieceName = s[0];
        this.row = s[1].toUpperCase().charAt(0);
        this.column = Integer.parseInt(String.valueOf(s[1].charAt(1)));
    }

    public static Piece getPiece(String inputParameter)
    {
        return new Piece(inputParameter);
    }

    public String getPieceName() {
        return pieceName;
    }

    public char getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
