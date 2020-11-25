package chess_game_simulator;

public class PossibleMove {
    private final Piece piece;
    public static Board board;

    public PossibleMove(Piece piece) {
        this.piece = piece;
    }

    private String KingMove()
    {
        char row = piece.getRow();
        char column = piece.getColumn();
        int []X={-1,-1,-1,0,0,1,1,1};
        int []Y={-1,0,1,-1,1,-1,0,1};
        String possibleValidMoves="";
        for(int i=0;i<X.length;i++)
        {
            char rowIndex = (char) (row + X[i]);
            char columnIndex= (char) (column + Y[i]);
            if(isPossibleMove(rowIndex,columnIndex))
                possibleValidMoves += (rowIndex +""+ columnIndex +", ");
        }
        return possibleValidMoves;
    }

    private String KnightMove()
    {
        char row = piece.getRow();
        char column = piece.getColumn();
        int []X={ 2, 1, -1, -2, -2, -1, 1, 2 };
        int []Y={ 1, 2, 2, 1, -1, -2, -2, -1 };
        String possibleValidMoves = "";
        for(int i=0;i<X.length;i++)
        {
            char rowIndex= (char) (row + X[i]);
            char columnIndex= (char) (column + Y[i]);
            if(isPossibleMove(rowIndex,columnIndex))
                possibleValidMoves += (rowIndex+""+columnIndex+", ");
        }
        return possibleValidMoves;
    }

    private String BishopMove()
    {
        String possibleValidMoves="";
        char row = piece.getRow();
        int column = piece.getColumn();
//        for(int i='A';i<='H';i++)
//        {
//            for(int j=1;j<=8;j++)
//            {
//                if(Math.abs(i-p)==Math.abs(j-q) && i!=p)
//                    s += (((char)i) + Integer.toString(j) +" ");
//            }
//        }
//        s += " $ ";
        int minRangeOnBoard = -7;
        int maxRangeOnBoard = 7;
        for(int index=minRangeOnBoard;index<=maxRangeOnBoard;index++)
        {
            if(index!=0)
            {
                char rowIndex = (char) (row+index);
                char columnIndex = (char) (column+index);
                if(isPossibleMove(rowIndex,columnIndex))
                    possibleValidMoves += (rowIndex+""+columnIndex+", ");
                columnIndex = (char) (column-index);
                if(isPossibleMove(rowIndex,columnIndex))
                    possibleValidMoves += (rowIndex+""+columnIndex+", ");
            }
        }
        return possibleValidMoves;
    }

    private String RookMove()
    {
        char row = piece.getRow();
        char column = piece.getColumn();
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

    private String QueenMove()
    {
        return BishopMove() + RookMove(); //REMOVING EXTRA LINES FROM HERE
    }

    private String PawnMove()
    {
        String possibleValidMoves;
        char row = piece.getRow();
        char column = piece.getColumn();
        if(isPossibleMove((char) (row+1),column))
        {
            possibleValidMoves = ((char)(row+1) +""+column);
            return possibleValidMoves;
        }
        return "No Move Possible, you are standing on the last row";  //ASSUMPTION - WE ONLY CONSIDER UPWARD DIRECTION
                                            // AS VALID VERTICAL DIRECTION MOVE FOR PAWN
    }

    public String ExpectedPossibleMoves()
    {
        String outputString;
        String pieceName = piece.getPieceName().toLowerCase();
//        System.out.println("Heyy I'm here");
        switch (pieceName)
        {
            case "king":
                outputString = KingMove();
                break;
            case "queen":
                outputString = QueenMove();
                break;
            case "bishop":
                outputString = BishopMove();
                break;
            case "rook":
                outputString = RookMove();
                break;
            case "horse":
                outputString = KnightMove();
                break;
            case "pawn":
                outputString = PawnMove();
                break;
            default:
                outputString = "No Valid Piece";
        }
        return outputString;
    }
    private boolean isPossibleMove(char rowIndex, char columnIndex)
    {
        return(rowIndex>=board.getRowLowerRange() && rowIndex<=board.getRowHigherRange() && columnIndex>=board.getColumnLowerRange() && columnIndex<=board.getColumnHigherRange());
    }

}
