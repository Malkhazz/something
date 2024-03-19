package IsItCheckmate;

import java.util.Arrays;

public class Board {
    private final int ROW_SIZE = 8;
    private final int COLUMN_SIZE = 8;
    boolean[][] notRed = new boolean[ROW_SIZE][COLUMN_SIZE];


    public Board(){
        for(int i = 0; i< notRed.length; i++){
            for(int j = 0; j< notRed[i].length; j++){
                notRed[i][j] = true;
            }
        }
//        for(int i = 0; i< pieces.length; i++){
//            for(int j = 0; j< pieces[i].length; j++){
//                pieces[i][j] = null;
//            }
//        }

    }
//    protected void addPiece(Piece piece, int x, int y){
//       pieces[x][y] = piece;
//    }
    public boolean getBox(int x, int y){
        return notRed[x][y];
    }

    public boolean[][] getNotRed(){
        return notRed;
    }
    public void print(){
        for(int i = 0; i< ROW_SIZE; i++){
            System.out.println(Arrays.toString(getNotRed()[i]));
        }
    }
}
