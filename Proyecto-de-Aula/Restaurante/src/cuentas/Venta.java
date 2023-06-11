package cuentas;

import java.time.LocalDate;
import modelos.Entrada;
import java.util.ArrayList;
import empleados.Empleado;
import preparaciones.Receta;

public class Venta {
    private String codigoVenta;
    private ArrayList<Receta> platos;
    private LocalDate fechaVenta;
    private Empleado empleado;
    private Cliente cliente;
    private double precioVenta;

    public Venta(Empleado empleado, Cliente cliente) {
        this.empleado = empleado;
        this.cliente = cliente;
    }
    
    public ArrayList<Receta> getPlatos() {
        return platos;
    }

    public Empleado getEmpleado() {
        return empleado;   
    }

    public void setPlatos(ArrayList<Receta> platos) {
        this.platos = platos;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public void agregarPlato(Receta r){
        double valor=0;
        this.platos.add(r);
        for(Receta R: this.platos){
           valor+= R.calcularPrecio();
        }
        this.precioVenta = valor;
    }
    
    public double calcularPrecio(){
        double total=0;
        for(Receta r : this.platos){
           total+=r.calcularPrecio();
        }
        return total;
    }
    
    public void realizarVenta(){
        this.calcularPrecio();
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void detalle(){
        System.out.println("-Empleado");
        System.out.println("Nombre: "+empleado.getNombre());
        System.out.println("Identificacion: "+empleado.getIdentificacion());
        System.out.println("-Cliente");
        System.out.println("Nombre: "+cliente.getNombre());
        System.out.println("Identificacion: "+cliente.getId());
        System.out.println("E-mail: "+cliente.getE_mail());
        System.out.println("-Platos");
        for(Receta r : this.platos){
            System.out.println(r);
        }
        System.out.println("\nTotal Venta: "+this.calcularPrecio());
    }
}
