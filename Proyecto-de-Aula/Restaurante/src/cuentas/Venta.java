package cuentas;

import empleados.Cliente;
import empleados.Empleado;
import java.time.LocalDate;
import java.util.ArrayList;
import empleados.Persona;
import java.io.Serializable;
import java.util.Random;

public class Venta implements Serializable{
    private String codigoVenta;
    private ArrayList<Plato> platos;
    private LocalDate fechaVenta;
    private Persona empleado;
    private Persona cliente;
    private double precioVenta;

    public Venta() {
        this(LocalDate.now(),new Empleado("",0L),new Cliente("","",0));
    }
  
    
    public Venta(LocalDate fechaVenta, Persona empleado, Persona cliente) {
        this.platos = new ArrayList();
        this.fechaVenta = fechaVenta;
        this.empleado = empleado;
        this.cliente = cliente;
        this.codigoVenta = "0";
    }

    /**
     * @return the codigoVenta
     */
    public String getCodigoVenta() {
        return codigoVenta;
    }

    /**
     * @param codigoVenta the codigoVenta to set
     */
    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    /**
     * @return the platos
     */
    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void addPlato(Plato p){
        this.platos.add(p);
    }

    /**
     * @return the fechaVenta
     */
    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    /**
     * @param fechaVenta the fechaVenta to set
     */
    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * @return the empleado
     */
    public Persona getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Persona empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public void actualizarCodigo(){
        Random ran = new Random();
        int var = ran.nextInt(10);
        this.codigoVenta = this.fechaVenta.toString() + "-" + String.valueOf((int)((this.precioVenta*var)/60));
    }
    
    public double calcularValorVenta(){
        this.precioVenta=0;
        for (Plato p : this.platos){
            this.precioVenta += p.getPrecio();
        }
        this.actualizarCodigo();
        return this.precioVenta;
    }

    /**
     * @return the cliente
     */
    public Persona getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
}
