package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;


/**
*Esta mal :( 
*/
public class King extends Piece{
	
	public King(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.KING;
    }

@Override
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
        this.legalMoves = new LinkedList<Position>();

        for (int i = this.position.getX(); i == i+1; i++) {
			for (int j = this.position.getY(); j == j-1; j--){
				Position nextLegalPosition = new Position(i, j);
				if (this.isAppendable(nextLegalPosition) == -1)
					break;
				if (this.isAppendable(nextLegalPosition) == 0) {
					this.legalMoves.add(nextLegalPosition);
					break;
				}
				this.legalMoves.add(nextLegalPosition);	
			}
		}
		
        for (int i = this.position.getX(); i == i+1; i++) {
			for (int j = this.position.getY(); j == j+1; j++){
				Position nextLegalPosition = new Position(i, j);
				Piece piece = board.getPiece(nextLegalPosition);
				if (piece.getColor() == this.getColor())
					break;
				if (piece.getColor() != ColorEnum.NONE) {
					this.legalMoves.add(nextLegalPosition);
					break;
				}
				this.legalMoves.add(nextLegalPosition);				
			}
        }
		
        for (int i = this.position.getX(); i == i-1; i--) {
			for (int j = this.position.getY(); j == j-1; j--){
				Position nextLegalPosition = new Position(i, j);
				Piece piece = board.getPiece(nextLegalPosition);
				if (piece.getColor() == this.getColor())
					break;
				if (piece.getColor() != ColorEnum.NONE) {
					this.legalMoves.add(nextLegalPosition);
					break;
				}
				this.legalMoves.add(nextLegalPosition);				
			}
        }
		
        for (int i = this.position.getX(); i == i-1; i--) {
			for (int j = this.position.getY(); j == j+1; j++){
				Position nextLegalPosition = new Position(i, j);
				Piece piece = board.getPiece(nextLegalPosition);
				if (piece.getColor() == this.getColor())
					break;
				if (piece.getColor() != ColorEnum.NONE) {
					this.legalMoves.add(nextLegalPosition);
					break;
				}
				this.legalMoves.add(nextLegalPosition);				
			}
        }
		
        for (int i = this.position.getX(); i == i+1; i++) {
            Position nextLegalPosition = new Position(i, this.position.getY());
            if (this.isAppendable(nextLegalPosition) == -1)
                break;
            if (this.isAppendable(nextLegalPosition) == 0) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
        }

        for (int i = this.position.getX(); i == i-1; i--) {
            Position nextLegalPosition = new Position(i, this.position.getY());
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        for (int i = this.position.getY(); i == i+1; i++) {
            Position nextLegalPosition = new Position(this.position.getX(), i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        for (int i = this.position.getY(); i == i-1; i--) {
            Position nextLegalPosition = new Position(this.position.getX(), i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }
		
		return this.legalMoves;
	}
}