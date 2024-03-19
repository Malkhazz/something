package IsItCheckmate;

public class Main {

    public static void main(String[] args) {

        Board board1 = new Board();

        King king1 = new King(board1, 0, 0);
        Rook rook1 = new Rook(board1, 0, 6);
        Rook rook2 = new Rook( board1, 2, 6);
        //not checkmate

       king1.checkCheckmate(king1.checkmate(0,0));

        board1.print();

        Board board2 = new Board();

        King king2 = new King(board2, 0, 0);
        Rook rook3 = new Rook(board2, 0, 6);
        Rook rook4 = new Rook( board2, 1, 6);


        king2.checkCheckmate(king2.checkmate(0,0));
        board2.print();

        Board board3 = new Board();

        King king3 = new King(board3, 7, 1);
        Rook rook5 = new Rook(board3, 0, 0);
        Rook rook6 = new Rook(board3, 0, 1);
        Pawn pawn = new Pawn(board3, 6, 1);
        Bishop bishop = new Bishop(board3, 5, 3);

        king3.checkCheckmate(king2.checkmate(0,0));

        board3.print();

        //checkmate
    }
}
