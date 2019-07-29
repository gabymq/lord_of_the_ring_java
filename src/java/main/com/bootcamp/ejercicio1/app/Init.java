package com.bootcamp.ejercicio1.app;

import com.bootcamp.ejercicio1.core.characters.*;
import com.bootcamp.ejercicio1.app.config.*;


public class Init{

		public static void main(String args[]){
		System.out.println("\nBienvenido a mi juego\n");

		Personaje personaje = new Personaje();
		personaje.imprimeDatos("Gabriela", 37,'F', 2, 5 , 2);

	}

}


