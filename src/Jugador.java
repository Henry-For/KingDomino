import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Jugador {
	
	private int id;
	private static int cantidadJugadores= 0;
	private String nickName;
	private int puntaje;
	private Tablero tablero;
	
	public Jugador(String nickName) {
		this.nickName = nickName;
		cantidadJugadores++;
		id = cantidadJugadores;
		tablero = new Tablero();
	}
	
	public Ficha seleccionarFicha(PilaDeRobo pr) {
		pr.mostrarFichas();
		// leer valor de consola y esa es la ficha. 
		return null; 
	}

	public boolean elegirPosicionFicha(Ficha f) {
		//Este metodo le pide a la interfaz que devuelva la posicion.
		//Hardcodeamos posicion para testear.
		Posicion posCasillero1 = new Posicion(0,0);
		Posicion posCasillero2 = new Posicion(0,0);
		return tablero.posicionarFicha(f, posCasillero1, posCasillero2); // Si devuelve falso la interfaz deberia marcar en rojo.
	}
	
	public void obtenerPuntaje() {
	}

	public static void mezclarJugadores(ArrayList<Jugador> jugadores) {
		Collections.shuffle(jugadores, new Random());
	}
	
	public static void ordenarJugadoresPuntaje(ArrayList<Jugador> jugadores) {
	}
}