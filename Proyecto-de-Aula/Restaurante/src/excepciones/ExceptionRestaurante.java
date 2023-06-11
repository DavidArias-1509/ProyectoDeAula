/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.IOException;

/**
 *
 * @author karla
 */
public class ExceptionRestaurante {
    
    public String espaciosEnBlancos(String text) throws IOException{
        if (text.equals("")){
            throw new IOException("Espacio en blanco");
        }
        return text;
    }
}
