/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.servicio;
import java.io.IOException;
import umag.modelo.entidad.Mascota;
import umag.modelo.persistencia.DaoMascota;

/**
 *
 * @author Castillo
 */
public class ServicioMascota {
    
    DaoMascota dao = new DaoMascota();
        public boolean guardar(String raza, String nombre, int edad, String especie, double peso, String informaciónMédica, String id){
        if (especie == null || especie.isEmpty()) {
        return false;
        }else{
            Mascota mascota = new Mascota(raza, nombre, edad, especie, peso, informaciónMédica, id);
            try {
                dao.guardar(mascota);
            } catch (IOException ex) {
                System.getLogger(ServicioMascota.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            } catch (ClassNotFoundException ex) {
                System.getLogger(ServicioMascota.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            return true;
        }
    }
}

