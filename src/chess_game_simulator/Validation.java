package chess_game_simulator;

public class Validation {
    public static Board board;
    public static boolean isPossibleMove(char rowIndex, char columnIndex)
    {
        return(rowIndex>=board.getRowLowerRange() && rowIndex<=board.getRowHigherRange() && columnIndex>=board.getColumnLowerRange() && columnIndex<=board.getColumnHigherRange());
    }
    public static boolean isValidInput(String input)
    {
        String []splitArray = input.split(" ");
        if(splitArray.length>1)
        {
            String type = splitArray[0].toLowerCase();

            if(type.equals("king") || type.equals("queen") || type.equals("horse") || type.equals("bishop")
                    || type.equals("rook") || type.equals("pawn"))
            {
                return splitArray[1].toUpperCase().charAt(0) >= board.getRowLowerRange() && splitArray[1].toUpperCase().charAt(0) <= board.getRowHigherRange() && splitArray[1].toUpperCase().charAt(1) >= board.getColumnLowerRange() && splitArray[1].toUpperCase().charAt(1) <= board.getColumnHigherRange();
            }
        }
        return false;
    }
}
