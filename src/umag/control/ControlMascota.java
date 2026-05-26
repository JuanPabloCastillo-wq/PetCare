/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.control;

import umag.modelo.entidad.Mascota;
import umag.modelo.servicio.ServicioMascota;

/**
 *
 * @author Castillo
 */
public class ControlMascota {
        ServicioMascota mascota = new ServicioMascota();
        public boolean guardarMascota(String raza, String nombre, int edad, String especie, double peso, String informaciónMédica, String id){
        boolean res1= mascota.guardar(raza, nombre, edad, especie, peso, informaciónMédica, id);
        return res1;
    }
    // El Singleton guiado por tu ejemplo de FabRecursos
    private static ControlMascota instancia;
    private ServicioMascota servicioMascota;

    public static ControlMascota getInstance() {
        if (instancia == null) {
            instancia = new ControlMascota();
        }
        return instancia;
    }

    private ControlMascota() {
        servicioMascota = new ServicioMascota();
    }
}
