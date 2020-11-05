package chess_game_simulator;

public class PossibleMove {
    private Piece piece;

    public static String KingMove(Piece piece)
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

    public static String KnightMove(Piece piece)
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

    public static String BishopMove(Piece piece)
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

    public static String RookMove(Piece piece)
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

    public static String QueenMove(Piece piece)
    {
        String s = "";
        s += BishopMove(piece);
        s += RookMove(piece);
        return s;
    }

    public static String PawnMove(Piece piece)
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

}
