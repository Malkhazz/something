package IsItCheckmate;

public class Knight extends Piece {

    public Knight(Board board, int x, int y){
        super(board);
        spawn(x, y);
    }
    @Override
    protected void spawn(int x, int y){
        this.x = x;
        this.y = y;

        if(super.isValid(x-1, y+2)) {
            board.notRed[x - 1][y + 2] = false;
        }
        if(super.isValid(x+1, y+2)) {
            board.notRed[x + 1][y + 2] = false;
        }
        if(super.isValid(x-2, y+1)) {
            board.notRed[x - 2][y + 1] = false;
        }
        if(super.isValid(x+2, y+1)) {
            board.notRed[x + 2][y + 1] = false;
        }
        if(super.isValid(x-2, y-1)) {
            board.notRed[x - 2][y - 1] = false;
        }
        if(super.isValid(x+1, y-1)) {
            board.notRed[x + 2][y - 1] = false;
        }
        if(super.isValid(x-1, y-2)) {
            board.notRed[x - 1][y - 2] = false;
        }
        if(super.isValid(x+1, y-2)) {
            board.notRed[x + 1][y - 2] = false;
        }

    }

}
