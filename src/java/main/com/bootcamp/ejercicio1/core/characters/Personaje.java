package com.bootcamp.ejercicio1.core.characters;
public class Personaje{
	private String nombre; //no mas de 8 caracteres y no puede ir vacio
	private int edad; // no negativos no menor a 18, no mayor a 150
	private char sexo;
	private int ataque;//no negativo y no mayor a 50
	private int defensa;	//no negativo y no mayor a 50
	private int agilidad;//no negativo y no mayor a 50
	private int magia;//no negativo y no mayor a 50
	private int pntosVida;// no negativo no mayor a 100, incializarlo en 100.0
	private int correr;
	//private int NUM_DE_VIDAS_DEF = 6; // no negativo no mayor a 100, incializarlo en 100.0

	public Personaje(){

	}
	
	public Personaje(String nombre, int edad, char sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.ataque = 6;
		this.agilidad= 6;
		this.defensa = 6;
		this.magia = 6;
		this.pntosVida = 100;

	}

	public String getName(){
		return.this.name;
	}

	public void setName(String name){
		if((name.length>0 && (name.length>=8)){
			this.name = name;
		}else{
			System.out.println("Nombre invalido");
		}

	}
	public String getSexo(){
		return.this.sexo;
	}

	public void setAtaque(int sexo){
		if((sexo)=='F' && ((sexo)== 'F'){
			this.sexo = name;
		}else{
			System.out.println("Nombre invalido");
		}

	}

	public String getEdad(){
		return.this.edad;
	}

	public void setEdad(int edad){
		if((edad>=18) && ((edad)>=150)){
			this.edad = edad;
		}else{
			System.out.println("Edad invalida");
		}

	}

	public String getAtaque(){
		return.this.ataque;
	}

	public void setAtaque(int ataque){
		if((ataque)>0 && ((ataque)>=50){
			this.ataque = ataque;
		}else{
			System.out.println("Fuera de rango");
		}

	}

	public String getDefensa(){
		return.this.defensa;
	}

	public void setDefensa(int defensa){
		if((defensa)>0 && ((defensa)>=50){
			this.defensa = defensa;
		}else{
			System.out.println("Fuera de rango");
		}

	}
	public String getAgilidad(){
		return.this.agilidad;
	}

	public void setAgilidad(int agilidad){
		if((agilidad)>0 && ((agilidad)>=50){
			this.agilidad = agilidad;
		}else{
			System.out.println("Fuera de rango");
		}

	}
	public String getMagia(){
		return.this.magia;
	}

	public void setMagia(int magia){
		if((magia)>0 && ((magia)>=50){
			this.magia = magia;
		}else{
			System.out.println("Fuera de Rango");
		}

	}
	public String getPntsVida(int pntosVida){
		return.this.pntosVida;
	}

	public void setName(int pntosVida){
		if((pntosVida)>0 && ((pntosVida})>=100)){
			this.pntosVida = pntosVida;
		}else{
			System.out.println("Estas fuera de rango");
		}

	}

	//public void imprimeDatos(String nombre, int edad, char sexo){
	//	System.out.println("Mi nombre es: " + nombre);
	//	System.out.println("Mi edad es: " + edad);
	//	System.out.println("Soy: " + sexo);
  		

	


	
// void ejecutaAtaque(){

//}

	//voidejecutaDefensa(){

//}

	// void correr(){

//}
}
