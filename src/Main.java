import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Archivo archivo = new Archivo("fichas.in.txt");
		Mazo mazo = archivo.generarMazo();
		
		//System.out.println(mazo);
		//System.out.println("Holo");
		//mazo.mezclarMazo();
		//System.out.println(mazo);
		
		Jugador j1 = new Jugador("ElSerrax");
//		System.out.println(j1.elegirPosicionFicha(mazo.devolverFichas().get(0)));
//		System.out.println(j1.elegirPosicionFicha(mazo.devolverFichas().get(0)));
		
		//System.out.println(mazo);
		Jugador j2 = new Jugador("Holasusana");
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(j1);
		jugadores.add(j2);
		Game juego = new Game(jugadores,mazo);
		
		juego.ejecutarJuego();
	}
}
