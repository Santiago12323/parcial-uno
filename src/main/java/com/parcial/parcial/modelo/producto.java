package com.parcial.parcial.modelo;

public class producto {
    String nombre;
    String descripcion;
    int cantidad;

    String id;

    public producto(){

    }
    public producto(String nombre, String descripcion, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public void sumar(){
        cantidad += 1;
    }

    public String getId() {
        return id;
    }

}
