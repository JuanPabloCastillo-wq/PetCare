/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.servicio;


import umag.modelo.entidad.Prestador;
import umag.modelo.entidad.Servicio;

/**
 *
 * @author Castillo
 */
public class ServicioPrestador {
    // Falta agregar el Dao
    
        public boolean guardar(String id, int cédula, int teléfono, int edad, String nombre, String email, String dirección, String banco, boolean disponibilidad, Servicio servicio){
            int longitudCedula = String.valueOf(cédula).length();
        if (cédula <= 0 || longitudCedula < 8 || longitudCedula > 10 || servicio == null ) {
        return false;
        }else{
            Prestador prestador = new Prestador(id, cédula, teléfono, edad, nombre, email, dirección, banco, disponibilidad, servicio);
                    
            return true;
        }
        
    }
   //     public boolean actualizarDisponibilidad(String id, boolean disponibilidad) {
    // Le pides el prestador al DAO usando su ID
  //  Prestador p = daoPrestador.buscarPorId(idPrestador);
    
  //  if (p != null) {
  //      p.setDisponibilidad(nuevoEstado); // Cambias el estado (true/false)
  //      daoPrestador.actualizarArchivo(); // Le dices al DAO que guarde los cambios en el archivo .dat
 //       return true;
  //  }
   // return false;
//}
}

