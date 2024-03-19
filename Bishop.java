package IsItCheckmate;

public class Bishop extends Piece {
    public Bishop(Board board, int x, int y){
        super(board);
        spawn(x, y);
    }

    @Override
        protected void spawn(int x, int y) {
            this.x = x;
            this.y = y;

            while (super.isValid(x, y)) {
                board.notRed[x][y] = false;
                x++;
                y++;
            }
            x= this.x;
            y= this.y;
            while (super.isValid(x, y)) {
            board.notRed[x][y] = false;
                x--;
                y++;
          }
        x= this.x;
        y= this.y;
        while (super.isValid(x, y)) {
            board.notRed[x][y] = false;
            x++;
            y--;;
        }
        x= this.x;
        y= this.y;
        while (super.isValid(x, y)) {
            board.notRed[x][y] = false;
            x--;
            y--;
        }
        board.notRed[this.x][this.y]=true;
        }






}
