/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.control;


import umag.modelo.servicio.ServicioServicio;

/**
 *
 * @author Castillo
 */
public class ControlServicio {
         ServicioServicio servicio = new ServicioServicio();
         public boolean guardarServicio(String tiposervicio, String descripcióndelservicio, int preciobase, int duración){
         boolean res3= servicio.guardar(tiposervicio, descripcióndelservicio, preciobase, duración);
         return res3;
     }
}
