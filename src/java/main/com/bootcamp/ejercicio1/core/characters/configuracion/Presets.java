package com.bootcamp.ejercicio1.characters.configuracion;


import java.util.*;

public class Presets{

	private static Presets presetsIns:

	private Presets (){
		init [];

	}

	private void init (){
		
		presets = new HashMap<>();
		Map<String, Integer> mago = new HashMap<>();
		mago.put("Ataque", -2);
		mago.put("Agilidad", -1);
		mago.put("Defensa", -1);
		mago.put("Magia", 5)
		mago.put("Vida", 2);
		this.presets.put("Mago", mago);

		Map<String, Integer> guerrero = new HashMap<>();
		guerrero.put("Ataque", 3);
		guerrero.put("Agilidad", 1);
		guerrero.put("Defensa", 2);
		guerrero.put("Magia", -2)
		guerrero.put("Vida", 1);
		this.presets.put("Guerrero", guerrero);

		Map<String, Integer> arquero = new HashMap<>();
		arquero.put("Ataque", 3);
		arquero.put("Agilidad", 3);
		arquero.put("Defensa", -1);
		arquero.put("Magia", 0)
		arquero.put("Vida", 0);
		this.presets.put("Arquero", arquero);
	}

	public static Presets getInstance(){
		if(presetsIns == null){
			presetsIns = new Presets();
			return presetsIns;
		}

		return presetsIns;
	}

}