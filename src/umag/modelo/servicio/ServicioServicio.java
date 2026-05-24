/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.servicio;

import umag.modelo.entidad.Servicio;



/**
 *
 * @author Castillo
 */
public class ServicioServicio {
    // Falta agregar el Dao
    
        public boolean guardar(String tiposervicio, String descripcióndelservicio, int preciobase, int duración){
            
        if (preciobase <= 0 || tiposervicio == null || tiposervicio.trim().isEmpty()) {
        return false;
        }else{
            Servicio servicio = new Servicio(tiposervicio, descripcióndelservicio, preciobase, duración);
                    
            return true;
        }
    }
}

