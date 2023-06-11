package cuentas;

import java.time.LocalDate;
import java.util.ArrayList;
import modelos.Entrada;
import static modelos.Entrada.leerFecha;
import empleados.Administrador;
import empleados.Empleado;
import java.io.IOException;
import java.io.Serializable;
import persistencias.*;

public class Compra implements Serializable{
   private String codigoCompra;
   private double valorTotal;
   private ArrayList<Producto> productos;
   private LocalDate fechaCompra;
   Logica mes = new ArchivoMes();
   Logica inv = new ArchivoInventario();
   
    public Compra() throws IOException{
        this(LocalDate.now());
    }
    
    public Compra(LocalDate fecha) throws IOException{
        this.fechaCompra = fecha;
        Dia d = (Dia) mes.buscarItem(fecha.toString());
        if(d == null){
            mes.agregarItem(new Dia(fecha));
        
            
        }
        this.productos = new ArrayList();
        //this.codigoCompra = ""+ this.fechaCompra.getYear() + this.fechaCompra.getMonthValue() + this.fechaCompra.getDayOfMonth() + "0" + String.valueOf(d.getCompras().size()+1) + "";
        this.valorTotal = 0;
    }

    public LocalDate getFechaCompra() {
        return this.fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public ArrayList<Producto> getIngredientes() {
        return this.productos;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void setIngredientes(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregaACarrito(Producto p){
        this.productos.add(p);
        this.valorTotal += (p.getPrecio()* p.getCnatidadDisponible());
    }
    public void agregaACarrito(String nombre, int cantidad, double precio, String descripcion){
        Producto p = new Producto(nombre,cantidad,precio,descripcion);
        this.productos.add(p);
        this.valorTotal += (p.getPrecio()* p.getCnatidadDisponible());
    }
    
    public void eliminarCarrito(Producto p){
        for (Producto p1: productos){
            if (p1.getNombre().equals(p.getNombre())){
                this.valorTotal -= (p1.getPrecio()*p1.getCnatidadDisponible());
                this.productos.remove(p1);
            }
        }
        
    }
    public void eliminarCarrito(String nombreProducto){
        for (Producto p1: productos){
            if (p1.getNombre().equals(nombreProducto)){
                this.valorTotal -= (p1.getPrecio()*p1.getCnatidadDisponible());
                this.productos.remove(p1);
                
            }
        }
    }
    
    public void realizarCompra() throws IOException{
        for(Producto p : this.productos){
            inv.agregarItem(p);
        }
        Dia d = (Dia) mes.buscarItem(this.fechaCompra.toString());
        d.agregarCompra(this);
        mes.agregarItem(d);
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public void detalle(){
        System.out.println("Compra");
        System.out.println("Porducto(s)");
        for(Producto p : this.productos){
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Descripcion: "+p.getDescripcion());
            System.out.println("Precio: "+p.getPrecio());
        }
        System.out.println("\nTotal Compra: "+this.valorTotal);
    }
}
