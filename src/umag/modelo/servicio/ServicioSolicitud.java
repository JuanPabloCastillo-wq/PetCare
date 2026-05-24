/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.servicio;

import umag.modelo.entidad.Cliente;
import umag.modelo.entidad.Prestador;
import umag.modelo.entidad.Solicitud;

/**
 *
 * @author Castillo
 */
public class ServicioSolicitud {
        // Falta agregar el Dao
    
        public boolean guardar(int id, String comentario, Cliente cliente, Prestador prestador){
            
        if (cliente == null || prestador  == null || id == 0) {
        return false;
        }else{
            Solicitud solicitud = new Solicitud(id, comentario, cliente, prestador);
                    
            return true;
        }
    }
}

