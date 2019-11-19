package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;


/**
*Clase FakeQueen. Hace una pieza hija de Rook que se hace pasar por Queen. Esta clase era para la practica 7.
*/
public class FakeQueen extends Rook {
	
/**
*Constructor de FakeQueen. Llama al constructor de la clase Rook y suma su tipo de pieza.
*/
    public FakeQueen(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.FK;
    }

/**
*Metodo getLegalMoves. Llena una lista con los movimientos posibles de la pieza. En este caso seran los movimientos
* heredados por Rook.
*@return legalMoves. Lista de movimientos posibles.
*/
@Override
    public List<Position> getLegalMoves() {
		this.legalMoves = super.getLegalMoves();
		return this.legalMoves;
	}
}