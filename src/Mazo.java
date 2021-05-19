import java.util.ArrayList;
import java.util.List;

public class Mazo {
	private int cantFichas;
	private ArrayList<Ficha> listaDeFichas = new ArrayList<Ficha>(48);

	Mazo() {
		for (int i = 0; i < 48; i++) {
			// Harcodear las 48 fichas desde le archivo
			listaDeFichas.add(new Ficha(i, new Casillero("Tierra", 0), new Casillero("Tierra", 1)));

		}
		cantFichas = 48;
	}

	public List<Ficha> devolverFichas() {
		List<Ficha> fichas = new ArrayList<Ficha>(4);
		for (int i = 0; i < 4; i++) {
			fichas.add(listaDeFichas.remove((int) Math.random() * cantFichas));
		}
		cantFichas -= 4;
		return fichas;
	}

	public int getCantFichas() {
		return cantFichas;
	}

}
