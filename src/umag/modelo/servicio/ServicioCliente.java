/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.servicio;


import java.io.IOException;
import umag.modelo.entidad.Cliente;
import umag.modelo.entidad.Mascota;
import umag.modelo.persistencia.DaoCliente;

/**
 *
 * @author Castillo
 */
public class ServicioCliente {
    
    DaoCliente dao = new DaoCliente();
        public boolean guardar(String id, int edad, String nombre, Mascota mascota, String email, String direccion, int teléfono){
        if (mascota == null) {
            // El cliente necesita una mascota para usar el servicio
        return false;
        }else{
            try {
                Cliente cliente =new Cliente(id, edad, nombre, mascota, email, direccion, teléfono);
                dao.guardar(cliente);
                return true;
            } catch (IOException ex) {
                System.out.println(" "+ex.getMessage());
            } catch (ClassNotFoundException ex) {
                System.out.println(" "+ex.getMessage());
            }
            return false;
        }
    }
}

