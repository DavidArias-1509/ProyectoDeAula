package cuentas;

import java.time.LocalDate;
import modelos.Entrada;
import java.util.ArrayList;
import empleados.Persona;

public class Venta {
    private String codigoVenta;
    private ArrayList<Plato> platos;
    private LocalDate fechaVenta;
    private Persona empleado;
    private Persona cliente;
    private double precioVenta;

    public Venta(LocalDate fechaVenta, Persona empleado, Persona cliente) {
        this.fechaVenta = fechaVenta;
        this.empleado = empleado;
        this.cliente = cliente;
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

    /**
     * @param platos the platos to set
     */
    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
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
    
    public double calcularVelorVenta(){
        this.precioVenta=0;
        for (Plato p : this.platos){
            this.precioVenta += p.getPrecio();
        }
        return this.precioVenta;
    }
}
