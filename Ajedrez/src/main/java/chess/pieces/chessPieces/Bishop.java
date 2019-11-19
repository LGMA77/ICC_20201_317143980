package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
*Clase Bishop. Define la pieza de tipo Bishop. Hija de la clase Piece.
*/
public class Bishop extends Piece {
	
/**
*Constructor de Bishop. Llama al constructor de la clase Piece y suma el tipo de pieza correspondiente.
*/
    public Bishop(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.BISHOP;
    }

/**
*Metodo getLegalMoves. Implemeta el metodo abstracto de la clase Piece. Crea una lista que tiene los movimientos
*posibles de la pieza tipo Bishop.
*@return legalMoves. La lista con movimientos.
*/
@Override
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
        this.legalMoves = new LinkedList<Position>();
		
		//for para el movimiento hacia la esquina superior derecha.
        for (int i = 1; i + this.position.getX()<= 7 && this.position.getY() - i >= 0; i ++) {
            Position nextLegalPosition = new Position(i + this.position.getX(), this.position.getY() - i);
            if (this.isAppendable(nextLegalPosition) == -1)
                break;
            if (this.isAppendable(nextLegalPosition) == 0) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
        }
		
		//for para el movimiento hacia la esquina inferior derecha.
        for (int i = 1; i + this.position.getX()<= 7 && i + this.position.getY()<= 7; i ++) {
            Position nextLegalPosition = new Position(i + this.position.getX(), i + this.position.getY());
            if (this.isAppendable(nextLegalPosition) == -1)
                break;
            if (this.isAppendable(nextLegalPosition) == 0) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
        }
		
		//for para el movimiento hacia la esquina inferior izquierda.
        for (int i = 1; this.position.getX() - i >= 0 && i + this.position.getY() <= 7; i ++) {
            Position nextLegalPosition = new Position(this.position.getX() - i, i + this.position.getY());
            if (this.isAppendable(nextLegalPosition) == -1)
                break;
            if (this.isAppendable(nextLegalPosition) == 0) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
        }
		
		//for para el movimiento hacia la esquina superior izquierda.
        for (int i = 1; this.position.getX() - i >= 0 && this.position.getY() - i >= 0; i ++) {
            Position nextLegalPosition = new Position(this.position.getX() - i, this.position.getY() - i);
            if (this.isAppendable(nextLegalPosition) == -1)
                break;
            if (this.isAppendable(nextLegalPosition) == 0) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
        }
		return this.legalMoves;
	}
}