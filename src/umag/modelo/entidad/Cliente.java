/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.entidad;

import java.io.Serializable;

/**
 *
 * @author Castillo
 */
public class Cliente implements Serializable{
    private String id;
    private int edad;
    private String nombre;
    private Mascota mascota;
    private String email;
    private String direccion;
    
    private int teléfono;

    public Cliente(String id, int edad, String nombre, Mascota mascota, String email, String direccion,  int teléfono) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.mascota = mascota;
        this.email = email;
        this.direccion = direccion;
        
        this.teléfono = teléfono;
    }

    public Cliente() {
    }
    

    

    @Override
    public String toString() {
        return "Cliente{" + "id=" + getId() + ", edad=" + edad + ", nombre=" + nombre + ", mascota=" + mascota + ", email=" + email + ", direccion=" + direccion + ", tel\u00e9fono=" + teléfono + '}' + "\n";
    }
    
    /**
     * @return the id
     */
    

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the mascota
     */
    public Mascota getMascota() {
        return mascota;
    }

    /**
     * @param mascota the mascota to set
     */
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the metodoPago
     */
   
    /**
     * @return the teléfono
     */
    public int getTeléfono() {
        return teléfono;
    }

    /**
     * @param teléfono the teléfono to set
     */
    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
