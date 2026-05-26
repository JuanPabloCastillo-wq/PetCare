/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.control;
import umag.modelo.entidad.Cliente;
import umag.modelo.entidad.Prestador;
import umag.modelo.servicio.ServicioSolicitud;
/**
 *
 * @author Castillo
 */
public class ControlSolicitud {
    ServicioSolicitud solicitud = new ServicioSolicitud();
        public boolean guardarSolicitud(int id, String comentario, Cliente cliente, Prestador prestador){
        boolean res= solicitud.guardar(id, comentario, cliente, prestador);
        return res;
    }
}
