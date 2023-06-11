package empleados;

public  class Administrador extends Empleado{
    private double salarioBase;
    private double auxilios;
    private double bonificacion;

    public Administrador(double salarioBase, double auxilios, double bonificacion, String nombre, long identificacion) {
        super(nombre, identificacion);
        this.salarioBase = salarioBase;
        this.auxilios = auxilios;
        this.bonificacion = bonificacion;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getAuxilios() {
        return auxilios;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setAuxilios(double auxilios) {
        this.auxilios = auxilios;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
    return this.salarioBase+this.auxilios+this.bonificacion;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nAdministrador \nSalario base: "+this.salarioBase+"\nAuxilios: "+this.auxilios+
                "\nBonificacion: "+this.bonificacion+"\nSalario Final: "+this.calcularSalario()+"\n*********************";
    }
}
