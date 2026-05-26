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
import umag.modelo.entidad.Cliente;
import umag.modelo.entidad.Mascota;

/**
 *
 * @author Castillo
 */
public class DaoCliente {
    private String archivo = "Clientes.dat";
    
    public boolean guardar(Cliente cliente) throws FileNotFoundException, IOException, ClassNotFoundException{
        // aqui se guarda
        
        List<Cliente> lista = listar();
        lista.add(cliente);
        FileOutputStream file =new FileOutputStream(archivo);
        ObjectOutputStream fil =new ObjectOutputStream(file);
        fil.writeObject(lista);
        fil.close();
        file.close();
        return true;
    }
 
    public boolean borrar(String id) throws IOException, ClassNotFoundException{
        List<Cliente> lista = listar();
        for (Cliente cliente : lista) {
            
            if(cliente.getId().equals(id)){
                lista.remove(cliente);
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
    
    public List<Cliente> listar() throws IOException, ClassNotFoundException {
        List<Cliente> lista=new ArrayList<>();
        FileInputStream file;
        try {
            file = new FileInputStream(archivo);
            ObjectInputStream entrada=new ObjectInputStream(file);
            lista= (List<Cliente>) entrada.readObject();
            
        } catch (FileNotFoundException ex) {
            System.out.println(" No existe archivo ");
        }
        return lista;
        
        
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
          
        DaoCliente lec = new DaoCliente();
        List<Cliente> lista= lec.listar();
         for (Cliente cliente : lista) {
         System.out.println("} "+cliente.toString());
        }
    }
}

