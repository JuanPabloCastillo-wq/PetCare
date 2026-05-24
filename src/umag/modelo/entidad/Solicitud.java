/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.entidad;

/**
 *
 * @author Castillo
 */
public class Solicitud {
    private int id;
    private String comentario;
    private Cliente cliente;
    private Prestador prestador;

    public Solicitud(int id, String comentario, Cliente cliente, Prestador prestador) {
        this.id = id;
        this.comentario = comentario;
        this.cliente = cliente;
        this.prestador = prestador;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "id=" + id + ", comentario=" + comentario + ", cliente=" + cliente + ", prestador=" + prestador + '}';
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the prestador
     */
    public Prestador getPrestador() {
        return prestador;
    }

    /**
     * @param prestador the prestador to set
     */
    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }
    
}
