package IsItCheckmate;


public class King {
    private Board board;
    private int x;
    private int y;


    public King(Board board, int x, int y) {
        this.board = board;
        this.x = x;
        this.y = y;
        checkmate(this.x, this.y);
    }

    public boolean checkmate(int x, int y) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int checkX = x - 1 + i;
                int checkY = y - 1 + j;


                if (isValid(checkX, checkY)&&board.notRed[checkX][checkY]){
                    return false;
                }
            }
        }

        return true;
    }


    public void checkCheckmate(boolean checkmate) {
        if (checkmate(this.x, this.y)) {
            System.out.println("It's checkmate!");
        } else {
            System.out.println("It's not checkmate!");
        }
    }

    private boolean isValid(int a, int b) {
        return (a >= 0 && a < 8) && (b >= 0 && b < 8);
    }
}
