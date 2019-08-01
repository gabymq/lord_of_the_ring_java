package com.bootcamp.ejercicio1.app.lib;

import com.bootcamp.ejercicio1.core.characters.*;
import com.bootcamp.ejercicio1.core.characters.configuracion.Presets;
import java.util.Map;

public class IniciarJuego{

		public static Personaje crearPersonaje(String race, String argSkill){
			Presets presets = Presets.getInstance();
			Personaje personaje = null;
			Map<String, Integer> skills = presets.getPresets().get(argSkill);
			
			switch(race){
				case ("Humano"):
						personaje = new Humano();
						personaje.initSkill(skills);
						break;
				case ("Elfo"):
						personaje = new Elfo();
						personaje.initSkill(skills);
						break;
				case ("Enano"):
						personaje = new Enano();
						personaje.initSkill(skills);
						break;
			}

			return personaje;	
		}
}