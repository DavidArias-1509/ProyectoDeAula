package empleados;

public abstract class Persona {
        private String nombre;
        private long identificacion;

    public Persona(String nombre, long identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }
      
  public abstract double calcularSalario();
  
        @Override
  public String toString(){
      return "Nombre: "+this.nombre+"\nId: "+this.identificacion;
  }
}
