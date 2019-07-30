public class IniciarJuego{

		public static Personaje crearPersonaje(String race, String skills){
			Presets presets = Presets.getInstance();
			Personaje personaje = null;
			switch(race){
				CASE ("Humano")
						personaje = new Humano();
						personaje.initSkill(presets.getPresets().get(skills));
						break;
				CASE ("Elfo")
						personaje = new Elfo();
						personaje.initSkill(presets.getPresets().get(skills));
						break;
				CASE ("Enano")
						personaje = new Enano();
						personaje.initSkill(presets.getPresets().get(skills));
						break;
			}

			return personaje;	


		}

}