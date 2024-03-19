package IsItCheckmate;

public class Pawn extends Piece {

    public Pawn(Board board, int x, int y){
        super(board);
        spawn(x, y);
    }

    @Override
    protected void spawn(int x, int y){
        this.x = x;
        this.y = y;

        if (x == 7) {
            return;
        }

        if (y > 0) {
            board.notRed[x + 1][y - 1] = false;

        }

        if (y < board.notRed[0].length - 1) {
            board.notRed[x + 1][y + 1] = false;

        }
    }



}

