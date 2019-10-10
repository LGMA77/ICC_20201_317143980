import java.util.ArrayList;
import java.util.Arrays;

/**
*@author : Luis Geovanni Mendez Avila
* Date : 4 october 2019
* Clase para probar arreglos, variables de control y algoritmos
*/

public class Control{

/**
*@param palabra : String que será inspeccionado para poder saber si es un palindromo
*/    
    public static boolean problema1(String palabra){
        for(int i = 0; i < palabra.length(); i++){
			if (palabra.charAt(i) != palabra.charAt(palabra.length() -i -1)){
				return false;
			}
		} return true;	
    }
    
    public static boolean problema2(int[] arreglo, int k){
		for(int i = 0 ; i < arreglo.length; i++){
			for(int j = 0 ; j < arreglo.length; j++){
			int suma = (arreglo[i] + arreglo[j]);
			if(suma  == k){
				return true;
			}
			}
		}
        return false;
    }
    
    public static void problema3(int[] arreglo){
		for(int i = 0; i<arreglo.length -1; i++){
			int chico = i;
			for(int j = i+1; j<arreglo.length; j++){
				if (arreglo[j] < arreglo [chico]){
					chico = j;
				}				
			}
			if (i != chico){
				int otro = arreglo[i];
				arreglo[i] = arreglo[chico];
				arreglo[chico] = otro;
			}
		}
        return;
    }
    
    public static boolean problema4(int[] arreglo, int buscando){
		Arrays.sort(arreglo);
		int primero = 0; 
		int fin = arreglo.length -1;
		while(primero <= fin){
			int medio = (primero + fin)/2;
			if(arreglo[medio] == buscando){
				return true;
			}else if(buscando < arreglo[medio]){
					fin = medio -1;
				}else{
					primero = medio +1;
				}
			}
		return false;
    }
    public static boolean problema5(int n){
        if(n == 1) return false;
        for(int i = 2; i<n;i++){
            if(n%i==0)return false;
        }
        return true;
	}
    
/**public static int[] problema6(int n){
		//int[]numeros;
		//int contador = 0;
		//for(int i = 2; i < n; i++){
		//if(n%i != 0)
		//contador ++;	//cuenta cuantos numeros primos hay entre 2 y n para asignar un tamaño al arreglo		
		//}
		//numeros = new int[contador];		
		//for(int i=2; i<= n; i++)
		//if(n%i == 0){
		//numeros[0] = 2;
		//numeros[n] = 
		//}
		//}
		return;
	}
*/
    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        //if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }

}