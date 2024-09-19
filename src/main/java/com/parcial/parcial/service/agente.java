package com.parcial.parcial.service;
import com.parcial.parcial.modelo.producto;
import org.springframework.stereotype.Service;

@Service
public class agente {
    public agente(){

    };

    public void stockActualizado(producto producto){
        System.out.println("el" + producto + "->" + producto.getCantidad());
    }

    public void stockADVERTENCIA(producto producto){
        System.out.println("ALERTA!!! El stock del Producto:" + producto + "es muy bajo, solo quedan" + producto.getCantidad() + "unidades.");
    }
}
