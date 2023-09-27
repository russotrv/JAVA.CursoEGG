/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Juan
 */
public class EjercExtras {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        /*1.Dado un tiempo en minutos, calcular su equivalente en días y horas.
        Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.        
        int minutos;
        System.out.println("Ingrese tiempo en minutos:");
        minutos = leer.nextInt();
        tiempoDiaHora(minutos);
        */
        
        /*2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
        A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
        C tome el valor de A, A tome el valor de D y D tome el valor de B.
        Mostrar los valores iniciales y los valores finales de cada variable.
        Utilizar sólo una variable auxiliar.
        
        int A,B,C,D,aux;
        A = 5;
        B = 11;
        C = 15;
        D = 21;
        System.out.println("Valores iniciales: \nA="+A+" ,B="+B+" ,C="+C+" ,D="+D);
        
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        System.out.println("Valores finales: \nA="+A+" ,B="+B+" ,C="+C+" ,D="+D);
        */
        
        
        /*3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        Caso contrario mostrar un mensaje.
        Nota: investigar la función equals() de la clase String. 
        
        String letra;
        System.out.println("Ingrese una letra:");
        letra = leer.next();
        esLetraVocal(letra);
        */
        
        /*4.Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y
            se muestre su equivalente en romano. 
        int num;
        String romano;
        do{
            System.out.println("Ingrese un numero del 1-10");
            num = leer.nextInt();
        }while(num<1 || num>10);
        romano = numRomano10(num);
        System.out.println("El numero ingresado en romano es: " +romano);
        */
        
        /*5. Una obra social tiene tres clases de socios:
                Los socios tipo ‘A’ abonan una cuota mayor,
                    pero tienen un 50% de descuento en todos los tipos de tratamientos.
                Los socios tipo ‘B’ abonan una cuota moderada y
                    tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
                Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
                Solicite una letra (carácter) que representa la clase de un socio,
                    y luego un valor real que represente el costo del tratamiento (previo al descuento)
                    y determine el importe en efectivo a pagar por dicho socio.
        
        String claseSocio;
        double  costoTrat;
        System.out.println("Ingrese su clase de socio (A/B/C):");
        claseSocio = leer.next().toUpperCase();
        System.out.println("Ingrese el monto de su tratamiento:");
        costoTrat = leer.nextFloat();
        importeApagar(claseSocio,costoTrat);
        */
        
        /*6. Leer la altura de N personas y determinar el promedio de estaturas
        que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
        int cantPipol;
        double limite;
        System.out.println("Ingrese cantidad de personas a registrar su estatura:");
        cantPipol = leer.nextInt();
        System.out.println("Ingrese la estatura que se calculara el promedio limite superior:");
        limite = leer.nextDouble();
        estaturaPromDebajo(cantPipol, limite);        
        */
        
        
        /*7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
        El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
        Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
        
        int n;
        System.out.println("Ingrese cantidad de numeros a promediar:");
        n = leer.nextInt();
        promNumConWhile(n);
        promNumConDoWhile(n);
        */
        
        
        /*8.Escriba un programa que lea números enteros.
        Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
        la cantidad de números pares y la cantidad de números impares.
        Al igual que en el ejercicio anterior los números negativos no deben sumarse.
        Nota: recordar el uso de la sentencia break.
        int num =5;
        cargarHastaMult(num);
        */
        
        /*9. Simular la división usando solamente restas.
        Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
        Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
        este resultado es el residuo, y el número de restas realizadas es el cociente
        Por ejemplo: 50 / 13:
            50 – 13 = 37 una resta realizada
            37 – 13 = 24 dos restas realizadas
            24 – 13 = 11 tres restas realizadas
            dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        
        int dividendo, divisor;
        System.out.println("Ingrese dos numeros para dividir:");
        dividendo = leer.nextInt();
        divisor = leer.nextInt();
        restasSuscesivas(dividendo,divisor);
        */
        
        /*10. Realice un programa para que el usuario adivine el resultado de una multiplicación
        entre dos números generados aleatoriamente entre 0 y 10.
        El programa debe indicar al usuario si su respuesta es o no correcta.
        En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
        Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
        System.out.println("Este programa propone adivinar el resultado de la multiplicacion entre dos numeros aleatorios entre 0y10");
        adivinarMultAleat();
        */
        
