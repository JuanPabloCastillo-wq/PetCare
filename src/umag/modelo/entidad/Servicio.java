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
public class Servicio implements Serializable{
    private String tiposervicio;
    private String descripcióndelservicio;
    private int preciobase;
    private int duración;

    public Servicio(String tiposervicio, String descripcióndelservicio, int preciobase, int duración) {
        this.tiposervicio = tiposervicio;
        this.descripcióndelservicio = descripcióndelservicio;
        this.preciobase = preciobase;
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Servicio{" + "tiposervicio=" + tiposervicio + ", descripci\u00f3ndelservicio=" + descripcióndelservicio + ", preciobase=" + preciobase + ", duraci\u00f3n=" + duración + '}';
    }
    
    /**
     * @return the tiposervicio
     */
    public String getTiposervicio() {
        return tiposervicio;
    }

    /**
     * @param tiposervicio the tiposervicio to set
     */
    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    /**
     * @return the descripcióndelservicio
     */
    public String getDescripcióndelservicio() {
        return descripcióndelservicio;
    }

    /**
     * @param descripcióndelservicio the descripcióndelservicio to set
     */
    public void setDescripcióndelservicio(String descripcióndelservicio) {
        this.descripcióndelservicio = descripcióndelservicio;
    }

    /**
     * @return the preciobase
     */
    public int getPreciobase() {
        return preciobase;
    }

    /**
     * @param preciobase the preciobase to set
     */
    public void setPreciobase(int preciobase) {
        this.preciobase = preciobase;
    }

    /**
     * @return the duración
     */
    public int getDuración() {
        return duración;
    }

    /**
     * @param duración the duración to set
     */
    public void setDuración(int duración) {
        this.duración = duración;
    }
    
    
}
