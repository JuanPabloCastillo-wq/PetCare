/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.servicio;
import umag.modelo.entidad.Mascota;

/**
 *
 * @author Castillo
 */
public class ServicioMascota {
    // Falta agregar el Dao
    // DaoMascota dao = new DaoMascota();
        public boolean guardar(String raza, String nombre, int edad, String especie, double peso, String informaciónMédica, String id){
        if (especie == null || especie.isEmpty()) {
        return false;
        }else{
            Mascota mascota = new Mascota(raza, nombre, edad, especie, peso, informaciónMédica, id);
                    
            return true;
        }
    }
}

