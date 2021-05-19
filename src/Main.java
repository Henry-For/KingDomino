import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		jugar(2);
	}

	public static void jugar(int cantJugadores) {
		List<Player> jugadores = new ArrayList<Player>(cantJugadores);
		TreeMap<Integer, Integer> turnosAct = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> turnosSig = new TreeMap<Integer, Integer>();
		for (int i = 0; i < cantJugadores; i++) {
			jugadores.add(new Player());
			turnosAct.put(i + 1, i + 1);
		}
		Mazo m = new Mazo();
		// Harcodeada De Fichas//
		List<Ficha> fichas = new ArrayList<Ficha>();
		Ficha ficha1 = new Ficha(3, new Casillero("Trigo", 0, new Posicion(0, 0)),
				new Casillero("Trigo", 0, new Posicion(0, 1)));

		Ficha ficha2 = new Ficha(4, new Casillero("Trigo", 0, new Posicion(0, 0)),
				new Casillero("Trigo", 0, new Posicion(0, 1)));

		Ficha ficha3 = new Ficha(2, new Casillero("Bosque", 0, new Posicion(0, 0)),
				new Casillero("Bosque", 0, new Posicion(0, 1)));

		Ficha ficha4 = new Ficha(1, new Casillero("Bosque", 0, new Posicion(0, 0)),
				new Casillero("Bosque", 0, new Posicion(0, 1)));
		fichas.add(ficha1);
		fichas.add(ficha2);
		fichas.add(ficha3);
		fichas.add(ficha4);
		PilaDeRobo pilaDeRobo = new PilaDeRobo(fichas);
		///////////////
		int fichasDeMazo = 4; // Es para simular el do while
		Scanner entrada = new Scanner(System.in);
		do {

			//pilaDeRobo.volverAGenerenarLista(m.devolverFichas());
			for (Integer jugador : turnosAct.keySet()) {  //Ejecuta el turno 
				System.out.println("JUGADOR: "+ jugador);
				System.out.println(pilaDeRobo);
				int numDeFicha;
				do {
					System.out.println("Seleccione una ficha");
					numDeFicha = entrada.nextInt();

				} while (numDeFicha < 1 || numDeFicha > pilaDeRobo.getSize() + 1);
				jugadores.get(jugador - 1).setFicha(pilaDeRobo.getFicha(numDeFicha - 1));
				turnosSig.put(jugador, numDeFicha);
			}
			turnosAct = turnosSig;
			System.out.println(pilaDeRobo);
			if (pilaDeRobo.getSize() > 0) {
				pilaDeRobo.eliminarTodo();
				System.out.println("SE DESCARTARON LAS DEMAS FICHAS");
				fichasDeMazo-=4;
			}
			System.out.println(pilaDeRobo);

		} while (fichasDeMazo > 0);

	}
}
