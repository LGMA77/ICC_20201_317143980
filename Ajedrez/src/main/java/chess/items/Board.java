package chess.items;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.chessPieces.Empty;
import chess.pieces.chessPieces.*;

/**
*Clase Board. Modela el tablero de ajedrez.
*@param SIZE : constante de tipo entero que establecera el ancho y largo de la matriz.
*@param matrix : matriz de 8x8 que servira para almacenar las piezas del ajedrez.
*@param Board instance : Servira para un metodo.
*/
public class Board{
    public int SIZE = 8;
    public Piece[][] matrix;
    private static Board instance = null;
    
/**
*Constructor de la clase Board
*/	
	private Board(){
        this.matrix = new Piece[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.matrix[i][j] = new Empty(new Position(i, j), ColorEnum.NONE);
            }
        }
		//Aquí se ponen las piezas.
		//Primera fila.
        this.matrix[0][0] = new Rook(new Position(0, 0), ColorEnum.BLACK);
        //this.matrix[1][0] = new Knight(new Position(1, 0), ColorEnum.BLACK);
		this.matrix[2][0] = new Bishop(new Position(2, 0), ColorEnum.BLACK);
        this.matrix[3][0] = new Queen(new Position(3, 0), ColorEnum.BLACK);
        this.matrix[4][0] = new King(new Position(4, 0), ColorEnum.BLACK);
        this.matrix[5][0] = new Bishop(new Position(5, 0), ColorEnum.BLACK);
		//this.matrix[6][0] = new Knight(new Position(6, 0), ColorEnum.BLACK);
		this.matrix[7][0] = new Rook(new Position(7, 0), ColorEnum.BLACK);
		
		
		//Segunda fila.
		this.matrix[0][1] = new Pawn(new Position(0, 1), ColorEnum.BLACK);
		this.matrix[1][1] = new Pawn(new Position(1, 1), ColorEnum.BLACK);
		this.matrix[2][1] = new Pawn(new Position(2, 1), ColorEnum.BLACK);
		this.matrix[3][1] = new Pawn(new Position(3, 1), ColorEnum.BLACK);
		this.matrix[4][1] = new Pawn(new Position(4, 1), ColorEnum.BLACK);
		this.matrix[5][1] = new Pawn(new Position(5, 1), ColorEnum.BLACK);
		this.matrix[6][1] = new Pawn(new Position(6, 1), ColorEnum.BLACK);
		this.matrix[7][1] = new Pawn(new Position(7, 1), ColorEnum.BLACK);
		
		//Septima fila
		this.matrix[0][6] = new Pawn(new Position(0, 6), ColorEnum.WHITE);
		this.matrix[1][6] = new Pawn(new Position(1, 6), ColorEnum.WHITE);
		this.matrix[2][6] = new Pawn(new Position(2, 6), ColorEnum.WHITE);
		this.matrix[3][6] = new Pawn(new Position(3, 6), ColorEnum.WHITE);
		this.matrix[4][6] = new Pawn(new Position(4, 6), ColorEnum.WHITE);
		this.matrix[5][6] = new Pawn(new Position(5, 6), ColorEnum.WHITE);
		this.matrix[6][6] = new Pawn(new Position(6, 6), ColorEnum.WHITE);
		this.matrix[7][6] = new Pawn(new Position(7, 6), ColorEnum.WHITE);
		
		//Octava fila
        this.matrix[0][7] = new Rook(new Position(0, 7), ColorEnum.WHITE);
        //this.matrix[1][7] = new Knight(new Position(1, 7), ColorEnum.WHITE);
        this.matrix[2][7] = new Bishop(new Position(2, 7), ColorEnum.WHITE);
		this.matrix[3][7] = new Queen(new Position(3, 7), ColorEnum.WHITE);
        this.matrix[4][7] = new King(new Position(4, 7), ColorEnum.WHITE);
        this.matrix[5][7] = new Bishop(new Position(5, 7), ColorEnum.WHITE);
        //this.matrix[6][7] = new Knight(new Position(6, 7), ColorEnum.WHITE);
		this.matrix[7][7] = new Rook(new Position(7, 7), ColorEnum.WHITE);
    }

/**
*Metodo getInstance. Hace que nada más haya un tablero para todos los juegos.
*/
    public static Board getInstance(){
        if(instance == null)
            instance = new Board();
        return instance;
    }
	
/**
*Metodo getSize. Getter para el tamaño del tablero.
@return SIZE : int del tamaño del tablero.
*/	
    public int getSize(){
        return this.SIZE;
    }


/**
*Metodo move. Mueve la pieza, en caso de tener un caso de movimiento legal, en caso contrario no lo hace.
*/
    public void move(Position p, Position q){
        if(!p.isLegal() || !q.isLegal())return;
        Piece piece = this.getPiece(p);
        if(!piece.isLegalMove(q))return;
        piece.moveTo(q);
        this.matrix[p.getX()][p.getY()] = new Empty(p,ColorEnum.NONE);
        this.matrix[q.getX()][q.getY()] = piece; 
    }
	
/**
*Metodo getPiece. Regresa la pieza dependiendo de la ubicación de la misma. 
*/
    public Piece getPiece(Position p){
        return this.matrix[p.getX()][p.getY()];
    }

/**
*Metodo toString. Regresa la representacion en String de las casillas del tablero.
*@return result : La representacion en String de las casillas del tablero.
*/
    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result = " "+ this.matrix[i][j]+" "+result;
            }
            result += '\n';
        }
        return result;
    }

}