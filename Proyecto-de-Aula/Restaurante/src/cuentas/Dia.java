package cuentas;

import java.time.LocalDate;
import java.util.ArrayList;
import modelos.Entrada;
import empleados.Empleado;
import empleados.Normal;
import java.io.Serializable;

public class Dia implements Serializable{
    private ArrayList<Venta> ventas;
    private ArrayList<Compra> compras;
    private ArrayList<Empleado> asistencia;
    private LocalDate fecha;
    private double balanceVenta;
    private double balanceCompra;

    public Dia(LocalDate fecha) {
        this.ventas = new ArrayList();
        this.compras = new ArrayList();
        this.asistencia = new ArrayList();
        this.balanceCompra = 0;
        this.balanceVenta = 0;
        this.fecha = fecha;
    }

    public double getBalanceVenta() {
        return balanceVenta;
    }

    public double getBalanceCompra() {
        return balanceCompra;
    }
    

    public Dia(){
        this(LocalDate.now());
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public ArrayList<Empleado> getAsistencia() {
        return asistencia;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setAsistencia(Empleado e) {
        this.asistencia.add(e);
    }
    
    public void agregarCompra(Compra c){
        this.compras.add(c);
        System.out.println("Compra registrada");
    }
    
    public void agregarVenta(Venta v){
        this.ventas.add(v);
        System.out.println("Venta registrada");
    }       
}
    
