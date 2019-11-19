package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
*Clase Queen. Define una pieza de tipo Queen, pero es hija de FakeQueen porque se me hacia mejor asi que poner una torre auxiliar :^)
*/
public class Queen extends FakeQueen {

/**
*Constructor de Queen. Llama al constructor de FakeQueen y suma su respectivo tipo de pieza.
*/
    public Queen(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.QUEEN;
    }

/**
*Metodo getLegalMoves. Hace una lista con los movimientos posibles de la clase madre FakeQueen, sumados a los del alfil auxiliar.
*@return legalMoves. Lista con los movimientos posibles.
*/
@Override
    public List<Position> getLegalMoves() {
		//Bishop auxiliar para poder sumar sus movimientos a Queen.
		Bishop aux = new Bishop(this.getPosition() , this.getColor());
		List slideMoves = aux.getLegalMoves();
		this.legalMoves = super.getLegalMoves();
		legalMoves.addAll(slideMoves);
		return this.legalMoves;
	}
}