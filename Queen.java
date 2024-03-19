package IsItCheckmate;

public class Queen extends Piece {
        public Queen(Board board, int x, int y){
            super(board);
            spawn(x, y);
        }

        @Override


        protected void spawn(int x, int y) {

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
                y--;
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
