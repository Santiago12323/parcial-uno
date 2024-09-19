package com.parcial.parcial.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import com.parcial.parcial.modelo.producto;

@Service
public class servicio {

    private ArrayList<producto> lista = new ArrayList<producto>();

    public ArrayList<producto> getLista(){
        return lista;
    }

    public producto agregar(producto producto){
        if(lista.contains(producto)){
            producto.sumar();
        }
        else {
            lista.add(producto);
        }
        return producto;
    }
    public producto actualizar(String id, producto productoActualizado) {
        for (int i = 0; i < lista.size(); i++) {
            producto p = lista.get(i);
            if (p.getId().equals(id)) {
                lista.set(i, productoActualizado);
                return productoActualizado;
            }
        }
        return null;
    }


}

