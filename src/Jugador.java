import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jugador {
	
	private int id;
	private static int cantidadJugadores= 0;
	private String nickName;
	private int puntaje;
	private Tablero tablero;
	private Scanner tec;
	
	public Jugador(String nickName) {
		this.nickName = nickName;
		cantidadJugadores++;
		id = cantidadJugadores;
		//tablero = new Tablero();
		this.tec = new Scanner(System.in);
	}
	
	public Ficha seleccionarFicha(PilaDeRobo pr) {
		//pr.mostrarFichas();
		
		System.out.print(this.nickName + " seleccione ficha: ");
		//String input = tec.nextLine();
		//int number = Integer.parseInt( input );
		int opcion = tec.nextInt();
		System.out.println(opcion);
		
		List<Ficha> fichas = new ArrayList<Ficha>(pr.getFichasRonda().keySet());
		
		return fichas.get(opcion-1);
	}

	public boolean elegirPosicionFicha(Ficha f) {
		Posicion 	posCasillero1 = new Posicion(),
					posCasillero2 = new Posicion();
		do
		{
			System.out.println(this.nickName + " inserte la posicion de la ficha:");
			int x = tec.nextInt();
			int y = tec.nextInt();
			int x1 = tec.nextInt();
			int y1 = tec.nextInt();			
			posCasillero1.setX(x);
			posCasillero1.setY(y);
			posCasillero2.setX(x1);
			posCasillero2.setY(y1);
			
		}while(tablero.posicionarFicha(f, posCasillero1, posCasillero2) == false);
		
		return true; // Si devuelve falso la interfaz deberia marcar en rojo.
	}
	
	public void obtenerPuntaje() {
	}

	public static void mezclarJugadores(ArrayList<Jugador> jugadores) {
		Collections.shuffle(jugadores, new Random());
	}
	
	public static void ordenarJugadoresPuntaje(ArrayList<Jugador> jugadores) {
	}

	public String getNickName() {
		return this.nickName;
	}
}