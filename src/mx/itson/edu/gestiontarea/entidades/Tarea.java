/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.gestiontarea.entidades;

/**
 *
 * @author enri0
 */
public class Tarea {
    
    private int id;
    private String tarea;
    private int completada;
    private int incompleta;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tarea
     */
    public String getTarea() {
        return tarea;
    }

    /**
     * @param tarea the tarea to set
     */
    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    /**
     * @return the completada
     */
    public int getCompletada() {
        return completada;
    }

    /**
     * @param completada the completada to set
     */
    public void setCompletada(int completada) {
        this.completada = completada;
    }

    /**
     * @return the incompleta
     */
    public int getIncompleta() {
        return incompleta;
    }

    /**
     * @param incompleta the incompleta to set
     */
    public void setIncompleta(int incompleta) {
        this.incompleta = incompleta;
    }
    
    
    
}
