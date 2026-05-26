/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.persistencia;
import umag.modelo.entidad.Solicitud;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Castillo
 */
public class DaoSolicitud {
    private String archivo = "Solicitudes.dat";
    
    public boolean guardar(Solicitud solicitud) throws FileNotFoundException, IOException, ClassNotFoundException{
        // aqui se guarda
        
        List<Solicitud> lista = listar();
        lista.add(solicitud);
        FileOutputStream file =new FileOutputStream(archivo);
        ObjectOutputStream fil =new ObjectOutputStream(file);
        fil.writeObject(lista);
        fil.close();
        file.close();
        return true;
    }
 

    
    public List<Solicitud> listar() throws IOException, ClassNotFoundException {
        java.util.List<Solicitud> lista = new java.util.ArrayList<>();
    java.io.FileInputStream file;
    try {
        file = new java.io.FileInputStream("Solicitudes.dat");
        java.io.ObjectInputStream entrada = new java.io.ObjectInputStream(file);
        lista = (java.util.List<Solicitud>) entrada.readObject();
    } catch (java.io.FileNotFoundException ex) {
        System.out.println("No existe archivo de solicitudes");
    }
    return lista;
    }
    public boolean actualizarTodas(java.util.List<Solicitud> listaNueva) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Solicitudes.dat"))) {
        oos.writeObject(listaNueva);
        return true;
    } catch (Exception e) {
        return false;
    }
}
}

