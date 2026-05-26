/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import umag.modelo.entidad.Mascota;
/**
 *
 * @author Castillo
 */
public class DaoMascota {
    private String archivo = "Mascota.dat";
    
    public boolean guardar(Mascota mascota) throws FileNotFoundException, IOException, ClassNotFoundException{
        // aqui se guarda
        
        List<Mascota> lista = listar();
        lista.add(mascota);
        FileOutputStream file =new FileOutputStream(archivo);
        ObjectOutputStream fil =new ObjectOutputStream(file);
        fil.writeObject(lista);
        fil.close();
        file.close();
        return true;
    }
 
    public boolean borrar(String id) throws IOException, ClassNotFoundException{
        List<Mascota> lista = listar();
        for (Mascota mascota : lista) {
            
            if(mascota.getId().equals(id)){
                lista.remove(mascota);
                break;
            }
        }
        FileOutputStream file=new FileOutputStream(archivo);
        ObjectOutputStream fil=new ObjectOutputStream(file);
        fil.writeObject(lista);
        fil.close();
        file.close();
        return true;
    }
    
    public List<Mascota> listar() throws IOException, ClassNotFoundException {
        List<Mascota> lista=new ArrayList<>();
        FileInputStream file;
        try {
            file = new FileInputStream(archivo);
            ObjectInputStream entrada=new ObjectInputStream(file);
            lista= (List<Mascota>) entrada.readObject();
            
        } catch (FileNotFoundException ex) {
            System.out.println(" No existe archivo ");
        }
        return lista;
        
        
    }
}

