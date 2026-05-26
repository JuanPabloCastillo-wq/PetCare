/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.servicio;

import java.io.IOException;
import umag.modelo.entidad.Cliente;
import umag.modelo.entidad.Prestador;
import umag.modelo.entidad.Solicitud;
import umag.modelo.persistencia.DaoSolicitud;

/**
 *
 * @author Castillo
 */
public class ServicioSolicitud {
        DaoSolicitud dao = new DaoSolicitud();
    
        public boolean guardar(int id, String comentario, Cliente cliente, Prestador prestador){
            
        if (cliente == null || prestador  == null || id == 0) {
        return false;
        }else{
            Solicitud solicitud = new Solicitud(id, comentario, cliente, prestador);
            try {
                dao.guardar(solicitud);
            } catch (IOException ex) {
                System.getLogger(ServicioSolicitud.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            } catch (ClassNotFoundException ex) {
                System.getLogger(ServicioSolicitud.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            return true;
        }
    }
}

