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
			System.out.println("Ronda " + (i+1) + "\nLos jugadores posicionan fichas");
			this.ejecutarRonda();
			System.out.println("---------------------------------------------\n");
			this.pilaDeRoboActual= this.pilaDeRoboSiguiente;
		}
		this.obtenerGanadores();
		Jugador.mostrarJugadores(jugadores);
	}
	
	// Se encarga de asignar los primeros turnos de manera aleatoria. 
	
	public void ejecutarPrimerRonda() {
		pilaDeRoboActual.almacenarFichas(mazo.devolverFichas());
		
		Jugador.mezclarJugadores(jugadores);
		
		for (Jugador jugador : jugadores) {
			Ficha fichaElegida;
			do
			{
				fichaElegida= jugador.seleccionarFicha(pilaDeRoboActual);			
			}while(pilaDeRoboActual.asignarFicha(fichaElegida, jugador) == false);
		}
	}
	
	public void ejecutarRonda() {

		this.pilaDeRoboSiguiente = new PilaDeRobo();
		pilaDeRoboSiguiente.almacenarFichas(mazo.devolverFichas());
		
		this.pilaDeRoboActual.mostrarOrdenJugadores();
		
		for (Entry<Ficha, Jugador> set : pilaDeRoboActual.getFichasRonda().entrySet()) {
			Jugador jugador = set.getValue();
			if(jugador != null) {
				System.out.println("\n===================================================");
				if(jugador.elegirPosicionFicha(set.getKey()))
				{
					System.out.println(jugador.getNickName() + "ficha insertada");
				}
				else
				{
					System.out.println(jugador.getNickName() + " ficha no insertada");
				}
				Ficha fichaElegida;
				do
				{
					fichaElegida = jugador.seleccionarFicha(pilaDeRoboSiguiente);					
				}while(pilaDeRoboSiguiente.asignarFicha(fichaElegida, jugador) == false);
				
				//System.out.println(fichaElegida);
			}
		}
	}
	
	public void obtenerGanadores() {
		Jugador.ordenarJugadoresPuntaje(jugadores);
	}
}
