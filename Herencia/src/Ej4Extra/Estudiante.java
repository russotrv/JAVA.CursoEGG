/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4Extra;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Estudiante extends Persona {
    /*
    En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados.
    */
    
    protected ArrayList<String> cursoMatriculado = new ArrayList();

    public Estudiante() {
    }

    public Estudiante(String cursoMatriculado, String nombre, String apellido, String estadoCivil, Integer numIdentificacion) {
        super(nombre, apellido, estadoCivil, numIdentificacion);
        this.cursoMatriculado.add(cursoMatriculado);
    }

    public ArrayList<String> getCursoMatriculado() {
        return cursoMatriculado;
    }
    
    private void setCursoMatriculado(String cursoMatriculado){
        this.cursoMatriculado.add(cursoMatriculado);
    }
    
    public void agregarCursoMatriculado(String cursoMatriculado) {
        setCursoMatriculado(cursoMatriculado);
    }

    @Override
    public void cambiarEstadoCivil(String estadoCivil){
        super.cambiarEstadoCivil(estadoCivil);
    }
    
    @Override
    public String toString() {
        return super.toString() + "cursoMatriculado=" + getCursoMatriculado() + '}';
    }
    
    
}
