/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioexcepciones;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class ServicioJARVIS {
    private Armadura armadura;

    public ServicioJARVIS(Armadura armadura) {
        this.armadura = armadura;
    }
    
    
    public void mostrarEstados(){
        //Info de los estados de todos los dispositivos y de la armadura
        armadura.mostrarDispositivos();
        armadura.toString();
    }
    
    public void mostrarEstadoGenerador(){
        armadura.generador.toString();
    }
    
    public void revisarDispositivos(){
        armadura.getListaDispositivos().stream().filter((dispositivo) -> (dispositivo.isEstaDaniado())).forEachOrdered((dispositivo) -> {
            do{
                dispositivo.repararDanios();
            }while(dispositivo.isEstaDaniado() && !dispositivo.isEstaDetruido());
        });
    }
    
    public void radar(){
        //informa la DISTANCIA a la que se encuentra cada objeto detectado x el radar
        //En relacion a la posicion de la armadura (0,0,0)
        ArrayList<ObjetoRadar> listaObjetos = simulador();
        Double dcia;
        
        System.out.println("Distancia con los "+ listaObjetos.size() + " objetos encontrados: ");
        for (ObjetoRadar objeto : listaObjetos) {
            dcia = dciaObjeto(objeto);
            System.out.println(dcia);
            System.out.println("-------");
        }
    }
    
    public Double dciaObjeto(ObjetoRadar objeto){
        Double dcia;
        Integer[] posicionArmadura = {0,0,0};
        
        Integer dciaX, dciaY, dciaZ;
        dciaX = objeto.getX()- posicionArmadura[0];
        dciaY = objeto.getY()- posicionArmadura[1];
        dciaZ = objeto.getZ() - posicionArmadura[2];
        System.out.println("[X,Y,Z]=" + " [" + dciaX + ", " + dciaY + ", " + dciaZ + "]" );
        
        dcia = Math.sqrt(Math.pow(dciaX, 2) + Math.pow(dciaY, 2) + Math.pow(dciaZ, 2));
        
        return dcia;
    }
    
    public ArrayList<ObjetoRadar> simulador(){
        //Crea objetos para que detecte el radar
        ObjetoRadar ob1, ob2, ob3, ob4, ob5;
        ArrayList<ObjetoRadar> listaObjetos = new ArrayList();
        Double probHostil = 0.4;
        
        ob1 = new ObjetoRadar(1, 1, 1, Math.random() <= probHostil, 10000d);
        ob2 = new ObjetoRadar(2, 2, 2, Math.random() <= probHostil, 15000d);
        ob3 = new ObjetoRadar(3, 3, 3, Math.random() <= probHostil, 18000d);
        ob4 = new ObjetoRadar(4, 4, 4, Math.random() <= probHostil, 8000d);
        ob5 = new ObjetoRadar(5, 5, 5, Math.random() <= probHostil, 25000d);
        
        listaObjetos.add(ob1);
        listaObjetos.add(ob2);
        listaObjetos.add(ob3);
        listaObjetos.add(ob4);
        listaObjetos.add(ob5);
        
        return listaObjetos;
    }
    
    
    public void destruirEnemigos(ObjetoRadar objeto){
        Double dciaMaxima = 5000d;
        Double dciaObj;
        boolean dispSano, dispSanos;
        
        //Puede atacar dentro del rango y con dispositivos sanos
        dispSano = !armadura.guanteIzq.isEstaDaniado() || !armadura.guanteDer.isEstaDaniado();
        dispSanos = !armadura.guanteIzq.isEstaDaniado() && !armadura.guanteDer.isEstaDaniado();
        
        dciaObj = dciaObjeto(objeto);
        if(dciaObj <= dciaMaxima && dispSano){
        //Incluir el uso de/los dispositivo/s lo que puede generarle daños
            if(dispSanos){
            //Los dos guantes sanos, ataco con los dos
                do{
                    armadura.atacar(Integer.MIN_VALUE);
                    objeto.setResistencia(objeto.getResistencia() - (1/dciaObj)*2);
                }while(objeto.resistencia == 0 && dispSano);
                System.out.println("Objetivo destruido");
            }else{
            //Solo hay un guante sano para atacar
                do{
                    armadura.atacar(Integer.MIN_VALUE);
                    objeto.setResistencia(objeto.getResistencia() - 1/dciaObj);
                }while(objeto.resistencia == 0 && dispSano);
                System.out.println("Objetivo destruido");
                }    
        }else
            System.out.println("Fuera de rango de ataque o dispositivo dañado");  
    }
    
    public void accionesEvasivas(){
        ArrayList<ObjetoRadar> listaObjetos = simulador();
        ArrayList<ObjetoRadar> objetosHostiles = new ArrayList();
        for (ObjetoRadar objeto : listaObjetos) {
            if(objeto.isHostil())
                objetosHostiles.add(objeto);
        }
        //Objetos hostiles distinguidos
        for (ObjetoRadar objetoHostil : objetosHostiles) {
            try{
                destruirEnemigos(objetoHostil);
            }catch(Exception e){
                /*
                System.out.println("Ataque interrumpido!");
                System.out.println("Guantes dañados..");
                */
            }
            
        }
    }

}
