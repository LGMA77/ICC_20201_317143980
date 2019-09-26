/**
*@author : Luis Geovanni Méndez Ávila
*Date: 24 september 2019
*/

import shapesSVG.*;
/**
*Clase que imprime un código SVG que debe trazar 5 figuras geométricas.
*@param punto : punto para el punto SVG
*@param linea : línea para línea SVG
*@param rectangulo : rectángulo para el rectángulo SVG
*@param triangulo : triángulo para el triángulo SVG
*@param circulo : circulo para el circulo SVG
*@param a : punto que sirve como extremo para la línea
*@param b : punto que sirve como extremo para la línea
*@param p : punto que sirve para el rectángulo
*@param j : punto que sirve como vértice del triángulo
*@param k : punto que sirve como vértice del triángulo
*@param l : punto que sirve como vértice del triángulo
*@param centro : punto que sirve como centro del círculo
*/
public class Prueba{
	public static Punto punto;
	public static Linea linea ; 
	public static Rectangulo rectangulo ;
	public static Triangulo triangulo ;
	public static Circulo circulo ;
	public static Punto a = new Punto (4.0, 7.0);
	public static Punto b = new Punto (8.0 , 11.0);
	public static Punto p = new Punto (4.4 , 7.7);
	public static Punto j = new Punto (14.0 , 17.0);
	public static Punto k = new Punto (9.0 , 7.4);
	public static Punto l = new Punto (18.8 , 2.0);
	public static Punto centro = new Punto (20.0 , 22.0);

/**
*Método main. Crea las figuras que se van a imprimir.
*/
	public static void main(String[] args) {
		punto = new Punto(7.0 , 4.0);
		
		linea = new Linea (a , b);
		
		rectangulo = new Rectangulo (p , 12.0 , 4.0);

		triangulo = new Triangulo(j,k,l);

		circulo = new Circulo(centro , 15.4);

/**
*Prints. Imprime en formato SVG las figuras creadas en el método main usando el método toSVG.
*@return punto.SVG (punto en fórmato SVG)
*@return linea.SVG (línea en fórmato SVG)
*@return rectangulo.SVG (rectángulo en fórmato SVG)
*@return triangulo.SVG (triángulo en fórmato SVG)
*@return circulo.SVG (círculo en fórmato SVG)
*/
	System.out.println ("<svg width='1000' height='1000'>"+"\n"+
		punto.toSVG() +"\n"+
		linea.toSVG() +"\n"+
		rectangulo.toSVG() +"\n"+
		triangulo.toSVG() +"\n"+
		circulo.toSVG() +"\n"+
		"</svg>");
	}
}