public class Game {
	
	private Jugador[] jugadores;
	private int nroRonda = 0;
	private final static int CANT_RONDAS = 12;
	private PilaDeRobo pilaDeRoboActual;
	private PilaDeRobo pilaDeRoboSiguiente;
	private int cantidadDeJugadores;
	private Mazo mazo;
	
	public Game(Jugador[] jugadores, int cantidadDeJugadores, Mazo mazo) {
		this.jugadores = jugadores;
		this.cantidadDeJugadores = cantidadDeJugadores;
		mazo.mezclarMazo();
		this.mazo = mazo;
	}

	public void ejecutarJuego() {
		
	}

	public void ejecutarRonda() {
		
	}
	
	public Jugador[] obtenerGanadores() {
		return jugadores;
	}
}
