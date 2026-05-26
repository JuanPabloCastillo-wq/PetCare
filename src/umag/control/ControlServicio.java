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
         boolean res= servicio.guardar(tiposervicio, descripcióndelservicio, preciobase, duración);
         return res;
     }
    
    // 1. Atributo estático privado para la instancia única
    private static ControlServicio instancia;
    private ServicioServicio servicioServicio;

    // 2. Método público para obtener la instancia del Singleton
    public static ControlServicio getInstance() {
        if (instancia == null) {
            instancia = new ControlServicio();
        }
        return instancia;
    }

    // 3. Constructor privado
    private ControlServicio() {
        servicioServicio = new ServicioServicio();
    }
}
