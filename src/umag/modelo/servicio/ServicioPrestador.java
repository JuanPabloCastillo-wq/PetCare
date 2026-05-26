/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.servicio;


import java.io.IOException;
import umag.modelo.entidad.Prestador;
import umag.modelo.entidad.Servicio;
import umag.modelo.persistencia.DaoPrestador;

/**
 *
 * @author Castillo
 */
public class ServicioPrestador {
    
    DaoPrestador dao = new DaoPrestador();
        public boolean guardar(String id, long cédula, long teléfono, int edad, String nombre, String email, String dirección, String banco, boolean disponibilidad, Servicio servicio){
       
        if (cédula <= 0 || servicio == null ) {
        return false;
        }else{
            try {
                Prestador prestador =new Prestador(id, cédula, teléfono, edad, nombre, email, dirección, banco, disponibilidad, servicio);
                dao.guardar(prestador);
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

