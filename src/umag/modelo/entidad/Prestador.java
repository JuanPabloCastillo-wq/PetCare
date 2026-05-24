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
public class Prestador implements Serializable {
    private String id;
    private int cédula;
    private int teléfono;
    private int edad;
    private String nombre;
    private String email;
    private String dirección;
    private String banco;
    private boolean disponibilidad;
    private Servicio servicio;

    public Prestador(String id, int cédula, int teléfono, int edad, String nombre, String email, String dirección, String banco, boolean disponibilidad, Servicio servicio) {
        this.id = id;
        this.cédula = cédula;
        this.teléfono = teléfono;
        this.edad = edad;
        this.nombre = nombre;
        this.email = email;
        this.dirección = dirección;
        this.banco = banco;
        this.disponibilidad = disponibilidad;
        this.servicio = servicio;
    }
    
    
         
    @Override
    public String toString() {
        return "Prestador{" + "id=" + id + ", c\u00e9dula=" + cédula + ", tel\u00e9fono=" + teléfono + ", edad=" + edad + ", nombre=" + nombre + ", email=" + email + ", direcci\u00f3n=" + dirección + ", banco=" + banco + ", disponibilidad=" + disponibilidad + '}';
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

    /**
     * @return the cédula
     */
    public int getCédula() {
        return cédula;
    }

    /**
     * @param cédula the cédula to set
     */
    public void setCédula(int cédula) {
        this.cédula = cédula;
    }

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
     * @return the dirección
     */
    public String getDirección() {
        return dirección;
    }

    /**
     * @param dirección the dirección to set
     */
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the disponibilidad
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * @return the servicio
     */
    public Servicio getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
}
