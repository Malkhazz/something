package IsItCheckmate;

public class Rook extends Piece {
    public Rook(Board board, int x, int y){
        super(board);
        spawn(x, y);
    }
    @Override
    protected void spawn(int x, int y){
        this.x = x;
        this.y = y;

        // row red
        for(int i = 0; i<board.notRed.length; i++) {
            if(i!=y) {
                board.notRed[x][i] = false;
            }
        }
        // column red
        for(int j = 0; j<board.notRed[0].length; j++){
            if(j!=x) {
                board.notRed[j][y] = false;
            }
        }
    }
}
