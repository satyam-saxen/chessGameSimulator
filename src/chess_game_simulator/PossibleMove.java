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



}
