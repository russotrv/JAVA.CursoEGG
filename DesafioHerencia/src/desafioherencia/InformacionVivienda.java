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
public class InformacionVivienda {
    protected Integer numDormitorios;
    protected String tipoParedes, tipoPisos;
    protected boolean iluminacion;

    public InformacionVivienda() {
    }

    public InformacionVivienda(Integer numDormitorios, String tipoParedes, String tipoPisos, boolean iluminacion) {
        this.numDormitorios = numDormitorios;
        this.tipoParedes = tipoParedes;
        this.tipoPisos = tipoPisos;
        this.iluminacion = iluminacion;
    }

    public Integer getNumDormitorios() {
        return numDormitorios;
    }

    public void setNumDormitorios(Integer numDormitorios) {
        this.numDormitorios = numDormitorios;
    }

    public String getTipoParedes() {
        return tipoParedes;
    }

    public void setTipoParedes(String tipoParedes) {
        this.tipoParedes = tipoParedes;
    }

    public String getTipoPisos() {
        return tipoPisos;
    }

    public void setTipoPisos(String tipoPisos) {
        this.tipoPisos = tipoPisos;
    }

    public boolean isIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(boolean iluminacion) {
        this.iluminacion = iluminacion;
    }

    @Override
    public String toString() {
        return "InformacionVivienda{" + " numDormitorios=" + numDormitorios + ", tipoParedes=" + tipoParedes + ", tipoPisos=" + tipoPisos + ", iluminacion=" + iluminacion + '}';
    }
    
    
}
