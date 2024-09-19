package com.parcial.parcial.controller;
import com.parcial.parcial.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.parcial.parcial.modelo.producto;
import java.util.ArrayList;

@RestController
@RequestMapping("parcial")
public class controlador {
    @Autowired
    private servicio servicio;
    @GetMapping( value = "/mostrar")
    public ArrayList<producto> mostrarTodos(){
        return servicio.getLista();
    };

    @PostMapping
    public producto agregarUno(@RequestBody producto producto){
        return servicio.agregar(producto);
    };

    @PutMapping("/actualizar/{id}")
    public producto actualizarUno(@PathVariable String id, @RequestBody producto productoActualizado) {
        return servicio.actualizar(id, productoActualizado);
    }

}
