package com.parcial.parcial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.parcial.parcial.service.*;
import java.util.ArrayList;
import com.parcial.parcial.modelo.producto;

@Service
public class servicio {
    @Autowired
    agente agente;

    private ArrayList<producto> lista = new ArrayList<producto>();

    public ArrayList<producto> getLista(){
        return lista;
    }

    public producto agregar(producto producto){
        for (int i = 0; i < lista.size() ; i++) {
            if (lista.get(i).getId().equals(producto.getId())){
                if ( lista.get(i).getNombre().equals(producto.getNombre()) && lista.get(i).getDescripcion().equals(producto.getDescripcion()) ){
                    producto.sumar();
                    return producto;
                }

                else{
                    return null;
                }

            }
        }

        lista.add(producto);
        return producto;
    }
    public producto actualizar(String id, producto productoActualizado) {
        agente.stockActualizado(productoActualizado);
        for (int i = 0; i < lista.size(); i++) {
            producto p = lista.get(i);
            if (p.getId().equals(id)) {
                lista.set(i, productoActualizado);
                return productoActualizado;
            }
            if (productoActualizado.getCantidad() < 5 ){
                agente.stockADVERTENCIA(productoActualizado);
            }
        }
        return null;
    }


}

