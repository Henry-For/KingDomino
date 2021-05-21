import java.util.ArrayList;
import java.util.Map.Entry;

public class Game {
	
	private ArrayList<Jugador> jugadores;
	private final static int CANT_RONDAS = 12;
	private PilaDeRobo pilaDeRoboActual;
	private PilaDeRobo pilaDeRoboSiguiente;
	private int cantJugadores;
	private Mazo mazo;
	
	public Game(ArrayList<Jugador> jugadores, Mazo mazo) {
		this.jugadores = jugadores;
		this.cantJugadores= jugadores.size();
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
		pilaDeRoboActual.almacenarFichas(mazo.devolverFichas());
		
		for (Jugador jugador : jugadores) {
			Ficha fichaElegida= jugador.seleccionarFicha(pilaDeRoboActual);
			pilaDeRoboActual.asignarFicha(fichaElegida, jugador);
		}
		
		pilaDeRoboSiguiente.almacenarFichas(mazo.devolverFichas());
		
		for (Entry<Ficha, Jugador> set : pilaDeRoboActual.getFichasRonda().entrySet()) {
			Jugador jugador = set.getValue();
			if(jugador != null) {
				jugador.elegirPosicionFicha(set.getKey());
				
			}
			
		}
	}
	
	public void ejecutarRonda() {
		
	}
	
	public void obtenerGanadores() {
		Jugador.ordenarJugadoresPuntaje(jugadores);
	}
}
