package chess;
import chess.items.Board;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.chessPieces.*;
import chess.items.*;

/**
*Clase Game. 
*/
public class Game{

    public static void main(String[] args) {
        Board board = Board.getInstance();
        System.out.println(board.toString());
		
		//primera fila
        Piece rb = new Rook(new Position(0,0), ColorEnum.BLACK);
		//Piece knb = new Knight(new Position(1,0), ColorEnum.BLACK);
		Piece bb = new Bishop(new Position(2,0), ColorEnum.BLACK);
		Piece qb = new Queen(new Position(3,0), ColorEnum.BLACK);
		Piece kb = new King(new Position(4,0), ColorEnum.BLACK);
		Piece bb2= new Bishop(new Position(5,0), ColorEnum.BLACK);
		//Piece knb2 = new Knight(new Position(6,0), ColorEnum.BLACK);
		Piece rb2= new Rook(new Position(7,0), ColorEnum.BLACK);
		
		//Segunda fila
		Piece pb = new Pawn(new Position(0,1), ColorEnum.BLACK);
		Piece pb2 = new Pawn(new Position(1,1), ColorEnum.BLACK);
		Piece pb3 = new Pawn(new Position(2,1), ColorEnum.BLACK);
		Piece pb4 = new Pawn(new Position(3,1), ColorEnum.BLACK);
		Piece pb5 = new Pawn(new Position(4,1), ColorEnum.BLACK);
		Piece pb6 = new Pawn(new Position(5,1), ColorEnum.BLACK);
		Piece pb7 = new Pawn(new Position(6,1), ColorEnum.BLACK);
		Piece pb8 = new Pawn(new Position(7,1), ColorEnum.BLACK);
		
		//filas vacias
		for(int i = 0; i > 8; i++){
			for(int j = 2; j == 5; i++){
				Piece np = new Empty(new Position(i,j), ColorEnum.NONE);
			}
		}
		
		//Septima fila
		Piece pw = new Pawn(new Position(0,6), ColorEnum.WHITE);
		Piece pw2 = new Pawn(new Position(1,6), ColorEnum.WHITE);
		Piece pw3 = new Pawn(new Position(2,6), ColorEnum.WHITE);
		Piece pw4 = new Pawn(new Position(3,6), ColorEnum.WHITE);
		Piece pw5 = new Pawn(new Position(4,6), ColorEnum.WHITE);
		Piece pw6 = new Pawn(new Position(5,6), ColorEnum.WHITE);
		Piece pw7 = new Pawn(new Position(6,6), ColorEnum.WHITE);
		Piece pw8 = new Pawn(new Position(7,6), ColorEnum.WHITE);
		
		//Octava fila
        Piece rw = new Rook(new Position(0,7), ColorEnum.WHITE);
		//Piece knw = new Knight(new Position(1,7), ColorEnum.WHITE);
		Piece bw = new Bishop(new Position(2,7), ColorEnum.WHITE);
		Piece qw = new Queen(new Position(3,7), ColorEnum.WHITE);
		Piece kw = new King(new Position(4,7), ColorEnum.BLACK);
		Piece bw2= new Bishop(new Position(5,7), ColorEnum.WHITE);
		//Piece knw2 = new Knight(new Position(6,7), ColorEnum.WHITE);
		Piece rw2= new Rook(new Position(7,7), ColorEnum.WHITE);
		
        System.out.println(rb.getLegalMoves());
		//System.out.println(knb.getLegalMoves());
		System.out.println(bb.getLegalMoves());
		System.out.println(qb.getLegalMoves());
		System.out.println(kb.getLegalMoves());
		System.out.println(bb2.getLegalMoves());
		//System.out.println(knb2.getLegalMoves());
		System.out.println(rb2.getLegalMoves());
		
		System.out.println(pb.getLegalMoves());
		System.out.println(pb2.getLegalMoves());
		System.out.println(pb3.getLegalMoves());
		System.out.println(pb4.getLegalMoves());
		System.out.println(pb5.getLegalMoves());
		System.out.println(pb6.getLegalMoves());
		System.out.println(pb7.getLegalMoves());
		System.out.println(pb8.getLegalMoves());
		
        System.out.println(rw.getLegalMoves());
		//System.out.println(knw.getLegalMoves());
		System.out.println(bw.getLegalMoves());
		System.out.println(qw.getLegalMoves());
		System.out.println(kw.getLegalMoves());
		System.out.println(bw2.getLegalMoves());
		//System.out.println(knw2.getLegalMoves());
		System.out.println(rw2.getLegalMoves());
		
		System.out.println(pw.getLegalMoves());
		System.out.println(pw2.getLegalMoves());
		System.out.println(pw3.getLegalMoves());
		System.out.println(pw4.getLegalMoves());
		System.out.println(pw4.getLegalMoves());
		System.out.println(pw5.getLegalMoves());
		System.out.println(pw6.getLegalMoves());
		System.out.println(pw7.getLegalMoves());
    }
}