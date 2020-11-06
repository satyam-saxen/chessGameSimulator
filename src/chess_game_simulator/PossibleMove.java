package chess_game_simulator;

public class PossibleMove {
    private final Piece piece;

    public PossibleMove(Piece piece) {
        this.piece = piece;
    }

    private String KingMove()
    {
        char row = piece.getRow();
        int column = piece.getColumn();
        int []X={-1,-1,-1,0,0,1,1,1};
        int []Y={-1,0,1,-1,1,-1,0,1};
        String possibleValidMoves="";
        for(int i=0;i<=7;i++)
        {
            int a=row + X[i];
            int b=column + Y[i];
            if(a>='A' && a<='H' && b>=1 && b<=8)
                possibleValidMoves += ((char)a + Integer.toString(b)+" ");
        }
        return possibleValidMoves;
    }

    private String KnightMove()
    {
        char row = piece.getRow();
        int column = piece.getColumn();
        int []X={ 2, 1, -1, -2, -2, -1, 1, 2 };
        int []Y={ 1, 2, 2, 1, -1, -2, -2, -1 };
        String possibleValidMoves = "";
        for(int i=0;i<=7;i++)
        {
            int a=row + X[i];
            int b=column + Y[i];
            if(a>='A' && a<='H' && b>=1 && b<=8)
                possibleValidMoves += ((char)a + Integer.toString(b)+" ");
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
        for(int i=-7;i<=7;i++)
        {
            if(i!=0)
            {
                int a = row+i;
                int b = column+i;
                if(a>='A' && a<='H' && b>=1 && b<=8)
                    possibleValidMoves += ((char)a + Integer.toString(b) + " ");
                b = column-i;
                if(a>='A' && a<='H' && b>=1 && b<=8)
                    possibleValidMoves += ((char)a + Integer.toString(b) + " ");
            }
        }
        return possibleValidMoves;
    }

    private String RookMove()
    {
        char row = piece.getRow();
        int column = piece.getColumn();
        String possibleValidMoves = "";
        for(int i=1;i<=8;i++)
        {
            if(i!=column)
                possibleValidMoves += (row + Integer.toString(i) +" ");
        }
        for(int i='A';i<='H';i++)
        {
            if(i!=row)
                possibleValidMoves += (((char)i) + Integer.toString(column) +" ");
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
        int column = piece.getColumn();
        if(row+1<='H')
        {
            possibleValidMoves = ((char)(row+1) + Integer.toString(column)+" ");
            return possibleValidMoves;
        }
        return "No Move Possible, you are standing on the last row";  //ASSUMPTION - WE ONLY CONSIDER UPWARD DIRECTION
                                            // AS VALID VERTICAL DIRECTION MOVE FOR PAWN
    }

    public String ExpectedPossibleMoves()
    {
        String outputString;
        String pieceName = piece.getPieceName().toLowerCase();
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

}
