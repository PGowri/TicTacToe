package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;

    }

    public Boolean isInFavorOfX() {

        return checkRow('X') || checkColumn('X')|| checkDiagonal('X')||checkDiagonal('X');
    }

    public boolean checkRow(Character letter) {
        for(int i=0; i<3; i++){
            if (this.matrix[i][0] == letter && this.matrix[i][1] == letter && this.matrix[i][2]== letter){
            return true;
            }
        }return false;
    }

    public boolean checkColumn(Character letter){
        for(int i=0; i<3;i++){
            if(this.matrix[0][i] == letter && this.matrix[1][i] == letter && this.matrix[2][i]== letter){
            return true;
            }
        }return false;
    }

    public boolean checkDiagonal(Character letter) {
        for( int i = 0; i <3; i++){
            if (this.matrix[2][0] == letter && this.matrix[1][1] == letter && this.matrix[0][2]==letter){
                return true;
            }
        }
        return false;
    }

    public boolean checkOtherDiagonal(Character letter) {
        for( int i = 0; i <3; i++){
            if (this.matrix[0][0] == letter && this.matrix[1][1] == letter && this.matrix[2][2]==letter){
                return true;
            }
        }
        return false;

    }
    public Boolean isInFavorOfO() {
        return checkRow ('O') || checkColumn(('O')) || checkDiagonal('O')|| checkOtherDiagonal('O');
    }

    public Boolean isTie() {
        return isInFavorOfO() == isInFavorOfX();
    }

    public String getWinner() {
        if (isInFavorOfO()){
            return "O";
        } else if (isInFavorOfX()) {
            return "X";
        } else
            return "" ;

    }

}
