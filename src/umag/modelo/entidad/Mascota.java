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
public class Mascota implements Serializable{
    private String raza;
    private String nombre;
    private int edad;
    private String especie; 
    private double peso;
    private String informaciónMédica;
    private String id;

    public Mascota(String raza, String nombre, int edad, String especie, double peso, String informaciónMédica, String id) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
        this.informaciónMédica = informaciónMédica;
        this.id = id;
    }

    Mascota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Mascota{" + "raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + ", peso=" + peso + ", informaci\u00f3nM\u00e9dica=" + informaciónMédica + ", id=" + id + '}';
    }

    
    
    
    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
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
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the informaciónMédica
     */
    public String getInformaciónMédica() {
        return informaciónMédica;
    }

    /**
     * @param informaciónMédica the informaciónMédica to set
     */
    public void setInformaciónMédica(String informaciónMédica) {
        this.informaciónMédica = informaciónMédica;
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
