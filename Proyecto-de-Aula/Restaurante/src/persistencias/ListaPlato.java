/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencias;


import cuentas.Plato;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author steban
 */
public class ListaPlato implements Logica , Serializable{
    
    private List<Plato> plato;

    public ListaPlato() {
        this.plato = new ArrayList();
    }

    @Override
    public Plato buscarItem(String code) {
        for(Plato p : this.plato){
            if(p.getCodigo().equals(code)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void borrarItem(String code) throws IOException {
        for(Plato p : this.plato){
            if(p.getCodigo().equals(code)){
                this.plato.remove(p);
            }
        }
    }

    @Override
    public void agregarItem(Object item) throws IOException {
        Plato p = (Plato) item;
        for(Plato p1 : this.plato){
            if(p1.getCodigo().equals(p.getCodigo())){
                throw new IOException("Item ya existe Existe");
            }
        }
        this.plato.add(p);
    }

    @Override
    public List<Plato> generarInforme() throws IOException {
        return this.plato;
    }
}
