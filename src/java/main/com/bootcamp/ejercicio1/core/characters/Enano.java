package com.bootcamp.ejercicio1.chararters;


public class Enano extends Personaje{
	public Enano(String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);
		this.ataque = 8;
		this.agilidad= 4;
		this.defensa = 6;
		this.magia = 4;
		this.pntosVida = 6;
	}
	// public void brinca() {
	// 	System.out.println("Estoy brincando");
	// }
}

