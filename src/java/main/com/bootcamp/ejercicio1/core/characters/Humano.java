package com.bootcamp.ejercicio1.core.characters;


public class Humano extends Personaje{
	public Humano(String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);
		this.ataque = 6;
		this.agilidad= 6;
		this.defensa = 6;
		this.magia = 6;
		this.pntosVida = 6;
	}
}


