/*
 */
package ejerciciosGuia1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author russoTrv;
 */
public class vectoresYmatrices {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        /*14. Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado
        a otra moned a(dólares, yenes o libras). La función tendrá como parámetros,
        la cantidad de euros y la moneda a converir que será una cadena,
        este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 € */
        /*
        double euros;
        String cambio;
        System.out.println("Ingrese los euros a cambiar:");
        euros = leer.nextDouble();
        System.out.println("Ingrese a que moneda desea cambiar (libra, dolar, yenes)");
        cambio = leer.next();
        conversionEuro(euros, cambio);
        */
        
        /*15.  Realizar un algoritmo que rellene un vector con los 100 primeros números enteros
        y los muestre por pantalla en orden descendente.
        int[]vector = new int[100];
        llenarVector15(vector);
        */
        
        /*16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y
        le pida al usuario un numero a buscar en el vector.
        El programa mostrará donde se encuentra el numero y si se encuentra repetido
        int dim, numBuscar;
        System.out.println("Ingrese el tamaño del vector");
        dim = leer.nextInt();
        int[]vector = new int[dim];
        llenarVector16(vector,dim);
        System.out.println("Vector cargado aleatoriamente:");
        mostrarVector(vector,dim);
        System.out.println("\nIngrese un numero a buscar en el vector:");
        numBuscar = leer.nextInt();
        buscarValor(vector,dim,numBuscar);
        */
        
        /*17. Recorrer un vector de N enteros contabilizando
        cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        int n;
        System.out.println("Ingrese dimension del vector");
        n = leer.nextInt();
        int[]vector = new int[n];
        llenarVector17(vector,n);
        System.out.println("Vector generado aleatoriamente:");
        mostrarVector(vector,n);
        cuentaNumxDig(vector,n);
        */
        
        /*18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
        y muestre la traspuesta de la matriz.
        La matriz traspuesta de una matriz A se denota por B y
        se obtiene cambiando sus filas por columnas (o viceversa).
        
        int[][]matriz = new int[4][4];
        int[][]matrizTransp = new int[4][4];
        llenarMatrizCuadAleat(matriz,4);
        System.out.println("matriz generada");
        mostrarMatriz(matriz,4);
        matrizTransp = matrizTranspCuad(matriz,4);
        System.out.println("Matriz transpuesta:");
        mostrarMatriz(matrizTransp,4);
        */
        
        /*19. Realice un programa que compruebe si una matriz dada es anti simétrica.
        Se dice que una matriz A es anti simétrica cuando es igual a su propia traspuesta, pero cambiada de signo.
        Es decir, A es anti simétrica si A = -AT.
        int dim;
        boolean resultado;
        //System.out.println("Dimension de la matriz:");
        dim = 3;
        int[][]matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int[][]matrizT = {{0,2,-4},{-2,0,-2},{4,2,0}};
        
        resultado = esAntiSimetrica(matriz,matrizT,3);
        System.out.println("Las matrices son antisimetricas: " +resultado);
        */
        
        
        /*20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
        donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
        Crear un programa que permita introducir un cuadrado por teclado y
        determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos,
        es decir, están entre el 1 y el 9.
        int dim = 3;
        int[][]matriz = new int[dim][dim];
        boolean magica;
        llenarMatrizManual(matriz,dim);
        System.out.println("Matriz generada:");
        mostrarMatriz(matriz,dim);
        magica = esMatrizMagica(matriz,dim);
        System.out.println("La matriz ingresada es magica:" +magica);
        */
        
