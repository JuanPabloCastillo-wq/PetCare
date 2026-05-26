/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.servicio;

import java.io.IOException;
import umag.modelo.entidad.Servicio;
import umag.modelo.persistencia.DaoServicio;



/**
 *
 * @author Castillo
 */
public class ServicioServicio {
    
    DaoServicio dao = new DaoServicio();
        public boolean guardar(String tiposervicio, String descripcióndelservicio, int preciobase, int duración){
            
        if (preciobase <= 0 || tiposervicio == null || tiposervicio.trim().isEmpty()) {
        return false;
        }else{
            Servicio servicio = new Servicio(tiposervicio, descripcióndelservicio, preciobase, duración);
            try {
                dao.guardar(servicio);
            } catch (IOException ex) {
                System.getLogger(ServicioServicio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            } catch (ClassNotFoundException ex) {
                System.getLogger(ServicioServicio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            return true;
        }
    }
}