        /*11. Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
        Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
        Calcular la cantidad de dígitos matemáticamente utilizando el operador de división.
        Nota: recordar que las variables de tipo entero truncan los números o resultados.
        int num;
        System.out.println("Ingrese un numero para calcular sus digitos:");
        num = leer.nextInt();
        cantidadDigitos(num);
        */
        
        /*12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9,
        con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        contadorDigitos();
        */
        
        
        /*13. Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno
        y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.
        Ejemplo: si se ingresa el número 3:
        1
        12
        123
        
        int altoEscalera;
        System.out.println("Ingrese la altura de la escalera:");
        altoEscalera = leer.nextInt();
        escaleraNum(altoEscalera);
        */
        
        
        /*14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
        Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos
        para averiguar la media de edad de los hijos de todas las familias.
        
        mediaEdadFamilia();
        */
        
        /*15. Crea una aplicación que le pida dos números al usuario y pueda elegir entre
        sumar, restar, multiplicar y dividir.
        La aplicación debe tener una función para cada operación matemática y
        deben devolver sus resultados para imprimirlos en el main.
        
        String operacion;
        double resultado;
        double num1, num2;
        System.out.println("Ingrese la operacion que quiere realizar:\nsuma, resta, division, multiplicacion");
        operacion = leer.next().toLowerCase();
        System.out.println("Ingrese los numeros a operar:");
        num1 = leer.nextDouble();
        num2 = leer.nextDouble();
        resultado = calculadoraBasica(num1,num2,operacion);
        System.out.println("La "+operacion+" entre "+num1+" y "+num2+" es:"+resultado);
        */
        
        /*16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas
        ingresadas por teclado e indique si son mayores o menores de edad.
        Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y
        frenar cuando el usuario ingrese la palabra “No”.
        mayoriaEdad();
        */
        
        /*17. Crea una aplicación que nos pida un número por teclado y
        con una función se lo pasamos por parámetro para que nos indique si es o no un número primo,
        debe devolver true si es primo, sino false.
        
        boolean primo;
        int num;
        System.out.println("Ingrese un numero para conocer si es primo:");
        num = leer.nextInt();
        primo = esPrimo(num);
        System.out.println(num+" es primo: "+primo);
        */
        
        /*18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
        con los valores ingresados por el usuario.
        int dim;
        System.out.println("Ingrese dimension del vector:");
        dim = leer.nextInt();
        int[]vector = new int[dim];
        llenarVectorManual(vector, dim);
        sumarElemVector(vector,dim);
        */
        
        /*19. Escriba un programa que averigüe si dos vectores de N enteros son iguales
        (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
        
        int n;
        System.out.println("Ingrese la dimension de los vectores:");
        n = leer.nextInt();
        int[]vector = new int[n];
        int[]vector2 = new int[n];
        llenarVectorNumAleat(vector, n);
        llenarVectorNumAleat(vector2, n);
        mostrarVector(vector);
        mostrarVector(vector2);
        compararVectores(vector,vector2,n);
        */
        
        /*20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
        Después haremos otra función o procedimiento que imprima el vector.
        int dim;
        System.out.println("Ingrese dimension del vector");
        dim = leer.nextInt();
        int[]vector = new int[dim];
        llenarVectorNumAleat(vector,dim);
        mostrarVector(vector);
        */
        
        /*21. Los profesores del curso de programación de Egg necesitan llevar un registro
        de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
        Durante el periodo de cursado cada alumno obtiene 4 notas,
        2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
            Primer trabajo práctico evaluativo 10%
            Segundo trabajo práctico evaluativo 15%
            Primer Integrador 25%
            Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
        Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
        teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
        
        int cantAlumnos = 10;
        double[]vProm = new double[cantAlumnos];
        cargarPromedios(vProm, cantAlumnos);
        */
        
