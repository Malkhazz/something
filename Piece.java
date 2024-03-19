package IsItCheckmate;

public class Piece {

    protected Board board;
    protected int x;
    protected int y;

    public Piece(){
        this.board = null;
        x = 0;
        y = 0;
    }

    public Piece(Board board){
        this.board = board;
        x = 0;
        y = 0;
    }

    protected void spawn(int x, int y){
    // must be overridden
    }

    protected boolean isValid(int a, int b){
        return ( a>=0 && a<8 )&&( b>=0 && b<8 );
    }

}
