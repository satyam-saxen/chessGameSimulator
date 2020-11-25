package chess_game_simulator;

public class Board {
    private char rowLowerRange;
    private char rowHigherRange;
    private char columnLowerRange;
    private char columnHigherRange;

    public char getRowLowerRange() {
        return rowLowerRange;
    }

    public void setRowLowerRange(char rowLowerRange) {
        this.rowLowerRange = rowLowerRange;
    }

    public char getRowHigherRange() {
        return rowHigherRange;
    }

    public void setRowHigherRange(char rowHigherRange) {
        this.rowHigherRange = rowHigherRange;
    }

    public char getColumnLowerRange() {
        return columnLowerRange;
    }

    public void setColumnLowerRange(char columnLowerRange) {
        this.columnLowerRange = columnLowerRange;
    }

    public char getColumnHigherRange() {
        return columnHigherRange;
    }

    public void setColumnHigherRange(char columnHigherRange) {
        this.columnHigherRange = columnHigherRange;
    }
}
