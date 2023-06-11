package empleados;

public class Empleado extends Persona{
    private double pagoPorDia;
    private double bonificacion;
    private int diasTrabajados;

//    public Empleado(double pagoPorDia, double bonificacion, int diasTrabajados, String nombre, long identificacion) {
//        super(nombre, identificacion);
//        this.pagoPorDia = pagoPorDia;
//        this.bonificacion = bonificacion;
//        this.diasTrabajados = diasTrabajados =0;
//    }

    public Empleado(double pagoPorDia, double bonificacion, String nombre, long identificacion) {
        super(nombre, identificacion);
        this.pagoPorDia = pagoPorDia;
        this.bonificacion = bonificacion;
        this.diasTrabajados = 0;
    }
    
    public double getPagoPorDia() {
        return pagoPorDia;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setPagoPorDia(double pagoPorDia) {
        this.pagoPorDia = pagoPorDia;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
}