        /*22. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
        y muestre la suma de sus elementos.
        int filas, col;
        System.out.println("Ingrese cant de filas y columnas de la matriz:");
        filas = leer.nextInt();
        col = leer.nextInt();
        int[][]matriz = new int[filas][col];
        llenarMatrizNumAleat(matriz,filas,col);
        System.out.println("Matriz generada con numeros aleatorios:");
        mostrarMatriz(matriz,filas,col);
        sumaElemMatriz(matriz,filas,col);
        */
       
        
        /*24. Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
        Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
        1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
            Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
            Fibonaccin = 1 para todo n<=1
        
        int dim;
        System.out.println("Ingrese la dimension de la Sucesion de Fibonaci (n primeros numeros):");
        dim = leer.nextInt();
        int[]vFibonacci = new int[dim];
        serieFibonacci(vFibonacci);
        System.out.println("Vector Fibonacci generado:");
        mostrarVector(vFibonacci);
        */
    }
    
    /*24.*/
    public static void serieFibonacci(int[]vFib){
        for (int i = 0; i < vFib.length; i++) {
            if(i == 0 || i == 1){
                vFib[i] = 1;
            }
            else{
                vFib[i] = vFib[i-1] + vFib[i-2]; 
            }
        }
    }
    
    
    /*22.*/
    public static void sumaElemMatriz(int[][]m, int filas, int col){
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                suma += m[i][j];
            }
        }
        System.out.println("La suma de los numeros de la matriz es: "+suma);
    }
    public static void mostrarMatriz(int[][]m, int filas, int col){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("["+m[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    
    public static void llenarMatrizNumAleat(int[][]m, int filas, int col){
        int maxAleat = 11;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                m[i][j] = (int)(Math.random()*maxAleat);
            }
        }
    }
    
    /*21.*/
    public static void cantAprob(double[]vProm, int cantAlum){
        int cantAp = 0, cantDes = 0;
        double notaAp = 7.0;
        for (int i = 0; i < cantAlum; i++) {
            if(vProm[i]>= notaAp){
                cantAp +=1; 
            }else{
                cantDes += 1;
            } 
        }
        System.out.println("Aprobaron: "+cantAp+" alumnos\nDesaprobaron: "+cantDes+" alumnos");
    }
    public static void cargarPromedios(double[]vProm, int cantAlum){
        /* Ponderaciones de las notas:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        */
        Scanner leer = new Scanner(System.in);
        double notaTP1,notaTP2,notaInt1, notaInt2, acumNotas = 0;
        for (int i = 0; i < cantAlum; i++) {
            System.out.println("Ingrese las 4 notas (TP1,TP2,Int1,Int2) del alumno["+(i+1)+"]:");
            notaTP1 = leer.nextDouble();
            notaTP2 = leer.nextDouble();
            notaInt1 = leer.nextDouble();
            notaInt2 = leer.nextDouble();
            acumNotas += notaTP1*0.1 + notaTP2 *0.15 + notaInt1*0.25 + notaInt2*0.5;
            vProm[i] = acumNotas/4;
        }
        cantAprob(vProm,cantAlum);
    }
    
    /*19.*/
    public static void compararVectores(int[]v, int[]v2, int n){
        int dim = 0;
        boolean iguales = true;
        do{
            if(v[dim] != v2[dim]){
                iguales = false;
            }
            dim +=1;
        }while(dim < n && iguales);
        System.out.println("Los vectores ingresados son iguales: "+iguales);
    }
    
    /*19 y 20*/
    public static void mostrarVector(int[]v){
        for (int i = 0; i < v.length; i++) {
            System.out.print("v["+(i+1)+"]="+v[i]+" ");
        }
        System.out.println("");
    }
    
    public static void llenarVectorNumAleat(int[]v, int n){
        //limAleat da el rango max de aleatorios
        //11 -> de 0 a 10
        int limAleat = 11;
        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * 11);
        }
    }
    
    
    /*18.*/
    public static void sumarElemVector(int[]v, int n){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += v[i];
        }
        System.out.println("La suma de los elementos del vector es: "+suma);
    }
    
    public static void llenarVectorManual(int[]v, int n){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("v["+i+"]:");
            v[i] = leer.nextInt();
        }
    }
    
    
    /*17.*/
    public static boolean esPrimo(int num){
        boolean primo = true;
        int ant = num-1;
        do{
            if(num % ant == 0){
                primo = false;
            }
            ant -= 1;
        }while((ant-1 > 1) && primo ==true);
        
        return primo;
    }
    
    /*16*/
    public static void mayoriaEdad(){
        Scanner leer = new Scanner(System.in);
        int nPersonas, edad, mayoriaEdad = 21;
        String nombre, respuesta;
        do{    
            System.out.println("Ingrese la cantidad de personas:");
            nPersonas = leer.nextInt();
            for (int i = 0; i < nPersonas; i++) {
                System.out.println("Nombre de la persona["+(i+1)+"]:");
                nombre = leer.next();
                System.out.println("Edad:");
                edad = leer.nextInt();
                if(edad >= mayoriaEdad){
                    System.out.println(nombre+" de "+edad+" es mayor de edad");
                }else{
                    System.out.println(nombre+" de "+edad+" NO es mayor de edad");
                }
            }
            System.out.println("Quiere seguir ingresando personas(si/no)");
            respuesta = leer.next().toLowerCase();
        }while(!respuesta.equals("no"));
    }
    
    
    /*15*/
    public static double suma(double num1, double num2){
        return num1 + num2;
    }
    
    public static double resta(double num1, double num2){
        return num1 - num2;
    }
    
    public static double multiplicacion(double num1, double num2){
        return num1*num2;
    }
    
    public static double division(double num1, double num2){
        return num1/num2;
    }
    
    public static double calculadoraBasica(double num1, double num2, String op){
       double resultado=0;
       switch(op){
           case "suma":
                        resultado = suma(num1,num2);
                        break;
           case "resta":
                        resultado = resta(num1,num2);
                        break;
           case "multiplicacion":
                        resultado = multiplicacion(num1,num2);
                        break;
           case "division":
                        resultado = division(num1,num2);
                        break;
           default: System.out.println("Operacion invalida");
                    break;
       }
       return resultado;
    }
    
    /*14*/
    public static void mediaEdadFamilia(){
        Scanner leer = new Scanner(System.in);
        int nFamilias, mHijxs, edad, sumaEdad=0, cantHijxs=0;
        //suma edad para luego promediar con cantHijxs totales de todas las familias
        System.out.println("Ingrese la cantidad de familias:");
        String cadena;
        nFamilias = leer.nextInt();
        
        for (int i = 0; i < nFamilias; i++) {
            System.out.println("Cantidad de hijxs de familia["+(i+1)+"]:");
            mHijxs = leer.nextInt();
            cantHijxs += mHijxs;
        
            for (int j = 0; j < mHijxs; j++) {
                System.out.println("Edad de hijx["+(j+1)+"]:");
                edad = leer.nextInt();
                sumaEdad += edad;
            }
        }
        System.out.println("La edad promedio de lxs hijxs de todas las familias es: "+ sumaEdad/cantHijxs);
    }
        
    /*13.*/
    public static void escaleraNum(int num){
        String cadena="";
        for (int i = 1; i <= num; i++) {
            cadena += String.valueOf(i);
            System.out.println(cadena);
        }
    }
    
    /*12.*/
    public static void contadorDigitos(){
        String centena, decena, unidad;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    centena = String.valueOf(i);
                    decena = String.valueOf(j);
                    unidad = String.valueOf(k);
                    if(k==3 || j==3 || i==3){
                        if(k==3){unidad = "E";}
                        if(j==3){decena = "E";}
                        if(i==3){centena = "E";}
                    }
                    System.out.println(centena+"-"+decena+"-"+unidad);
                }
            }
        }
    }
    
    /*11.*/
    public static void cantidadDigitos(int num){
        int dig=0;
        while(num>0){
            num = num/10;
            dig +=1;
        }
        System.out.println("La cantidad de digitos es: " +dig);
    }
    
    /*10.*/
    public static void adivinarMultAleat(){
        Scanner leer = new Scanner(System.in);
        int num1,num2, mult, adivinar, intento;
        num1 = (int) (Math.random()*11);
        num2 = (int) (Math.random()*11);
        mult = num1 * num2;
        intento = 0;
        do{
            intento += 1;
            System.out.println("Adivine[intento "+intento+"]:");
            adivinar = leer.nextInt();
            if(adivinar!= mult){
                System.out.println("Numero erroneo, intente de nuevo");
            }
        }while(adivinar != mult);
        System.out.println("ADIVINASTE! La multiplicacion era igual a: "+mult+"\nnum1: "+num1+"\nnum2: "+num2);
    }
    
    /*9.*/
    public static void restasSuscesivas(int dividendo, int divisor){
        int cant=0;
        while(dividendo>divisor){
            dividendo -= divisor;
            cant +=1;
        }
        System.out.println("La division tiene como resultado: "+cant+"\ny resto: "+dividendo);
    }
    
    /*8.*/
    public static void cargarHastaMult(int num){
        Scanner leer = new Scanner(System.in);
        int cantLeido = 0, numLeido;
        int cantPar = 0, cantImp = 0;
        System.out.println("Se ingresaran numeros hasta que haya un multiplo de "+num);
        
        do{
            cantLeido +=1;
            do{
                System.out.println("Numero "+cantLeido);
                numLeido = leer.nextInt();
            }while(numLeido < 1);
            
            if(numLeido % num == 0){
                break;
            }
            if(numLeido % 2 == 0){
                    cantPar += 1;
            }else{
                    cantImp += 1;
                 }
        }while(numLeido % num != 0);
        
        System.out.println("Cantidad de numeros leidos: " +cantLeido+"\n numeros pares: "+cantPar+"\n numeros impares: "+cantImp);
    }
    
    /*7.*/
    public static void promNumConDoWhile(int n){
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int num;
        int min = 0, max = 0;
        int cant = 0;
        System.out.println("Ingrese "+n+" numeros enteros positivos:");
        do{
            cant+=1;
            do{
                System.out.println("Numero "+cant+":");
                num = leer.nextInt();
            }while(num<0);
            
            suma += num;
            if(cant==1){
                min = num;
                max = num;
            }else{
                if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
            }
        }while(cant<n);
        System.out.println("El promedio de numeros es: "+suma/n+"\n el maximo: "+max+"\n el minimo: "+min);
    }
    
    public static void promNumConWhile(int n){
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int num;
        int min=0, max=0;
        int cant =0;
        System.out.println("Ingrese "+n+" numeros enteros:");
        while(cant < n){
            cant += 1;
            do{
                System.out.println("Numero " +cant+":");
                num = leer.nextInt();
            } while(num<0);
            
            suma += num;
            if(cant == 1){
                min = num;
                max = num;
            } else{
                if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
            }
        }
        System.out.println("El promedio de numeros es: "+suma/n+"\n el maximo: "+max+"\n el minimo: "+min);
    }
    
    
    /*6.*/
    public static void estaturaPromDebajo (int n,double lim){
        Scanner leer = new Scanner(System.in);
        double suma = 0;
        int cant = 0;
        double estatura;
        for (int i = 0; i < n; i++) {
            System.out.println("Estatura ["+(i+1)+"]:");
            estatura = leer.nextDouble();
            if(estatura < lim){
                suma += estatura;
                cant += 1; 
            }
        }
        System.out.println("Hay "+cant+" personas por debajo de "+lim+ "m de altura \n y su promedio de altura es: "+ suma/cant);
    }
    
    /*5.*/
    public static void importeApagar(String clase, double costo){
        double aPagar=0;
        switch(clase){
            case "A":
                     aPagar = costo - (0.5 * costo);
                     break;
            case "B":
                     aPagar = costo - (0.35 * costo);
                     break;
            case "C":
                     aPagar = costo;
                     break;
        }
        System.out.println("Dada su clase de socio " +clase+ " \nel monto a pagar es de: "+aPagar);
    }
    
    
    /*4.*/
    public static String numRomano10(int num){
        String romano="";
        switch(num){
            case 1:
                   romano = "I";
                   break;
            case 2:
                   romano = "II";
                   break;
            case 3:
                   romano = "III";
                   break;
            case 4:
                   romano = "IV";
                   break;
            case 5:
                   romano = "V";
                   break;
            case 6:
                   romano = "VI";
                   break;
            case 7:
                   romano = "VII";
                   break;
            case 8:
                   romano = "VIII";
                   break;
            case 9:
                   romano = "XI";
                   break;
            case 10:
                    romano = "X";
                   break;
        }
        return romano;
    }
    
    /*3*/
    public static void esLetraVocal(String letra){
        String[] vocales = {"a","e","i","o","u"};
        boolean esVocal = false;
        for (String vocal : vocales) {
            if (letra.equals(vocal)) {
                esVocal = true;
            }
        }
        System.out.println("La letra ingresada " +letra+ " es vocal: " +esVocal);
    }
    
    /*1*/
    public static void tiempoDiaHora(int min){
        int hs,dia;
        dia = 0;
        hs = Math.round(min / 60);
        if(hs >= 24 && hs < 48){
            dia = 1;
            hs -= 24; 
        } else {
            if (hs >= 48 && hs < 72){
            dia = 2;
            hs -= 48;
            }
        }
        System.out.println(min+ " minutos equivalen a: " +dia+ " dia y " +hs+ " hs");
    } 
    
}
