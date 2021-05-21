import java.util.ArrayList;

public class Game {
	
	private ArrayList<Jugador> jugadores;
	private final static int CANT_RONDAS = 12;
	private PilaDeRobo pilaDeRoboActual;
	private PilaDeRobo pilaDeRoboSiguiente;
	private int cantidadDeJugadores;
	private Mazo mazo;
	
	public Game(ArrayList<Jugador> jugadores, Mazo mazo) {
		this.jugadores = jugadores;
		this.cantidadDeJugadores = cantidadDeJugadores;
		this.mazo = mazo;
	}

	public void ejecutarJuego() {
		Jugador.mezclarJugadores(jugadores); // preguntar a quien le corresponderia la responsabilidad
		mazo.mezclarMazo();
		for (int i=0; i<CANT_RONDAS; i++) {
			this.ejecutarRonda();
		}
		this.obtenerGanadores();
	}
	
	public void ejecutarPrimerRonda() {
		for (Jugador jugador : jugadores) {
			Ficha fichaElegida= jugador.seleccionarFicha(pilaDeRoboActual);
			pilaDeRoboActual.asignarFicha(fichaElegida, jugador);
		}
	}
	
	public void ejecutarRonda() {
		pilaDeRoboActual.almacenarFichas(mazo.devolverFichas());
	}
	
	public void obtenerGanadores() {
		Jugador.ordenarJugadoresPuntaje(jugadores);
	}
}
