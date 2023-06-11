package cuentas;

import java.time.LocalDate;
import modelos.Entrada;
import java.util.ArrayList;
import empleados.Empleado;

public class Venta {
    private String codigoVenta;
    private ArrayList<Plato> platos;
    private LocalDate fechaVenta;
    private Empleado empleado;
    private double precioVenta;

    public Venta() {
        
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
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
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
    
    
}
