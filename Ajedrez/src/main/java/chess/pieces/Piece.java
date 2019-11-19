package chess.pieces;

import java.util.List;
import chess.items.Board;
import chess.items.Position;

/**
*Clase piece. Define los metodos y atributos (algunos de ellos abstractos)que deben tener todas las piezas.
*@param position : par de coordenadas que determinan la ubicación de la pieza.
*@param legalMoves : lista de los movimientos legales.
*@param type : tipo de pieza.
*@param color : color de la pieza.
*@param board : tablero.
*/
public abstract class Piece{
    protected Position position;
    protected List<Position> legalMoves = null;
    protected PiecesTypeEnum type;
    protected ColorEnum color;
    protected Board board;

/**
*Constructor de la clase pieza. Se establece que recibe una posicion y un color
*/
    public Piece(Position p, ColorEnum color) {
        this.position = p;
        this.color = color;
    }

/**
*Metodo isAppendable. Determina si puedes tomar una pieza del equipo contrario dependiendo del color
*@return -1 , no es posible.
*@return 0 , si es posible. 
*/
    public int isAppendable(Position p){
        Board board = Board.getInstance();
        Piece piece = board.getPiece(p);
        if(piece.getColor() == this.getColor())return -1;
        if(piece.getColor() != ColorEnum.NONE)return 0;
        return 1;
    }
  
/**
*Metodo getPosition. Te devuelve la posicion de tu pieza.
*@return position. La posicion de la pieza.
*/  
    public Position getPosition(){
        return this.position;
    }
	
/**
*Metodo getColor. Te devuelve el color de la pieza.
*@return color . El color de la pieza.
*/
    public ColorEnum getColor(){
        return this.color;
    }

/**
*Metodo getType. Devuelve el tipo de pieza.
*@return type. El tipo de la pieza.
*/
    public PiecesTypeEnum getType(){
        return this.type;
    }
	
/**
*Metodo moveTo. No tengo idea de que haga.
*/
    public void moveTo(Position p) {
        if (isLegalMove(p)) {
            this.position = p;
            this.legalMoves = null;
            return;
        } else
            return;
    }
	
/**
*Metodo getLegalMoves. Crea una lista con los posibles movimientos de las piezas. Este metodo se debe
*implementar en una clase hija, ya que los movimientos van a variar dependiendo de la pieza hija.
*/
    public abstract List<Position> getLegalMoves();
   
   
/**
*Metodo isLegalMove. Considera si es posible hacer el movimiento deseado dependiendo si está en la lista de
*getLegalMoves.
*@return true or false , dependiendo de la situacion.
*/
    public boolean isLegalMove(Position p) {
        List<Position> moves = this.getLegalMoves();
        return (moves.contains(p)) ? true : false;
    }

/**
*Metodo toString. Regresa la representacion en String de la pieza.
*/
    @Override
    public String toString() {
        return this.type.toString();
    }

/**
*Metodo equals. Compara si una pieza es igual a otra.
*@return true or false , dependiendo de la situacion.
*/
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Piece))return false;
        Piece p = (Piece)obj;
        if(p.getType().equals(this.type) && p.getColor().equals(this.getColor()) && p.getPosition().equals(this.position))
        return true;
        return false;
    }
}