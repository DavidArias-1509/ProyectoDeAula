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
   private ArrayList<Plato> productos;
   private LocalDate fechaCompra;
   
    public Compra() throws IOException{
        this(LocalDate.now());
    }

    public Compra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
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

    public ArrayList<Plato> getIngredientes() {
        return this.productos;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void setIngredientes(ArrayList<Plato> productos) {
        this.productos = productos;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }


    public ArrayList<Plato> getProductos() {
        return productos;
    }
}
