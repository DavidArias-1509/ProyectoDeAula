/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencias;

import cuentas.Venta;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author steban
 */
public class ArchivoVenta extends Archivo {
    
    private ListaVenta list;
    
    public ArchivoVenta() {
        this("Venta.obj");
    }

    public ArchivoVenta(String name) {
        super(name);
    }

    public void leerListaVenta() throws IOException{
        if(!this.arch.exists()){
            this.list = new ListaVenta();
        }else{
            this.aLectura=null;
            try{
               this.aLectura = new ObjectInputStream(new FileInputStream(this.arch));
               this.list = (ListaVenta) this.aLectura.readObject();
            }catch(IOException ex){
                throw new IOException("Archivo no entcontrado: "+ex);
            } catch (ClassNotFoundException ex) {
                throw new IOException("No se encontro elementos");
            }finally{
                if(this.aLectura!=null){
                    this.aLectura.close();
                }
            }
        }
    }
    
    public void guardarLista() throws IOException{
        this.aEscritura = null;
        try{
            this.aEscritura = new ObjectOutputStream(new FileOutputStream(this.arch));
            this.aEscritura.writeObject(this.list);
        }catch(IOException ex){
            System.err.println("Error: "+ ex );
        }finally{
            if(this.aEscritura!=null){
                this.aEscritura.close();
            }
        }
    }
    
    @Override
    public Venta buscarItem(String id) {
        try {
            this.leerListaVenta();
            return this.list.buscarItem(id);
        } catch (IOException ex) {
            System.err.println("Erro: "+ ex);
        }
        return null;
    }

    @Override
    public void borrarItem(String id) throws IOException {
        this.leerListaVenta();
        this.list.borrarItem(id);
        this.guardarLista();
    }

    @Override
    public void agregarItem(Object item) throws IOException {
        this.leerListaVenta();
        this.list.agregarItem(item);
        this.guardarLista();
    }

    @Override
    public List<Venta> generarInforme() throws IOException {
       this.leerListaVenta();
       return this.list.generarInforme();
    }
}
