/**
*@author : Luis Geovanni Méndez Ávila
*Date: 19 september 2019
*/
package shapesSVG;

/**
*Clase que hace líneas a partir de puntos.
*@param a : punto a de la línea.
*@param b : punto b de la línea.
*@param longitud : es la longitud o distancia de la línea
*/
public class Linea{
	private Punto a;
	private Punto b;
	private double longitud;

/**
Getters para los puntos de la línea
*@param getA: devuelve el punto A.
*@param getB: devuelve el punto B.
*/
public Punto getA(){
	return this.a;
}

public Punto getB(){
	return this.b;
}

/**
*Setters para los puntos de la línea.
*@param setA: tú defines dónde se ubicará el punto A, recibe un valor en términos de la clase punto. 
*@param setB: tú defines dónde se ubicará el punto B, recibe un valor en términos de la clase punto.
*/
public void setA(Punto a){
	this.a = a;
}
public void setB(Punto b){
	this.b = b;
}

/**
*Constructor para línea con parámetros. Recibe 2 puntos.
*@param a : da el punto a en terminos de Punto
*@param b : da el punto b en terminos de Punto
*/
public Linea(Punto a , Punto b){
	this.a = a;
	this.b = b;
}

/**
*Constructor con valores de coordenadas, para no usar el constructor con puntos.
*@param x : Valor de la coordenada x del primer punto de la línea
*@param y : Valor de la coordenada y del primer punto de la línea
*@param x2 : Valor de la coordenada x del segundo punto de la línea
*@param y2 : Valor de la coordenada y del segundo punto de la línea
*/
public Linea(double x, double y, double x1, double y2){

}

/**
*Constructor sin parámetros para línea. Por defecto da una línea con puntos en (0.0 , 0.0) y (1.0,0.0)
*/
public Linea(){
	Punto a = new Punto (0.0 , 0.0);
	Punto b = new Punto (0.0 , 1.0);
	this.a = a;
	this.b = b;
}

/**
*Método to SVG: sirve para dar el fomato SVG de línea.
*@return String SVG
*/
public String toSVG(){
	String svg = "";
	svg = "<line x1= " + a.getX() + " y1= " + a.getY() + " x2= " + b.getX() + " y2= " + b.getY() + " style='stroke:rgb(255,0,0);stroke-width:2' />";
	return svg;
}

/**
*Método toString: te devuelve la información de la línea en formato String.
*@return String toString
*/
@Override
public String toString(){
	String cadena = "";
	cadena = "Puntos de la línea:" + "\n" + 
	a + "," + b ;
	return cadena;
}

/**
*Método equals: Compara dos líneas y te dice si son iguales.
*@return boolean equals
**/
@Override
public boolean equals(Object o) {
	if (this == o){
		return true;
	} else {
		return false;
	}
}
}