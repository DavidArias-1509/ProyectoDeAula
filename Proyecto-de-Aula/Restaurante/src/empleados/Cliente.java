/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.io.Serializable;

/**
 *
 * @author karla
 */
public class Cliente extends Persona implements Serializable {
    
    private String email;
    
    public Cliente(String email, String nombre, long identificacion) {
        super(nombre, identificacion);
        this.email = email;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }    
}
