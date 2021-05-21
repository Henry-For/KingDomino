import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Jugador {
	
	private static int id= 0;
	private String nickName;
	private int puntaje;
	private Tablero tablero;
	
	public Ficha seleccionarFicha(PilaDeRobo pr) {
		pr.mostrarFichas();
		// leer valor de consola y esa es la ficha. 
		return null; 
	}
	
	public void elegirPosicionFicha(Ficha f) {
		
	}
	
	public void obtenerPuntaje() {
	}

	public static void mezclarJugadores(ArrayList<Jugador> jugadores) {
		Collections.shuffle(jugadores, new Random());
	}
	
	public static void ordenarJugadoresPuntaje(ArrayList<Jugador> jugadores) {
		
	}
}