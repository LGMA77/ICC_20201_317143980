package chess.items;

/**
*Clase Position. Define un par de valores que serán coordenadas.
*@param x : Es la coordenada x.
*@param y : Es la coordenada y.
*/
public class Position{
    private int x;
    private int y;


/**
*Constructor de la clase Position.
*/
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
	 *Metodo getX : Regresa el valor de la coordenada x.
     * @return x
     */
    public int getX() {
        return x;
    }

/**
*Metodo isLegal. Evalua si las coordendas de Position están en el grango de 0 a 7.
*@return true or false , dependiendo de la sircunstancia.
*/
    public boolean isLegal(){
        return (this.x < 8 && this.x > -1 && this.y < 8 && this.y > -1 )? true: false;
    }
	
    /**
	 *Metodo getY : Regresa el valor de la coordenada y.
     * @return y
     */
    public int getY() {
        return y;
    }

/**
*Metodo equals. Compara si un objeto de la clase Position es el mismo o diferente.
*@return true or false , dependiendo de la sircunstancia.
*/
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Position))return false;
        Position p = (Position)obj;
        return (p.getX()==this.getX() && p.getY()== this.getY())? true: false;
    }


/**
*Metodo toString. Regresa la representacion en String de Position.
*/
    @Override
    public String toString() {
        return "  ||x:"+this.getX()+" y:"+this.getY()+"||";
    }
	
/**
*Metodo isOutOfBoard. Determina si una pieza está fuera del tablero o dentro.
*@return true or false , dependiendo de la situacion.
*/
    public boolean isOutOfBoard(int board_size){
        if(this.y >= board_size)return false;
        if(this.x >= board_size)return false;
        if(this.y < 0)return false;
        if(this.x < 0)return false;
        return true;
    }
}