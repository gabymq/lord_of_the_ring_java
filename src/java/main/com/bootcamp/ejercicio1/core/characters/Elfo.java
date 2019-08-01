package com.bootcamp.ejercicio1.core.characters;


public class Elfo extends Personaje{
		public Elfo(String nombre, int edad, char sexo) {
			super(nombre, edad, sexo);
		this.ataque = 4;
		this.agilidad= 8;
		this.defensa = 4;
		this.magia = 8;
		this.pntosVida = 6;
	}

	//public void sanacion() {
		//System.out.println("Regenero vidas");

	//}

}

