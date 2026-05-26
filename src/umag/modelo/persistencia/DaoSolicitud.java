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
        List<Solicitud> lista=new ArrayList<>();
        FileInputStream file;
        try {
            file = new FileInputStream(archivo);
            ObjectInputStream entrada=new ObjectInputStream(file);
            lista= (List<Solicitud>) entrada.readObject();
            
        } catch (FileNotFoundException ex) {
            System.out.println(" No existe archivo ");
        }
        return lista;
        
        
    }
}

