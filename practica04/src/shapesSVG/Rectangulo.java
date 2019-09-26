/**
*@author : Luis Geovanni Méndez Ávila 
*date : 22 september 2019
**/
package shapesSVG;

/**
* Clase que hace rectángulos.
*@param p : Es un punto que nos sirve para fijar el rectángulo
*@param ancho : Define el ancho del rectángulo. Debe darse en valor double
*@param alto : Define lo alto del rectángulo. Debe darse en valor de double
*@param perimetro : Define el perímetro del rectángulo. Debe darse en valor de double
*@param area : Define el área del rectángulo. Debe darse en valor de double
**/
public class Rectangulo{
	private Punto p;
	private double ancho;
	private double alto;
	private double perimetro;
	private double area;

/**
Getters para los parámetros de rectángulo.
*@param getP : devuelve el punto fijo del rectángulo
*@param getAncho : devuelve el ancho del rectángulo
*@param getAlto : devuelve el alto del rectángulo
*/
public Punto getP(){
	return this.p;
}

public Double getAncho(){
	return this.ancho;
}

public Double getAlto(){
	return this.alto;
}

/**
*Setters para los puntos de la línea.
*@param setP : tú defines dónde se ubicará el punto fijo del rectángulo
*@param setAncho : tú defines cuánto será el ancho del rectángulo
*@param setAlto : tú defines cuánto será el alto del rectángulo
*/
public void setP(Punto p){
	this.p = p;
}

public void setAncho(double ancho){
	this.ancho = ancho;
}

public void setAlto(double alto){
	this.alto = alto;
}

/**
* Constructor con 3 parámetros (punto, ancho, alto)
* @param p : El punto fijo del rectángulo
* @param ancho : El ancho del rectángulo
* @param alto : El alto del retángulo
*/
public Rectangulo(Punto p, double ancho, double alto){
	this.p = p;
	this.ancho = ancho;
	this.alto = alto;
}

/**
* Constructor sin parámetros. Valores por defecto: Punto(50.0,50.0) , Ancho (1.0), Alto(1.0)
*/
public Rectangulo(){
	Punto p = new Punto(50.0,50.0);
	double ancho = 1.0;
	double alto = 1.0;
	this.p = p;
	this.ancho = ancho;
	this.alto = alto;
}

/**
* Método toSVG.
*@return svg : La respresentación SVG del rectángulo en String
*/
public String toSVG(){
	String svg = "";
	svg = "<rect width= " + ancho + " height= " + alto + " rx= " + p.getX() + " ry= " + p.getY() + " style='fill: yellow; stroke: green; stroke-width: 1mm;'/>" ;
	return svg;
}

/**
*Método toString.
*@return toString : La representación de los parámetros del rectángulo en formato String
*/
@Override
public String toString(){
	String toString = "";
	toString = "Punto fijo del rectángulo: " + p + "\n"
	+ "Ancho del rectángulo: " + ancho + "\n" 
	+"Alto del rectángulo: " + alto ; 
	return toString;
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