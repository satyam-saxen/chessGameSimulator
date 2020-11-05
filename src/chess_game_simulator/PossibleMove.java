package chess_game_simulator;

public class PossibleMove {
    private Piece piece;

    public PossibleMove(Piece piece) {
        this.piece = piece;
    }

    private String KingMove()
    {
        char row = piece.getRow();
        int column = piece.getColumn();
        int X[]={-1,-1,-1,0,0,1,1,1};
        int Y[]={-1,0,1,-1,1,-1,0,1};
        String s = "";
        for(int i=0;i<=7;i++)
        {
            int a=row + X[i];
            int b=column + Y[i];
            if(a>='A' && a<='H' && b>=1 && b<=8)
                s += ((char)a + Integer.toString(b)+" ");
        }
        return s;
    }

    private String KnightMove()
    {
        char row = piece.getRow();
        int column = piece.getColumn();
        int X[]={ 2, 1, -1, -2, -2, -1, 1, 2 };
        int Y[]={ 1, 2, 2, 1, -1, -2, -2, -1 };
        String s = "";
        for(int i=0;i<=7;i++)
        {
            int a=row + X[i];
            int b=column + Y[i];
            if(a>='A' && a<='H' && b>=1 && b<=8)
                s += ((char)a + Integer.toString(b)+" ");
        }
        return s;
    }

    private String BishopMove()
    {
        String possibleMoves="";
        char p = piece.getRow();
        int q = piece.getColumn();
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
                int a = p+i;
                int b = q+i;
                if(a>='A' && a<='H' && b>=1 && b<=8)
                    possibleMoves += ((char)a + Integer.toString(b) + " ");
            }
        }
        for(int i=-7;i<=7;i++)
        {
            if(i!=0)
            {
                int a = p+i;
                int b = q-i;
                if(a>='A' && a<='H' && b>=1 && b<=8)
                    possibleMoves += ((char)a + Integer.toString(b) + " ");
            }
        }
        return possibleMoves;
    }

    private String RookMove()
    {
        char p = piece.getRow();
        int q = piece.getColumn();
        String s = "";
        int j;
        for(int i=1;i<=8;i++)
        {
            if(i!=q)
                s += (p + Integer.toString(i) +" ");
        }
        for(int i='A';i<='H';i++)
        {
            if(i!=p)
                s += (((char)i) + Integer.toString(q) +" ");
        }
        return s;
    }

    private String QueenMove()
    {
        String s = "";
        s += BishopMove();
        s += RookMove();
        return s;
    }

    private String PawnMove()
    {
        String s;
        char p = piece.getRow();
        int q = piece.getColumn();
        if(p+1<='H')
        {
            s = ((char)(p+1) + Integer.toString(q)+" ");
            return s;
        }
        return "No Move Possible";  //ASSUMPTION - WE ONLY CONSIDER UPWARD DIRECTION
                                            // AS VALID VERTICAL DIRECTION MOVE FOR PAWN
    }

    public String ExpectedPossibleMoves()
    {
        String outputString = " ";
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
                System.out.println("No Valid Piece");
        }
        return outputString;
    }

}
