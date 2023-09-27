/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioherencia;

/**
 *
 * @author Juan
 */
public enum FactoresRiesgo {
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    OCHO(8),
    NUEVE(9),
    DIEZ(10),
    ONCE(11),
    DOCE(12),
    TRECE(13);
    
    private final int valor;

    FactoresRiesgo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
