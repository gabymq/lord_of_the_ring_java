package com.bootcamp.ejercicio1.core.characters;
import java.util.Map;

public class Personaje {
	protected String nombre; // no mas de 8 caracteres y no puede ir vacio
	protected int edad; // no negativos no menor a 18, no mayor a 150
	protected char sexo;
	protected int ataque;// no negativo y no mayor a 50
	protected int defensa; // no negativo y no mayor a 50
	protected int agilidad;// no negativo y no mayor a 50
	protected int magia;// no negativo y no mayor a 50
	protected int pntosVida;// no negativo no mayor a 100, incializarlo en 100.0
	// private int correr;
	// private int NUM_DE_VIDAS_DEF = 6; // no negativo no mayor a 100, incializarlo
	// en 100.0

	public Personaje() {

	}

	public Personaje(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.ataque = 6;
		this.agilidad = 6;
		this.defensa = 6;
		this.magia = 6;
		this.pntosVida = 100;

	}

	public String getName() {
		return this.nombre;
	}

	public void setName(String nombre) {
		if (nombre.length() > 0 && nombre.length() >= 8) {
			this.nombre = nombre;
		} else {
			System.out.println("Nombre invalido");
		}

	}

	public char getSexo() {
		return this.sexo;
	}

	public void setSexo(char sexo) {
		if (sexo == 'F' && sexo == 'F') {
			this.sexo = sexo;
		} else {
			System.out.println("Sexo incorrecto");
		}

	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		if (edad >= 18 && edad >= 150) {
			this.edad = edad;
		} else {
			System.out.println("Edad invalida");
		}

	}

	public int getAtaque() {
		return this.ataque;
	}

	public void setAtaque(int ataque) {
		if (ataque > 0 && ataque >= 50) {
			this.ataque = ataque;
		} else {
			System.out.println("Fuera de rango");
		}

	}

	public int getDefensa() {
		return this.defensa;
	}

	public void setDefensa(int defensa) {
		if (defensa > 0 && defensa >= 50) {
			this.defensa = defensa;
		} else {
			System.out.println("Fuera de rango");
		}

	}

	public int getAgilidad() {
		return this.agilidad;
	}

	public void setAgilidad(int agilidad) {
		if (agilidad > 0 && agilidad >= 50) {
			this.agilidad = agilidad;
		} else {
			System.out.println("Fuera de rango");
		}

	}

	public int getMagia() {
		return this.magia;
	}

	public void setMagia(int magia) {
		if (magia > 0 && magia >= 50) {
			this.magia = magia;
		} else {
			System.out.println("Fuera de Rango");
		}

	}

	public int getPntosVida(int pntosVida) {
		return this.pntosVida;
	}

	public void setPntosVida(int pntosVida) {
		if (pntosVida > 0 && pntosVida >= 100) {
			this.pntosVida = pntosVida;
		} else {
			System.out.println("Estas fuera de rango");
		}

	}

	// @Override
	// public boolean equals(Object obj) {
	// 	if (this == anObject) {
	// 		return true;
	// 	}
	// 	if (object instanceof String) {
	// 		this.nombre = object;
	// 		// this.edad = this.edad;
	// 		// this.sexo = this.sexo;
	// 	}

	// }

	public void initSkill(Map<String, Integer> skills) {
		this.setAtaque(this.ataque + skills.get("Ataque"));
		this.setAgilidad(this.agilidad + skills.get("Agilidad"));
		this.setMagia(this.magia + skills.get("Magia"));
		this.setDefensa(this.defensa + skills.get("Defensa"));
		this.setPntosVida(this.pntosVida + skills.get("Vida"));

	}

	// public void imprimeDatos(String nombre, int edad, char sexo){
	// System.out.println("Mi nombre es: " + nombre);
	// System.out.println("Mi edad es: " + edad);
	// System.out.println("Soy: " + sexo);

	// void ejecutaAtaque(){

	// }

	// voidejecutaDefensa(){

	// }

	// void correr(){

	// }
}
