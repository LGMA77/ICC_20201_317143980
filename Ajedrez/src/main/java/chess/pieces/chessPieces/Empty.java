package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
*Clase Empty . Clase hija de Piece. Define una pieza vacia.
*/
public class Empty extends Piece{
	
/**
*Constructor de Empty. Llama al metodo constructor de la clase Piece y agrega su propio tipo.
*/
    public Empty(Position p, ColorEnum c){
        super(p,c);
        this.type = PiecesTypeEnum.EMPTY;
    }

/**
*Constructor vacio. Por default pone una pieza vacia en la casilla 0,0 y no tiene color.
*/
    public Empty(){
        super(new Position(0,0),ColorEnum.NONE);
        this.type = PiecesTypeEnum.EMPTY;
    }

/**
*Metodo getLegalMoves. Mete a una lista todos los movimientos posibles de la pieza vacia.
*return list con nada.
*/
    @Override
    public List<Position> getLegalMoves() {
        return new LinkedList<>();
    }

/**
*Metodo equals. Compara si una pieza es vacia o no.
*@return true or false, dependiendo la situacion.
*/
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Empty)? true: false;
    }

}