        /*21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3,
        se solicita escribir un programa en el cual se compruebe si la matriz P está contenida dentro de la matriz M.
        Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar en la matriz M,
        desplazándose por filas o columnas, existe al menos una que coincida con la matriz P.
        En ese caso, el programa debe indicar la fila y la columna de la matriz M
        en la cual empieza el primer elemento de la submatriz P.*/
        
    }
    
    
    /*20*/
    public static int sumaDiagIzq(int[][]m,int n){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    suma += m[i][j];
                }
            }
        }
        return suma;
    }
    
    public static int sumaDiagDer(int[][]m,int n){
        int suma = 0;
        int sec = n-1;
        for (int i = 0; i < n; i++) {
           suma +=  m[i][sec];
           sec -= 1;
        }
        return suma;
    }
    
    public static int sumaFilas(int[][]m, int n, int sumaM){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma = 0;
            for (int j = 0; j < n; j++) {
                suma += m[i][j];
            }
            if(suma != sumaM){
                break;
            }
        }
        return suma;
    }
    
    public static int sumaCol (int[][]m, int n, int sumaM){
        int suma = 0;
        for (int j = 0; j < n; j++) {
            suma = 0;
            for (int i = 0; i < n; i++) {
                suma += m[i][j];
            }
            if(suma != sumaM){
                break;
            }
        }
        return suma;
    }
    
    public static boolean esMatrizMagica(int[][]m, int n){
        boolean magica = true;
        //Comprobar que tanto filas, como columnas y ambas diagonales sumen lo mismo
        //De esa forma la matriz es MAGICA.
        int sumaMagica = sumaDiagIzq(m,n);
        
        if(sumaDiagDer(m,n) == sumaMagica){
            
            if(sumaFilas(m,n,sumaMagica) == sumaMagica){
                
                if(sumaCol(m,n,sumaMagica) != sumaMagica){
                    magica = false;
                }
                
            }else{
                 magica = false;
                 }
            
        }else{
            magica = false;
        }
        
        return magica;
    }
    
    public static void llenarMatrizManual(int[][]m, int dim){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores (del 1-9) de la matriz " + dim + " x " + dim);
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
            do{
                System.out.println("m["+i+","+j+"]");
                m[i][j] = leer.nextInt();
              } while(m[i][j]<1 && m[i][j]>9);
            }
        }
    }
    /*19*/
    public static boolean esAntiSimetrica(int[][]m, int[][]mT, int n){
        boolean resultado = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(m[i][j] != -mT[i][j]){
                    resultado = false;
                    break;
               }
            }
        }
        return resultado;
    }
    /*18. */
    public static void mostrarMatriz(int[][]m, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static int[][] matrizTranspCuad(int[][]m,int n){
        int [][] matrizTrp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizTrp[j][i] = m[i][j];
            }
        }
        return matrizTrp;
    } 
    
    public static void llenarMatrizCuadAleat(int[][]m, int n){
        Random aleatorio = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = aleatorio.nextInt(100-1+1)+1;
            }
 
        }
    }
    /*17*/
    public static void cuentaNumxDig(int[]v, int n){
        int[]vDig = {0,0,0,0,0};
        int dig;
        for (int i = 0; i < n; i++) {
            dig = String.valueOf(v[i]).length() ;
            switch(dig){
                case 1:
                       vDig[0] += 1;
                       break;
                case 2:
                       vDig[1] += 1;
                       break;
                case 3:
                       vDig[2] += 1;
                       break;
                case 4:
                       vDig[3] += 1;
                       break;
                case 5:
                       vDig[4] += 1;
                       break;
            }
        }
        System.out.println("El arreglo contiene numeros:\n"
                +vDig[0]+" de 1 digito,\n"
                +vDig[1]+" de 2 digitos,\n"
                +vDig[2]+" de 3 digitos,\n"
                +vDig[3]+" de 4 digitos,\n"
                +vDig[4]+" de 5 digitos");
    }
    
    public static void llenarVector17(int[]v, int n){
        Random aleatorio = new Random();
        for (int i = 0; i < n; i++) {
            v[i] = aleatorio.nextInt(11000-1+1)+1;
        }
    }
    
    
    /*16*/
    public static void llenarVector16(int[]vector, int n){
        Random aleatorio = new Random();
        int num;
        for (int i = 0; i < n; i++) {
            //aleatorio entre 21 y 21
            num = aleatorio.nextInt(210-21+1)+21;
            vector[i] = num; 
        }
    }
    
    public static void mostrarVector(int[]vector, int n){
        for (int i = 0; i < n; i++) {
            System.out.print("v["+i+"]="+vector[i]+" ");
        }
        System.out.println("");
    }
    
    public static void buscarValor(int[]vector, int n, int valor){
        int pos, cant;
        pos =-1;
        cant = 0;
        for (int i = 0; i < n; i++) {
            if(vector[i]==valor){
                cant+=1;
                if(pos == -1){
                    pos = i;
                }
            }
        }
        System.out.println("El numero "+valor+ " aparece "
                +cant+ " veces en el arreglo y por primera vez en la posicion " + pos);
    }
    
    /*15*/
    public static void llenarVector15(int[]vector){
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
        }
        /*Ahora los muestra*/
        for (int i = 99; i >= 0 ; i--) {
            System.out.println("v[" +i+ "]=" + vector[i]);
        }
    }
    
    /*14*/
    public static void conversionEuro(double euros, String cambio){
        double[]tipoCambio = {0.86, 1.28611, 129.852};
        double total;
        
        switch(cambio.toLowerCase()){
            case "libra":
                           total = tipoCambio[0] * euros;
                           System.out.println(euros + " euros equivalen a " +total+ " libras");
                           break;
            case "dolar":
                           total = tipoCambio[1] * euros;
                           System.out.println(euros + " euros equivalen a " +total+ " dolares");
                           break;
            case "yenes":
                           total = tipoCambio[2] * euros;
                           System.out.println(euros + " euros equivalen a " +total+ " yenes");
                           break;
        }
        
    }
    
}
