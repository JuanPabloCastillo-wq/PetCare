/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.control;

import umag.modelo.entidad.Servicio;
import umag.modelo.servicio.ServicioPrestador;

/**
 *
 * @author Castillo
 */
public class ControlPrestador {
     ServicioPrestador prestador = new ServicioPrestador();
     public boolean guardarPrestador(String id, int cédula, int teléfono, int edad, String nombre, String email, String dirección, String banco, boolean disponibilidad, Servicio servicio){
        boolean res2= prestador.guardar(id, cédula, teléfono, edad, nombre, email, dirección, banco, disponibilidad, servicio);
        return res2;
    }
}
