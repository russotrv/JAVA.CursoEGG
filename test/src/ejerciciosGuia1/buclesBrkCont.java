/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia1;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class buclesBrkCont {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        /* 10. Escriba un programa en el cual se ingrese un valor límite positivo,
        y a continuación solicite números al usuario hasta que la suma de los números introducidos
        supere el inicial. 
        
        int limite, num, suma;
        System.out.println("Ingrese un numero limite:");
        limite = leer.nextInt();
        suma = 0;
        do {
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            suma += num;
           } while (suma <= limite);
        */
        
        
        /*11.Realizar un programa que pida dos números enteros positivos por teclado y muestre por
            pantalla el siguiente menú: 
            El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
            pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
            opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
            programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
            seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
            del programa, caso contrario se vuelve a mostrar el menú.
             
        
            int opc;
            String resp = "";
            do{
            System.out.println("Elija una opcion del menu:");
            System.out.println("1: Sumar, 2: Restar, 3: Multiplicar, 4: Dividir, 5: Salir");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                        System.out.println("Sumar");
                        break;
                case 2:
                        System.out.println("Restar");
                        break;
                case 3:
                        System.out.println("Multiplicar");
                        break;
                case 4: 
                        System.out.println("Dividir");
                        break;
                case 5:
                        System.out.println("Desea salir?(S/N)");
                        resp = leer.next().toLowerCase(); 
                        break;
            }
            
            } while(!resp.equals("s"));
            */
        
        /*12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, que lee cadenas enviadas x usuario
        Las cadenas deben llegar con un formato fijo: máximo de 5 caracteres de largo,
        el primer carácter tiene que ser X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas,
        la secuencia especial “&&&&&” marca el final de los envios (llamémosla FDE),
        y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
        Para resolver el ejercicio investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
        
        int cantCorr, cantInc, cantCad;
        String cadena;
        cadena = "";
        cantCorr = 0;
        cantInc = 0;
        cantCad = 0;
        System.out.println("Ingrese cadenas en formato RS232 (&&&&& para finalizar)");
        while(!cadena.equals("&&&&&")){
            System.out.println("Cadena: " +cantCad);
            cadena = leer.next();
            if (cadena.equals("&&&&&")){
                break;
            }
            cantCad += 1;
            if( cadena.length() == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("0") ) {
                cantCorr +=1 ;
            }else{
                cantInc += 1;
                }
        }
        
        System.out.println("Cantidad de cadenas ingresadas:" +cantCad);
        System.out.println("Correctas:" + cantCorr);
        System.out.println("Incorrectas:" +cantInc);
        */
        
        
        /* 13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * * 
        
        int lado;
        System.out.println("Ingrese el tamaño en * del cuadrado:");
        lado = leer.nextInt();
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if(i==0 || i ==lado-1 || j==0 || j==lado-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        */
        
    }
}
