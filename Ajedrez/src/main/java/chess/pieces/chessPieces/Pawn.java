package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
*Clase pawn. Define una pieza de tipo pawn.
*/
public class Pawn extends Piece {
	
/**
*Constructor de pawn. Llama al constructor de Piece y suma su respectivo tipo de pieza.
*/
    public Pawn(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.PAWN;
    }

/**
*Metodo getLegalMoves. Implementa el metodo abstracto de Piece. Da una lista con los movimentos posibles.
*@return legalMoves. Lista con los movimentos posibles.
*/	
@Override
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
        this.legalMoves = new LinkedList<Position>();
		
		//if que determina si pawn es BLACK entonces unicamente ira una casilla hacia abajo.
		if(this.color == ColorEnum.BLACK){
			int y = (this.position.getY()+1);
			Position nextLegalPosition = new Position(this.position.getX(),y);
			if (this.isAppendable(nextLegalPosition) == -1){
				System.out.println(":(");
			}
			if (this.isAppendable(nextLegalPosition) == 0){
				this.legalMoves.add(nextLegalPosition);
			}
			this.legalMoves.add(nextLegalPosition);
		}
		
		//if que determina si pawn es BLACK entonces unicamente ira una casilla hacia arriba.
		if(this.color == ColorEnum.WHITE){
			int y = (this.position.getY()-1);
			Position nextLegalPosition = new Position(this.position.getX(),y);
			if (this.isAppendable(nextLegalPosition) == -1){
				System.out.println(":(");
			}
			if (this.isAppendable(nextLegalPosition) == 0){
				this.legalMoves.add(nextLegalPosition);
			}
			this.legalMoves.add(nextLegalPosition);
		}
		return this.legalMoves;
	}
}