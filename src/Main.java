import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Archivo archivo = new Archivo("fichas.in.txt");
		Mazo mazo = archivo.generarMazo();
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

		jugadores.add(new Jugador("xxElSerraxx"));
		jugadores.add(new Jugador("xxHolasusanaxx"));
		Game juego = new Game(jugadores,mazo);
		
		juego.ejecutarJuego();
	}
}
