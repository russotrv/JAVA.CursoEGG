/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia1;
import java.util.Scanner;
/**
 *
 * @author russoTrv
 */

/*21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3,
se solicita escribir un programa en el cual se compruebe si la matriz P está contenida dentro de la matriz M.
Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar en la matriz M,
desplazándose por filas o columnas, existe al menos una que coincida con la matriz P.
En ese caso, el programa debe indicar la fila y la columna de la matriz M en la cual
empieza el primer elemento de la submatriz P.*/

public class ejerc21 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int dimM = 20, dimP = 3;
        int[][]matrizM = new int[dimM][dimM];
        int[][]matrizP = new int[dimP][dimP];
        llenarMatrizNumAleat(matrizM);
        mostrarMatriz(matrizM);
        llenarMatrizManual(matrizP);
        System.out.println("Buscando a la matrizP en la matrizM...");
        buscarMatriz(matrizM,matrizP);
    }
    
    public static boolean compararMatrices(int[][]matrizM, int[][]matrizP, int fInicioM, int cInicioM){
        //recibe un tramo 3x3 de la matrizM y lo compara con la matriz P
        boolean iguales = true;
        int filaP = 0, colP;
        for (int i = fInicioM; i < (fInicioM+3); i++) {
            colP = 0;
            for (int j = cInicioM; j < (cInicioM+3); j++) {
                if(matrizM[i][j]!=matrizP[filaP][colP]){
                    iguales = false;
                    break;
                }
            colP += 1;
            }
            filaP += 1;
        }
        return iguales;
    }
    
    
    public static void buscarMatriz(int[][]matrizM, int[][]matrizP){
        int filaInicio, colInicio;
        boolean encontrado = false;
        for (int i = 0; i < 18; i++) {
            filaInicio = i;
            for (int j = 0; j < 18; j++) {
                colInicio = j;
                encontrado = compararMatrices(matrizM,matrizP,filaInicio,colInicio);
                if(encontrado == true){
                    System.out.println("Hay coincidencia a partir de: ["+filaInicio+","+colInicio+"]");
                    break;
                 }
            }
        }
        if(encontrado == false){
            System.out.println("La matriz P no se encuentra en M");
        }
    }
    
    public static void mostrarMatriz(int[][]matriz){
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void llenarMatrizManual(int[][]matriz){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("m["+i+","+j+"]:");
                matriz[i][j] = leer.nextInt();
            }
        }
    }
    
    public static void llenarMatrizNumAleat(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
    }
}
