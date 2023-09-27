/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia1;
import java.util.Random;
import java.util.Scanner;


/*23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para niños”de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().*/

public class ejExtra23 {
  public static void main(String[] args) {
    String[][] matriz = new String[20][20];
    String palabra;
    boolean verificar;
    
    llenarMatriz(matriz);
    
    for (int i = 0; i < 5; i++) {
      palabra = palabras();
      do {
        verificar = armarSopa(matriz, palabra);
      } while (verificar == false);
    }

    reemplazarVacios(matriz);
    mostrarMatriz(matriz);
  }
  
  public static void mostrarMatriz(String[][]matriz){
      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
              System.out.print(matriz[i][j]+" ");
          }
          System.out.println("");
      }
  }
  
  public static void reemplazarVacios(String[][] matriz) {
    Random random = new Random();

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j].equals(" ")) {
                matriz[i][j] = matriz[i][j].replace(" ", String.valueOf(random.nextInt(10)));
                }
            }
        }
  }
  public static String palabras() {
    Scanner leer = new Scanner(System.in);
    String palabra = "";
    do {
      System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
      palabra = leer.next();
    } while (palabra.length() < 3 && palabra.length() > 5);
    return palabra;
  }

  public static void llenarMatriz (String[][] matriz) {

    for(int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = " ";
      }
    }
  }

  public static boolean armarSopa(String[][] matriz, String palabra) {
      Random random = new Random();
    
      int numFila = random.nextInt(20 - palabra.length() + 1);
      int numCol = random.nextInt(20 - palabra.length() + 1);
      int posCol = numCol;
      boolean verificar = true;
      
      for (int i = 0; i < palabra.length(); i++) {
        if (!matriz[numFila][posCol].equals(" ")) {
          verificar = false;
          break;
        }
        posCol++;
      }
      if (verificar == true) {
        int letra = 0;
        for (int i = 0 ; i < palabra.length(); i++) {
          matriz[numFila][numCol] = palabra.substring(letra, letra + 1);
          numCol++;
          letra++;
        }
      }
      return verificar;
  }

}