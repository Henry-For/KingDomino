
public class Main {

	public static void main(String[] args) {
		Archivo archivo = new Archivo("fichas.in.txt");
		Mazo mazo = archivo.generarMazo();
		System.out.println(mazo);
		System.out.println("Holo");
		mazo.mezclarMazo();
		System.out.println(mazo);
		
		Jugador j1 = new Jugador("ElSerrax");
		System.out.println(j1.elegirPosicionFicha(mazo.devolverFichas().get(0)));
		System.out.println(j1.elegirPosicionFicha(mazo.devolverFichas().get(0)));
		
//		Game game1 = new Game(mazo);
//		
//		Mazo mazo2 = mazo.clone();
//		Game game2 = new Game(mazo2);
//		
//		
	}

}
