package com.parcial.parcial;

import com.parcial.parcial.modelo.producto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.parcial.parcial.service.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ParcialApplicationTests {

	@Autowired
	servicio servicio;

	@Test
	void Agregar() {
		producto producto = new producto("xbox","isid", 14,"ee");
		servicio.agregar(producto);
		assertTrue(servicio.getLista().contains(producto));
	}


	@Test
	void actualizar() {
		producto producto = new producto("xbox","isid", 14,"ee");
		servicio.agregar(producto);
		producto nuevo = new producto("play","isid", 14,"ee");
		servicio.actualizar("14",nuevo);
		assertEquals(servicio.getLista().contains(producto),nuevo);
	}



}
