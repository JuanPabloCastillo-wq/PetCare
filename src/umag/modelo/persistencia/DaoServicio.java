/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.persistencia;

import umag.modelo.entidad.Servicio;
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
public class DaoServicio {
        private String archivo = "Prestador.dat";
    
    public boolean guardar(Servicio servicio) throws FileNotFoundException, IOException, ClassNotFoundException{
        // aqui se guarda
        
        List<Servicio> lista = listar();
        lista.add(servicio);
        FileOutputStream file =new FileOutputStream(archivo);
        ObjectOutputStream fil =new ObjectOutputStream(file);
        fil.writeObject(lista);
        fil.close();
        file.close();
        return true;
    }
 
    // public boolean borrar(String id) throws IOException, ClassNotFoundException{
    //    List<Servicio> lista = listar();
    //    for (Servicio servicio : lista) {
    //        
    //        if(servicio.getId().equals(id)){
    //            lista.remove(prestador);
    //            break;
    //        }
    //    }
    //    FileOutputStream file=new FileOutputStream(archivo);
    //    ObjectOutputStream fil=new ObjectOutputStream(file);
    //    fil.writeObject(lista);
    //    fil.close();
    //    file.close();
    //    return true;
   // }
    
    public List<Servicio> listar() throws IOException, ClassNotFoundException {
        List<Servicio> lista=new ArrayList<>();
        FileInputStream file;
        try {
            file = new FileInputStream(archivo);
            ObjectInputStream entrada=new ObjectInputStream(file);
            lista = (List<Servicio>) entrada.readObject();
            
        } catch (FileNotFoundException ex) {
            System.out.println(" No existe archivo ");
        }
        return lista;
        
        
    }
} 

