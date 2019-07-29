package com.bootcamp.ejercicio1.core.characters


public class Humano extends Personaje{
	public Humano(String nombre, int edad, int ataque, int agilidad, int defensa, Int magia, Int vida) {
		super(nombre, edad, ataque, agilidad, defensa, magia, vida);
	}

	public void esquivarAtaque() {
		System.out.println("Me escapo esquivando ataque");

	}
}


