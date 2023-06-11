/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencias;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author karla
 */
public interface Logica{
    String DIREC ="src/archivo/";
    
    Object buscarItem(String id);
    void borrarItem(String id) throws IOException;

    /**
     *
     * @param item
     * @throws java.io.IOException
     */
    void agregarItem(Object item) throws IOException;
    
    List generarInforme() throws IOException;
}
