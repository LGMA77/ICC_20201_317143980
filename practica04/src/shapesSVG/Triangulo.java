/**
*@author : Luis Geovanni Méndez Ávila 
*date : 22 september 2019
**/
package shapesSVG;

/**
* Clase que hace triángulos.
*@param j : Es el primer vértice del triángulo
*@param k : Es el segundo vértice del triángulo
*@param l : Es el tercer vértice del triángulo
*@param perimetro : Define el perímetro del triángulo. Debe darse en valor de double
*@param area : Define el área del triángulo. Debe darse en valor de double
**/
public class Triangulo{
	private Punto j;
	private Punto k;
	private Punto l;
	private double perimetro;
	private double area;

/**
Getters de los vértices del triángulo.
*@param getJ : devuelve el primer vértice del triángulo
*@param getK : devuelve el segundo vértice del triángulo
*@param getL : devuelve el tercer vértice del triángulo
*/
public Punto getJ(){
	return this.j;
}

public Punto getK(){
	return this.k;
}

public Punto getL(){
	return this.l;
}

/**
*Setters para los vértices del triángulo.
*@param setJ : tú defines dónde se ubicará el primer vértice
*@param setK : tú defines dónde se ubicará el segundo vértice
*@param setL : tú defines dónde se ubicará el tercer vértice
*/
public void setJ(Punto j){
	this.j = j;
}

public void setK(Punto k){
	this.k = k;
}

public void setAlto(Punto l){
	this.l = l;
}

/**
* Constructor con 3 vértices (Punto, Punto, Punto)
* @param j : El primer vértice del triángulo
* @param k : El segundo vértice del triángulo
* @param l : El tercer vértice del trángulo
*/
public Triangulo(Punto j, Punto k, Punto l){
	this.j = j;
	this.k = k;
	this.l = l;
}

/**
* Constructor con valores double para las coordenadas de los vertices. Sirve para no usar el constructor con puntos
* @param x : Coordenada x del primer vértice
* @param y : Coordenada y del primer vértice
* @param x2 : Coordenada x del segundo vértice
* @param y2 : Coordenada y del segundo vértice
* @param x3 : Coordenada x del tercer vértice
* @param y3 : Coordenada y del tercer vértice
*/
public Triangulo(double x, double y, double x2, double y2, double x3, double y3){

}

/**
* Constructor vacío. Crea por defecto un triángulo en los puntos (2.0 , 0.0) , (1.0 , 2.0) , (3.0 , 2.0);
*/
public Triangulo(){
	Punto j = new Punto(2.0 , 0.0);
	Punto k = new Punto(1.0 , 2.0);
	Punto l = new Punto(3.0 , 2.0);
	this.j = j;
	this.k = k;
	this.l = l;
}

/**
* Método toSVG.
*@return svg : La respresentación SVG del rectángulo en String
*/
public String toSVG(){
	String svg = "";
	svg = "<polygon points='" +
	j.getX() + "," + j.getY() + " " +
	k.getX() + "," + k.getY() + " " +
	l.getX() + "," + l.getY() +
	"' style='fill:lime;stroke:purple;stroke-width:1' />";
	return svg;
}

/**
*Método toString.
*@return toString : La representación de los parámetros del rectángulo en formato String
*/
@Override
public String toString(){
	String toString = "";
	toString = "Primer vértice: " + j + "\n"
	+ "Segundo vértice: " + k + "\n" 
	+"Tercer vértice: " + l ; 
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