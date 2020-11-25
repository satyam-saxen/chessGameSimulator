package chess_game_simulator;

public class Piece {
    private final String pieceName;
    private  char row;
    private  char column;

    public Piece(String input)
    {
        String []s = input.split(" ");
        this.pieceName = s[0];
        this.row = s[1].toUpperCase().charAt(0);
        this.column = s[1].toUpperCase().charAt(1);
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

    public char getColumn() {
        return column;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public void setColumn(char column) {
        this.column = column;
    }
}
