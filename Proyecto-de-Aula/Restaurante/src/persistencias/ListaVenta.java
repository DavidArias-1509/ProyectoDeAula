/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencias;

import cuentas.Venta;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karla
 */
public class ListaVenta implements Logica, Serializable{
    
    private List<Venta> venta ;

    public ListaVenta() {
        this.venta = new ArrayList();
    }
    
    

    @Override
    public Venta buscarItem(String code) {
        for(Venta v : this.venta){
            if (v.getCodigoVenta().equals(code)) {
                return v;
            }
        }
        return null;
    }

    @Override
    public void borrarItem(String code) throws IOException {
        for(Venta v : this.venta){
            if (v.getCodigoVenta().equals(code)) {
                this.venta.remove(v);
            }
        }
    }

    @Override
    public void agregarItem(Object item) throws IOException {
        Venta v = (Venta) item;
        for(Venta v1 : this.venta){
            if(v1.getCodigoVenta().equals(v.getCodigoVenta())){
                throw new IOException("Item ya existe Existe");
            }
        }
        this.venta.add(v);
    }

    @Override
    public List<Venta> generarInforme() throws IOException {
        return this.venta;
    }
    
}
