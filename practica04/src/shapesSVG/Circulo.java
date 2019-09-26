/**
*@author : Luis Geovanni Méndez Ávila
*Date: 19 september 2019
*/
package shapesSVG;

/**
*Clase que hace círculos.
*@param centro : punto a de la línea.
*@param radio : punto b de la línea.
*@param perimetro : perímetro del círculo
*@param area : área del círculo
*/
public class Circulo{
	private Punto centro;
	private double radio;
	private double perimetro;
	private double area;

/**
Getters para los parámetros del círculo.
*@param getCentro : devuelve el punto fijo del rectángulo
*@param getRadio : devuelve el ancho del rectángulo
*/
public Punto getCentro(){
	return this.centro;
}

public Double getRadio(){
	return this.radio;
}

/**
*Setters para los puntos de la línea.
*@param setCentro : tú defines dónde se ubicará el centro del círculo
*@param setRadio : tú defines dónde se ubicará el radio del círculo
*/
public void setCentro(Punto centro){
	this.centro = centro;
}

public void setRadio(double radio){
	this.radio = radio;
}

/**
* Constructor con 2 parámetros (punto , radio)
* @param centro : El punto central del cículo
* @param radio : El radio del círculo
*/
public Circulo(Punto centro, double radio){
	this.centro = centro;
	this.radio = radio;
}

/** 
* Constructor vacío. Por defecto hace un círculo con centro en (50.0 , 50.0) y con radio 10.0
*/
public Circulo(){
	Punto centro = new Punto(50.0 , 50.0);
	double radio = 1.0;
}

/**
* Método toSVG . Muestra la representación en formato SVG del círculo.
*@return String svg
*/
public String toSVG(){
	String svg = "";
	svg =   "<circle cx= " + centro.getX() + " cy= " + centro.getY() +  " r= " + radio + " stroke='black' stroke-width='3' fill='red' />" ;;
  return svg;
}

/**
* Método toString. Regresa la información del círculo en formato String.
* @return toString
*/
@Override
public String toString(){
	String toString = "";
	toString = "Centro del círculo: "+ centro + "\n" +
	"Radio del círculo: "+ radio ;
	return toString;
}

@Override
public boolean equals(Object o) {
	if (this == o){
		return true;
	} else {
		return false;
	}
}
}