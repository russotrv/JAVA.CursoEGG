/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colecciones;
/*
import Servicio.AlumnoServicio;
import Servicio.PeliculaServicio;
import Servicio.RazasPerroServicio;
import Servicio.Tienda;
import java.util.ArrayList;
import java.util.Iterator;
*/
import Servicio.ArregloNumerosServicio;
import Servicio.CantanteFamosoServicio;
import Servicio.HotelServicio;
import Servicio.Libreria;
import Servicio.PaisesServicio;
import Servicio.ProductosHashServicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir.
Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Colecciones {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        /*
        //1
        RazasPerroServicio rps = new RazasPerroServicio();
        int res;
        do{
            res = rps.menu();
            switch(res){
                case 1: rps.agregarRaza(); break;
                case 2: break;
            }
        }while(res != 2);
        
        System.out.println("Lista de razas de perros:");
        rps.mostrarLista();
        
        //2
        System.out.println("Desea eliminar alguna raza de la lista(s/n):");
        String res2 = leer.next();
        if(res2.equals("s")){
            System.out.println("Que raza desea eliminar? ");
            String razaEliminar = leer.next();
            rps.iterar(razaEliminar);
        }
        */
        
        /*3
        AlumnoServicio as = new AlumnoServicio();
        as.cargarAlumnos();
        System.out.println("Ingrese nombre del alumno a calcular su nota final:");
        String nombreA = leer.next();
        int pos = as.alumnoEnLista(nombreA);
        if(pos>=0){
            System.out.println(nombreA+ " tiene una nota final de: "+ as.notaFinal(pos)); 
        }else
            System.out.println("El alumno no esta en la lista");
        */
        
        /*Desafio dia 4 Colecciones
        ArrayList<Producto> listaProductos = new ArrayList();
        Tienda tienda = new Tienda();
        boolean continuar = true;
        int opc;
        int cantProd;
        
        while(continuar){
            opc = menuTienda();
            switch(opc){
                case 1: 
                        System.out.println("Cuantos productos ingresará?");
                        cantProd = leer.nextInt();
                        listaProductos = tienda.crearLista(cantProd);
                        break;
                case 2: 
                        tienda.mostrarLista();
                        break;
                case 3: 
                        System.out.println("Qué producto modificará? (nombre en lista)");
                        String prodMod = leer.next();
                        tienda.modificacion(prodMod, listaProductos);
                        break;
                case 4: 
                        System.out.println("Qué producto vendió (nombre en lista)");
                        String prodVend = leer.next();
                        tienda.venta(prodVend,listaProductos);
                        break;
                case 5: 
                        System.out.println("Qué producto va a reponer? (nombre en lista)");
                        String prodRep = leer.next();
                        tienda.reposicion(prodRep,listaProductos);
                        break;
                case 6: 
                        System.out.println("Qué producto eliminará? (nombre en lista)");
                        String prodElim = leer.next();
                        tienda.eliminacion(prodElim, listaProductos);
                        break;
                case 7: 
                        continuar = false;
                        break;
                default: System.out.println("Opción inválida"); 
                         break;
            }
        }
        System.out.println("FIN");
        */
        
        
        /*4.
        PeliculaServicio ps = new PeliculaServicio();
        ps.cargarListaPeliculas();
        */
        
        /*5.
        PaisesServicio ps = new PaisesServicio();
        ps.cargarLista();
        
        System.out.println("Que pais quiere borrar de la lista");
        String pais = leer.next();
        ps.eliminar(pais);
        
        System.out.println("Nueva lista:");
        ps.mostrarLista();
        */
        
        /*6.
        ProductosHashServicio ps = new ProductosHashServicio();
        int res;
        do{
            res = menuProductos();
            switch(res){
                case 1: 
                        ps.cargarProducto();
                        break;
                case 2: 
                        System.out.println("Producto a modificar precio");
                        String p = leer.next();
                        ps.modificar(p);
                        break;
                case 3: 
                        System.out.println("Producto a eliminar");
                        String p2 = leer.next();
                        ps.eliminar(p2);
                        break;
                case 4: 
                        ps.mostrar();
                        break;
                default: System.out.println("Opcion invalida");
                        break;
            }
        }while(res != 5);
        */
        
        /*1.Extra
        ArregloNumeros an;
        ArregloNumerosServicio ans = new ArregloNumerosServicio();
        an = ans.cargarLista();
        System.out.println("Se cargaron " + an.getListaNumeros().size() + " numeros");
        int suma = 0;
        for (Object num : an.getListaNumeros()) {
            suma += (int) num;
        }
        System.out.println("La suma de los numeros del arreglo es: " + suma);
        System.out.println("La media: " + suma/an.getListaNumeros().size());
        */
        
        /*2.Extra
        CantanteFamosoServicio cfs = new CantanteFamosoServicio();
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();
        listaCantantes = cfs.cargarLista(5);
        int opc;
        String nombre;
        
        do{
            opc = menuCantantesFamosos();
            switch(opc){
                case 1: 
                        listaCantantes.add(cfs.crearCantante());
                        break;
                case 2: 
                        cfs.mostrarLista();
                        System.out.println("---");
                        break;
                case 3: 
                        System.out.println("Nombre del cantante a editar:");
                        nombre = leer.next();
                        cfs.editar(nombre);
                        break;
                case 4:
                        System.out.println("Nombre del cantante a quitar de la lista:");
                        nombre = leer.next();
                        cfs.eliminar(nombre);
                        break;
                case 5: break;
                default: System.out.println("Opción inválida");
                        break;
            }
        }while(opc != 5);
        System.out.println("Menu Finalizado");
        */
        
        /*3.Extra
        Libreria libreria = new Libreria();
        HashSet<Libro> listaLibros = new HashSet();
        int res;
        boolean continuar = true;
        boolean agregarLibro = true;
        String libro;
        String opc;
        
        do{
            res = menuLibreria();
            switch(res){
                case 1: do{
                            libreria.cargarLibro();
                            System.out.println("Ingresar otro libro?(s/n)");
                            opc = leer.next();
                            if(opc.equals("n"))
                               agregarLibro = false;
                        }while(agregarLibro);
                        System.out.println("Lista de Libros cargada");
                        listaLibros = libreria.getListaLibros();
                        break;
                        
                case 2: libreria.listaToString(listaLibros);
                        break;
                        
                case 3: System.out.println("Nombre del libro a prestar:");
                        libro = leer.next();
                        System.out.println("Prestamo realizado: "+ libreria.prestamo(libro));
                        break;
 
                case 4: System.out.println("Nombre del libro a devolver:");
                        libro = leer.next();
                        System.out.println("Devolución realizada: "+ libreria.devolucion(libro));
                        break;
                
                case 5: System.out.println("Nombre del libro a buscar:");
                        libro = leer.next();
                        System.out.println("Libro encontrado: " + libreria.buscarPorNombre(libro) ); 
                        break;
                        
                case 6: continuar = false;
                        break;
            }
        }while(continuar);
        
        System.out.println("Saliste de la Libreria");
         */
        
        /*4.Extra: Almacena en un HashMap los códigos postales de 10 ciudades a elección
        HashMap<Integer,String>listaCodigos = new HashMap();
        int cantCodigos = 5;
        cargarListaCodigos(listaCodigos, cantCodigos);
        System.out.println("Lista de codigos:");
        mostrarCodigos(listaCodigos);
        System.out.println("-----");
        System.out.println("Introduzca un codigo para buscar su localidad asociada:");
        Integer codBuscar = leer.nextInt();
        buscarCodigo(listaCodigos, codBuscar);
        cargarListaCodigos(listaCodigos,1);
        System.out.println("Nueva lista:");
        mostrarCodigos(listaCodigos);
        System.out.println("-----");
        eliminarDeLista(listaCodigos);
        System.out.println("Nueva lista:");
        mostrarCodigos(listaCodigos);
        */
        
        /*Desafio*/
        HotelServicio hs = new HotelServicio();
        ArrayList<Habitacion> listaHabitacionesHotel;
        int cantHab = 3;
        int opc;
        boolean continuar = true;
        System.out.println("Cantidad de habitaciones en el hotel " +cantHab);
        
        do{
            opc = menuHotel();
            switch(opc){
                case 1: 
                        hs.cargarHabitaciones(cantHab);
                        break;
                case 2: 
                        hs.reservarHabitacion();
                        break;
                case 3: 
                        hs.modificarReserva();
                        break;
                case 4: 
                        System.out.println(hs.listaHabitaciones());
                        break;
                case 5: 
                        hs.eliminarReserva();
                        break;
                case 6: 
                        hs.buscarHabitacion();
                        break;
                case 7: 
                        continuar = false;
                        break;
            }
        }while(continuar);
            
        
        
        
        
    }
    
    public static int menuHotel(){
        int opc;
        System.out.println("--- MENU HOTEL ---");
        System.out.println("1. Cargar Lista de Habitaciones");
        System.out.println("2. Reservar una habitacion");
        System.out.println("3. Modificar Reserva");
        System.out.println("4. Mostrar Lista de Habitaciones");
        System.out.println("5. Eliminar Reserva");
        System.out.println("6. Buscar Habitacion en la lista");
        System.out.println("7. Salir");
        System.out.println("--- - ---");
        opc = leer.nextInt();
        return opc;
    }
    
    
    
    
    public static void cargarListaCodigos(HashMap<Integer,String>listaC, int cantCodigos){
        Integer cp;
        String city;
        System.out.println("Se cargaran " +cantCodigos+" codigos");
        for (int i = 0; i < cantCodigos; i++) {
            System.out.println("Ingrese codigo postal (solo numeros):");
            cp = leer.nextInt();
            System.out.println("Nombre de la ciudad:");
            city = leer.next();
            listaC.put(cp, city);
        }
        System.out.println("Lista de Codigos Postales cargada con exito!");
    }
        
    public static void mostrarCodigos(HashMap<Integer,String>listaC){
        for (Map.Entry<Integer,String> item : listaC.entrySet()) {
            System.out.println("CP: " + item.getKey()
            + "\nCiudad: " + item.getValue());
        }
    }  
    
    public static void buscarCodigo(HashMap<Integer,String>listaC, Integer cp){
        if(listaC.get(cp)!=null){
            System.out.println("Ciudad: " + listaC.get(cp));
        }else
            System.out.println("El codigo" +cp+ "no se encuentra en la lista");
    }
    
    public static void eliminarDeLista(HashMap<Integer,String>listaC){
        int cantEliminar = 3;
        System.out.println("Se eliminaran "+cantEliminar+" codigos de la lista");        
        
        for (int i = 0; i < cantEliminar; i++) {
            eliminar(listaC);
        }
    }
    
    public static void eliminar(HashMap<Integer,String>listaC){
        Iterator<Map.Entry<Integer,String>> it = listaC.entrySet().iterator();
        String city;
        boolean encontrado = false;
        
        System.out.println("Nombre de la ciudad a eliminar");
        city = leer.next();
        
        while(it.hasNext() && encontrado == false){
            if( city.equals(it.next().getValue())){
                it.remove();
                encontrado = true;
                System.out.println(city + " se elimino de la lista");
                }
        }
        if(encontrado == false){
            System.out.println(city + " no se encuentra en la lista");
        }
    }
    
    public static int menuLibreria(){
        int res;
        System.out.println("");
        System.out.println("-- MENU LIBRERIA --");
        System.out.println("1. Cargar Libros en la Lista");
        System.out.println("2. Mostrar Lista");
        System.out.println("3. Realizar un Préstamo");
        System.out.println("4. Realizar una Devolución");
        System.out.println("5. Buscar Libro en la Lista");
        System.out.println("6. Salir");
        res = leer.nextInt();
        return res;
    }
    
    public static HashSet cargarListaLibros(){
        Libreria libreria = new Libreria();
        boolean continuar = true;
        String res;
        
        do{
            libreria.cargarLibro();
            System.out.println("Ingresar otro libro?(s/n)");
            res = leer.next();
            if(res.equals("n"))
               continuar = false;
        }while(continuar);
        System.out.println("Lista de Libros cargada");
        
        return libreria.getListaLibros();
    }
    
    public static int menuCantantesFamosos(){
        int opc;
        System.out.println("--- Menu ---");
        System.out.println("Elija una opción:");
        System.out.println("1. Agregar un cantante famoso");
        System.out.println("2. Mostrar cantantes en la Lista");
        System.out.println("3. Editar un cantante de la Lista");
        System.out.println("4. Eliminar un cantante de la Lista");
        System.out.println("5. Salir");
        opc = leer.nextInt();
        return opc;
    }
    
    public static int menuProductos(){
        int opc;
        System.out.println("Elija una opcion");
        System.out.println("1. Cargar Lista Productos");
        System.out.println("2. Modificar Precio");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Mostrar Lista");
        System.out.println("5. Salir");
        opc = leer.nextInt();
        return opc;
    }
    
    public static int menuTienda(){
        int opc;
        System.out.println("---- MENU ----");
        System.out.println("Qué operación quiere realizar:");
        System.out.println("1. Cargar Lista de Productos");
        System.out.println("2. Mostrar Lista de Productos");
        System.out.println("3. Modificar producto de la Lista de Productos");
        System.out.println("4. Reportar una Venta");
        System.out.println("5. Reponer un producto en Inventario");
        System.out.println("6. Eliminar un producto de la Lista de Productos");
        System.out.println("7. Salir");
       
        opc = leer.nextInt();
        return opc;
    }
}
