package com.parcial.parcial.modelo;

public class producto {
    String nombre;
    String descripcion;
    int cantidad;

    String id;

    public producto(){

    }
    public producto(String nombre, String descripcion, int cantidad,String id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.id = id;
    }

    public void sumar(){
        cantidad += 1;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }
}
