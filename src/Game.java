public class Game {
	
	private Jugador[] jugadores;
	private final static int CANT_RONDAS = 12;
	private PilaDeRobo pilaDeRoboActual;
	private PilaDeRobo pilaDeRoboSiguiente;
	private int cantidadDeJugadores;
	private Mazo mazo;
	
	public Game(Jugador[] jugadores, int cantidadDeJugadores, Mazo mazo) {
		this.jugadores = jugadores;
		this.cantidadDeJugadores = cantidadDeJugadores;
		this.mazo = mazo;
	}

	public void ejecutarJuego() {
		Jugador.mezclarJugadores(jugadores);
		mazo.mezclarMazo();
		for (int i=0; i<CANT_RONDAS; i++) {
			this.ejecutarRonda();
		}
		this.obtenerGanadores();
	}
	
	public void ejecutarPrimerRonda() {
		for (Jugador jugador : jugadores) {
			Ficha f= jugador.seleccionarFicha(pilaDeRoboActual);
			pilaDeRoboActual.asignarFicha(f, jugador);
		}
		
	}
	

	public void ejecutarRonda() {
		pilaDeRoboActual.obtenerFichas(mazo.devolverFichas());
		
	}
	
	public Jugador[] obtenerGanadores() {
		return jugadores;
	}
}
