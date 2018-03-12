package ejarrayparte2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author alumno
 */
public class Grupo {
    
    private ArrayList<Alumno> alumnos;

    public Grupo() {
        alumnos = new ArrayList<>();
    }
    /**
     * Añade un alumno al grupo
     * @param nombre Recibe un nombre de alummno(comprueba si existe)
     * @param modulos Un vector de modulos que luego se convierte en arrayList
     */
    public void matricular(String nombre,String[] modulos){
    
        boolean verificacion=false;
        
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.size()!=0){
                if (nombre.equalsIgnoreCase(alumnos.get(i).getNombre())){
                    verificacion=true;
                    System.out.println("El nombre de el alumno ya existe");
                    break;
                }
            }
        }
        
        if (verificacion==false){
        
            ArrayList<Nota> notas = new ArrayList<>();
            
            for (int i = 0; i < modulos.length; i++) {
                if(modulos[i]!=null){
                    Nota n1 = new Nota(modulos[i]);
                    notas.add(n1);
                }
            }
            
            Alumno a1 = new Alumno(nombre, notas);
            alumnos.add(a1);
            
        }
        
       
    }
    /**
     * Añade la nota a un alumno del grupo con un determinado modulo
     * @param nombre Recibe un nombre de un alumno
     * @param modulo Recibe un nombre de un módulo 
     */
    public void ponerNota(String nombre,String modulo){
    
        for (int i = 0; i < alumnos.size(); i++) {
            if(nombre.equalsIgnoreCase(alumnos.get(i).getNombre())){
                alumnos.get(i).ponerNota(modulo);
                break;
            }
        }   
    }
    /**
     * Borra un alumno
     * @param nombre Recibe un nombre de un alumno
     */
    public void borrarAlumno(String nombre){
    
        for (int i = 0; i < alumnos.size(); i++) {
            if(nombre.equalsIgnoreCase(alumnos.get(i).getNombre())){
                alumnos.remove(alumnos.get(i));
                break;
            }
        }
    
    }
    /**
     * Borra todos los alumnos
     */
    public void borrarTodosAlumnos(){
    
        alumnos.clear();
    
    }
    /**
     * Calcula el número de suspensos del grupo
     * @return Devuelve un entero con la cantidad de suspensos
     */
    public int suspensos(){
    
        int suspenso=0;
        
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.get(i).getNotas().size(); j++) {
                if(alumnos.get(i).getNotas().get(j).getCalificacion()<5){
                    suspenso++;
                }
            }
        }
    return suspenso;
    }
    /**
     * Obtiene la mejor nota del grupo
     * @return Devuelve la mejor nota del grupo
     */
    public int obtenerMejorNota(){
    
       ArrayList<Integer> notasGrupo = new ArrayList<>();
       
        for (int i = 0; i < alumnos.size(); i++) {
            notasGrupo.add(alumnos.get(i).obtenerMejorNota());
        }
        
        Collections.sort(notasGrupo);
        
        return notasGrupo.get(notasGrupo.size());   
    }
    /**
     * Comprueba si el alumno está matriculado
     * @param nombre Recibe el nombre de el alumno
     */
    public void estaMatriculado(String nombre){
    
        for (int i = 0; i < alumnos.size(); i++) {
            if(alumnos.get(i).getNombre().equalsIgnoreCase(nombre)){
                System.out.println("El alumno " + nombre + " está matriculado");
                break;
            }
        }
    
    }
}
