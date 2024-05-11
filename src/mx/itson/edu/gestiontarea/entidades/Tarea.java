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
    private String descripcion;
    private Enum estado;
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
     * @return the estado
     */
    public Enum getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Enum estado) {
        this.estado = estado;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
