/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarrayparte2;

/**
 *
 * @author alumno
 */
public class Nota {
    private String modulo;
    private int calificacion;
    
    public Nota(String modulo) {
        this.modulo = modulo;
    }

    public Nota(String modulo, int calificacion) {
        this.modulo = modulo;
        this.calificacion = calificacion;
    }

    /**
     * @return the modulo
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the calificacion
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return modulo + " -- " + calificacion + "\n";
    }
    
    
}
