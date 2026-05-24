/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.control;

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
}
