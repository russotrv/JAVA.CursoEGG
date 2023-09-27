/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo;
/*
import Entidades.Libro;
import Servicio.LibroServicio;
import Entidades.Operacion;
import Servicio.OperacionServicio;;
import Entidades.Circunferencia;
import Servicio.CircunferenciaServicio;
import Entidades.Rectangulo;
import Servicio.RectanguloServicio;
import Entidades.Cafetera;
import Entidades.Cuenta;
import Servicio.CafeteraServicio;
import Servicio.CuentaServicio;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import Entidades.Matematica;
import Entidades.Persona2;
import Servicio.ServicioPersona2;
*/

import Entidades.Persona;
import Servicio.PersonaServicio;

import Entidades.Curso;
import Servicio.CursoServicio;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import Entidades.Movil;


import Servicio.MovilServicio;


import java.util.Random;
import java.util.Scanner;


public class GuiaPOO {

    public static void main(String[] args) {
        /* ej1
        LibroServicio ls = new LibroServicio();
        Libro libro = ls.altaLibro();
        ls.mostrarLibro(libro);
        */
        
        /*ej2
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c = cs.crearCircunferencia();
        System.out.println("El perimetro de la circunferencia es: "+ cs.perimetro(c));
        System.out.println("El area de la circunferencia es: "+ cs.area(c));
        */
        
        /*ej3
        OperacionServicio os = new OperacionServicio();
        Operacion op = os.crearOperacion();
        
        int suma, resta, multiplicacion, division;
        suma = os.sumar(op);
        resta = os.restar(op);
        multiplicacion = os.multiplicacion(op);
        division = os.division(op);
        
        System.out.println("Resultados: \n"+suma+ " " +resta+" "+multiplicacion+" "+division);
        */        
        
        /*ej4
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r = rs.crearRectangulo();
        double perimetro = rs.perimetro(r);
        double area = rs.area(r);
        System.out.println("Perimetro= "+perimetro+"\nArea= "+area);
        rs.mostrarRectangulo(r);
        */
        
        /*ej5
        CuentaServicio cs = new CuentaServicio();
        Cuenta c = cs.crearCuenta();
        Scanner leer = new Scanner(System.in);
        int opc;
        double saldo;
        do{
            opc = menuCuenta();
            switch(opc){
                case 1: 
                        System.out.println("Saldo a ingresar:");
                        saldo = leer.nextDouble();
                        cs.ingresar(c, saldo);
                        break;
                case 2:
                        System.out.println("Dinero a retirar:");
                        saldo = leer.nextDouble();
                        cs.retirar(c, saldo);
                        break;
                case 3:
                        cs.extraccionRapida(c);
                        break;
                case 4:
                        cs.consultarSaldo(c);
                        break;
                case 5:
                        cs.consultarDatos(c);
                        break;
                default:
                        System.out.println("Opcion erronea");
                        break;
            }
        }while(opc!=6);
        System.out.println("Gracias, vuelva pronto");
        */
        
        /*ej6
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c = cs.crearCafetera();
        int opc;
        int cantCafe;
        do{
           opc = menuCafetera();
           switch(opc){
               case 1:
                        cs.llenarCafetera(c);
                        break;
               case 2:
                        System.out.println("Cantidad de cafe a agregar:");
                        cantCafe = leer.nextInt();
                        cs.agregarCafe(c, cantCafe);
                        break;
               case 3:
                        System.out.println("Cantidad de cafe a servir en la taza:");
                        cantCafe = leer.nextInt();
                        cs.servirTaza(c, cantCafe);
                        break;
               case 4:
                        cs.vaciarCafetera(c);
                        break;
               case 5:
                        cs.mostrarCafetera(c);
                        break;
               default:
                        System.out.println("Opcion erronea");
                        break;
           }
        }while(opc !=6);
        */
        
        /*ej7
        Persona[] vPersonas = new Persona[4];
        PersonaServicio ps = new PersonaServicio();
        int[] vResImc = new int[4];
        boolean[] vMayores = new boolean[4];
        
        //Inicializo el vector que guarda las personas
        for (int i = 0; i < vPersonas.length; i++) {
            vPersonas[i] = ps.crearPersona();
        }
        
        //Guardo los resultados 
        for (int i = 0; i < vPersonas.length; i++) {
            vResImc[i] = ps.calcularIMC(vPersonas[i]);
            vMayores[i] = ps.esMayordeEdad(vPersonas[i]);
        }
        //Veo los resultados por separado
        for (int i = 0; i < vPersonas.length; i++) {
            System.out.println(vResImc[i]);
            System.out.println(vMayores[i]);
        }
        
        //Datos para el informe
        int cantPuP=0, cantPpI=0, cantPsP=0, cantMay=0, cantMen=0;
        for (int i = 0; i < vPersonas.length; i++) {
            
            switch(vResImc[i]){
                case -1: 
                        cantPuP +=1;
                         break;
                case 0: 
                        cantPpI +=1;
                        break;
                case 1: 
                        cantPsP +=1;
                        break;
            }
            
            if(vMayores[i]==true){
                cantMay += 1;
            }else{
                cantMen += 1;
            }
        }
        
        //Informe:
        double cantP = vPersonas.length;
        System.out.println("Porcentaje de personas segun peso:");
        System.out.println("Debajo de su peso: "+cantPuP/cantP *100+"%");
        System.out.println("En su peso ideal: "+cantPpI/cantP *100+"%");
        System.out.println("Con sobrepeso: "+cantPsP/cantP *100+"%");
        System.out.println("Porcentaje de mayoria de edad:");
        System.out.println("Mayores: "+cantMay/cantP *100+"%");
        System.out.println("Menores: "+cantMen/cantP *100+"%");
        */
        
        /*Ej8
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        Cadena c = new Cadena();
        c = cs.crearCadena();
        System.out.println("Informacion de la cadena ingresada:");
        System.out.println("Cantidad de vocales: "+cs.mostrarVocales(c));
        cs.invertirFrase(c);
        String letra;
        do{
            System.out.println("Ingrese una letra para buscarla en la frase:");
            letra = leer.next();
        }while(letra.length()>1);
        cs.vecesRepetido(c, letra);
        String frase;
        System.out.println("Ingrese una frase nueva:");
        frase = leer.next();
        cs.compararLongitud(c, frase);
        System.out.println("Ingrese una nueva frase:");
        frase = leer.next();
        cs.unirFrases(c, frase);
        do{
            System.out.println("Ingrese una letra/caracter para reemplazar por las 'a' de la frase");
            letra = leer.next();
        }while(letra.length()>1);
        cs.reemplazar(c, letra);
        System.out.println("Ingrese una letra para ver si esta en la frase");
        letra = leer.next();
        System.out.println("La frase contiene "+letra+": "+cs.contiene(c, letra)); 
        */
        
        
        /*Ej9
        Matematica m = new Matematica();
        double n1 = Math.random()*11;
        double n2 = Math.random()*6;
        m.setN1(n1);
        m.setN2(n2);
        System.out.println("Numeros generados al azar: "+n1+" "+n2);
        System.out.println("El mayor de los numero generados es: "+m.devolverMayor(m));
        System.out.println("El mayor elevado al menor: "+Math.round(m.calcularPotencia(m)));
        System.out.println("La raiz cuadrada del menor: "+m.calcularRaiz(m));
        */
        
        /*Ej10
        double[]arreglo = new int[50];
        double[]arreglo2 = new int[20];
        llenarArreglo(arreglo);
        System.out.println(Arrays.toString(arreglo));
        Arrays.sort(arreglo);
        System.out.println(Arrays.toString(arreglo));
        System.arraycopy(arreglo, 0, arreglo2, 0, 10);
        //arreglo2 = Arrays.copyOfRange(arreglo, 0, 20);
        System.out.println(Arrays.toString(arreglo2));
        Arrays.fill(arreglo2, 10, 20, -1);
        System.out.println(Arrays.toString(arreglo2));
        */
        
        
        /*Ej 11
        //Date fecha = new Date(anio, mes, dia);
        //Date fechaActual = new Date();
        int anio,mes,dia;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese año, mes y dia:");
        anio = leer.nextInt()-1900; mes = leer.nextInt(); dia = leer.nextInt();
        Date fecha = new Date(anio,mes,dia);
        System.out.println("La fecha ingresada:\n "+fecha);
        Date fechaActual = new Date();
        //Calendar.
        System.out.println("Fecha actual:"+fechaActual);
        int difFecha = (fechaActual.getYear()-fecha.getYear());
        System.out.println(fechaActual.getYear());
        System.out.println(fecha.getYear());
        //ChronoUnit.YEARS.between(fecha, LocalDate.now())
        System.out.println("Diferencia entre la fecha actual y la ingresada:\n"+difFecha);
        */
        
        
        /*Ej12
        ServicioPersona2 sp= new ServicioPersona2();
        Persona2 p = new Persona2();
        
        p = sp.crearPersona();
        System.out.println("Edad de la persona: "+ sp.calcularEdad(p));
        int edadMenor = 25;
        System.out.println("La persona es menor de "+edadMenor+ " : "+ sp.menorQue(p, edadMenor));
        sp.mostrarPersona(p);
        */
        
        /*Ej 13
        Curso c ;
        CursoServicio cs = new CursoServicio();
        c = cs.crearCurso();
        System.out.println("Ganancia por semana del curso "+c.getNombreCurso()+" : $"+cs.calcularGananciaSemana(c));
        */

        /*Ej 14
        Movil m;
        MovilServicio ms = new MovilServicio();
        m = ms.cargarCelular();
        ms.mostrarInfoCelular(m);
        */
        
        /*--- --EXCEPCIONES-- ---*/
        PersonaServicio ps = new PersonaServicio();
        Persona p = null;
        try{
            System.out.println(ps.esMayordeEdad(p));
        }
        catch(Exception e){
            System.out.println("Error:" + e);
        }
        
}
    
    public static void llenarArreglo(double[]a){
        Random random = new Random();
        Arrays.setAll(a, i -> random.nextDouble()*100);
    }
    
    
    
    public static int menuCafetera(){
        Scanner leer = new Scanner(System.in);
        int opc;
        
        System.out.println("\nMenu Cafetera:");
        System.out.println("1. Llenar cafetera");
        System.out.println("2. Agregar cafe");
        System.out.println("3. Servir taza");
        System.out.println("4. Vaciar cafetera");
        System.out.println("5. Datos cafetera");
        System.out.println("6. Salir");
        opc = leer.nextInt();
        
        return opc;
    }
    
    public static int menuCuenta(){
        Scanner leer = new Scanner(System.in);
        int opc;
        
        System.out.println("\nMenu de cuenta");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Extraccion rapida");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar datos");
        System.out.println("6. Salir");
        opc = leer.nextInt();
        
        return opc;
    }
    
    
}
