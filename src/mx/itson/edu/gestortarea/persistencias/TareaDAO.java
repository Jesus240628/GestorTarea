/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.gestortarea.persistencias;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.edu.gestiontarea.entidades.Tarea;

/**
 *
 * @author enri0
 */
public class TareaDAO {
    
    /**
     * Genera una lista de periodos de pago para su despliegue en la interfaz
     * @return la lista de periodos de pago generada
     */
       public static List<Tarea> obtenerTodos(){
       List<Tarea> tareas = new ArrayList<>();
       try{
           Connection conexion = Conexion.obtener();
           Statement statement = conexion.createStatement();
           ResultSet rs = statement.executeQuery("SELECT * from tareadb");
           while(rs.next()){
               Tarea t = new Tarea();
               t.setId(rs.getInt(1));
               t.setTarea(rs.getString(2));
               t.getEstado();
 
               tareas.add(t);
           }
       } catch(SQLException ex){
          System.err.print("Ocurrio un error al obtener usuario: " + ex.getMessage()); 
       }
       return tareas;
    }    
    
}
