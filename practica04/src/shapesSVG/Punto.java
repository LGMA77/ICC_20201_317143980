/**
*@author : Luis Geovanni Méndez Ávila
*Date: 17 september 2019
*/
package shapesSVG;

/**
*Clase que crea puntos.
*@param x : Es la coordenada x del punto, debe darse el valor en double
*@param y : Es la coordenada y del punto, debe darse el valor en double
*@param magnitud: Es la magintud del punto, debe darse en valor de double
*/
public class Punto{
	private double x;
	private double y;
	private double magnitud;

/**
*Getters para las coordenadas del punto. Devuelve la cordenada que quieres obtener.
*@return getX: devuelve la coordenada x del punto.
*@return getY: devuelve la coordenada y del punto.
*/
public double getX(){
	return this.x;
}

public double getY(){
	return this.y;
}

/**
*Setters para las coordenadas del punto.
*@return setX: Tú defines dónde será la coordenada x, recibe un valor en tipo double. 
*@return setY: Tú defines dónde será la coordenada y, recibe un valor en tipo double.
*/
public void setX(double x){
	this.x = x;
}

public void setY(double y){
	this.y = y;
}

/**
*Constructor con parámetros. Recibe parámetro x y parámetro y.
*@param x : dar el valor de x en double
*@param y : dar el valor de y en double
*/
public Punto(double x , double y){
	this.x = x;
	this.y = y;
}

/**
*Constructor sin parámetros. Pone por defecto un punto con coordendas x=0 e y=0.
*/
public Punto(){
	this.x = 0.0;
	this.y = 0.0;
}

/**
*Método para obtener la distancia entre dos puntos.
*@return double distancia.
*/
public static double distancia(Punto a , Punto b){
	double d = Math.sqrt((Math.pow((b.x- a.x),2)) + (Math.pow((b.y- a.y),2))); 
	return d;		
}

/**
*Método toSVG: Método que te devuelve el SVG del punto.
*@return string SVG.
*/
public String toSVG(){
	String svg = "";
	svg =  "<circle cx= " + x + " cy= " + y + " stroke='black' stroke-width='4' fill='black' />" ;
	return svg;
}

/**
*Método toString: Regresa la información relativa al punto en formato String.
*@return toString.
*/
@Override
public String toString(){
	String cadena = "";
	cadena = "Cordenadas del vector: (" + x + "," + y + ")";
	return cadena;
}

/**
*Método equals: Compara dos puntos y te dice si es cierto o falso que sean iguales.
*@return boolean equals.
*/
@Override
public boolean equals(Object o) {
	if (this == o){
		return true;
	} else {
		return false;
	}
}
}