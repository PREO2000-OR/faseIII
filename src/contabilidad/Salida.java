/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabilidad;

/**
 *
 * @author Sahsil
 */
public class Salida {
    public String name, cantidad;//Atributos de la clase Salida
    
    public Salida(String name,String cantidad) {//Constructor de la clase Salida
        this.name=name;
        this.cantidad=cantidad;
    }
//Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
}
