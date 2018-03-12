/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarrayparte2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private ArrayList<Nota> notas;

    /**
     *
     * @param nombre
     * @param notas
     */
    public Alumno(String nombre, ArrayList<Nota> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    /**
     * Añade la nota a un módulo
     * @param modulo Recibe un nombre de el modulo
     */
    public void ponerNota(String modulo){ 
        
        Scanner sc = new Scanner(System.in);
        int nota=0;
    
        for (int i = 0; i < getNotas().size(); i++) {
           if (getNotas().get(i).getModulo().equalsIgnoreCase(modulo)){
                System.out.println("Dime la nota: ");
                nota=sc.nextInt();
                getNotas().get(i).setCalificacion(nota);
                break;
           } 
        }
    }
    /**
     * Obtiene la mejor nota de el alumno
     * @return Devuelve un entero con la mejor Nota de la notas que tenga
     */
    public int obtenerMejorNota(){
    
        int max=0;
        
        for (int i = 0; i < getNotas().size(); i++) {
            if(getNotas().get(i).getCalificacion()>max){
                max=getNotas().get(i).getCalificacion();
            }
        }
      return max;
    }
    /**
     * Obtiene la nota de un módulo
     * @param modulo Se pide un nombre de el modulo
     * @return Devuelve un número que será la nota del módulo, si no encuentra el módulo devuelve -1
     */
    public int obtenerCalificacionModulo(String modulo){
    
        int calificacionModulo = -1;
        
        for (int i = 0; i < getNotas().size(); i++) {
            if (getNotas().get(i).getModulo().equalsIgnoreCase(modulo)){
               calificacionModulo=getNotas().get(i).getCalificacion();
               break;
           } 
        }
      return calificacionModulo;
    }

    @Override
    public String toString() {
        String aux = "";
        
        for (int i = 0; i < getNotas().size(); i++) {
            aux+=getNotas().toString();
        }
     
        return "Nombre: " + getNombre() + "\n" + aux;
                
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the notas
     */
    public ArrayList<Nota> getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    
    
    
    
    
}
