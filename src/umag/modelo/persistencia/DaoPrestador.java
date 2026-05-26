/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.modelo.persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import umag.modelo.entidad.Prestador;
import umag.modelo.entidad.Servicio;

/**
 *
 * @author Castillo
 */

public class DaoPrestador {
    private String archivo = "Prestadores.dat";
    
    public boolean guardar(Prestador prestador) throws FileNotFoundException, IOException, ClassNotFoundException{
        // aqui se guarda
        
        List<Prestador> lista = listar();
        lista.add(prestador);
        FileOutputStream file =new FileOutputStream(archivo);
        ObjectOutputStream fil =new ObjectOutputStream(file);
        fil.writeObject(lista);
        fil.close();
        file.close();
        return true;
    }
 
    public boolean borrar(String id) throws IOException, ClassNotFoundException{
        List<Prestador> lista = listar();
        for (Prestador prestador : lista) {
            
            if(prestador.getId().equals(id)){
                lista.remove(prestador);
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
    
    public List<Prestador> listar() throws IOException, ClassNotFoundException {
        List<Prestador> lista=new ArrayList<>();
        FileInputStream file;
        try {
            file = new FileInputStream(archivo);
            ObjectInputStream entrada=new ObjectInputStream(file);
            lista = (List<Prestador>) entrada.readObject();
            
        } catch (FileNotFoundException ex) {
            System.out.println(" No existe archivo ");
        }
        return lista;
        
        
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
          
        DaoPrestador lec = new DaoPrestador();
        List<Prestador> lista= lec.listar();
         for (Prestador prestador : lista) {
         System.out.println("} "+prestador.toString());
        }
    }
} 

