/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.control;

import umag.modelo.entidad.Mascota;
import umag.modelo.servicio.ServicioCliente;

/**
 *
 * @author Castillo
 */
public class ControlCliente {
        ServicioCliente cliente = new ServicioCliente();
        public boolean guardarCliente(String id, int edad, String nombre, Mascota mascota, String email, String direccion, int teléfono){
        boolean res= cliente.guardar(id, edad, nombre, mascota, email, direccion, teléfono);
        return res;
    }
        
}
