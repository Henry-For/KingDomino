import java.util.ArrayList;
import java.util.Map.Entry;

public class Game {
	
	private ArrayList<Jugador> jugadores;
	private final static int CANT_RONDAS = 12;
	private PilaDeRobo pilaDeRoboActual;
	private PilaDeRobo pilaDeRoboSiguiente;
	private Mazo mazo;
	
	public Game(ArrayList<Jugador> jugadores, Mazo mazo) {
		this.jugadores = jugadores;
		this.mazo = mazo;
		this.pilaDeRoboActual = new PilaDeRobo();
	}

	public void ejecutarJuego() {
		mazo.mezclarMazo();
		
		ejecutarPrimerRonda();
	
		for (int i=0; i<CANT_RONDAS; i++) {
			this.ejecutarRonda();
			this.pilaDeRoboActual= this.pilaDeRoboSiguiente;
		}
		this.obtenerGanadores();
	}
	
	// Se encarga de asignar los primeros turnos de manera aleatoria. 
	
	public void ejecutarPrimerRonda() {
		pilaDeRoboActual.almacenarFichas(mazo.devolverFichas());
		
		Jugador.mezclarJugadores(jugadores);
		
		for (Jugador jugador : jugadores) {
			Ficha fichaElegida= jugador.seleccionarFicha(pilaDeRoboActual);
			pilaDeRoboActual.asignarFicha(fichaElegida, jugador);
		}
	}
	
	public void ejecutarRonda() {

		this.pilaDeRoboSiguiente = new PilaDeRobo();
		pilaDeRoboSiguiente.almacenarFichas(mazo.devolverFichas());
		
		for (Entry<Ficha, Jugador> set : pilaDeRoboActual.getFichasRonda().entrySet()) {
			Jugador jugador = set.getValue();
			if(jugador != null) {
				jugador.elegirPosicionFicha(set.getKey());	
				Ficha fichaElegida= jugador.seleccionarFicha(pilaDeRoboSiguiente);
				pilaDeRoboSiguiente.asignarFicha(fichaElegida, jugador);
			}
		}
	}
	
	public void obtenerGanadores() {
		Jugador.ordenarJugadoresPuntaje(jugadores);
	}
}
