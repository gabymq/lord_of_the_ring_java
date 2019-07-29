package com.bootcamp.ejercicio1.core.characters;


public class Elfo extends Personaje{
	public Elfo() {
		super(nombre, edad, ataque, agilidad, defensa, magia, vida);
	}

	public void sanacion() {
		System.out.println("Regenero vidas");

	}

}

