import java.util.ArrayList;
import java.util.List;

public class Mazo {
	
	private static final int CARTAS_A_ENTREGAR = 4;
	private ArrayList<Ficha> fichas = new ArrayList<Ficha>(48);
	private int indice= 0;

	public Mazo() {
		
	}
	
	public void agregarFicha(Ficha f){
		this.fichas.add(f);
	}

	private static void mezclarMazo() {	
	}
	// cambiar retorno
	public List<Ficha> devolverFichas() {
		return fichas.subList(indice, indice += CARTAS_A_ENTREGAR);
	}
	
	@Override
	public String toString() {
		return "Mazo : "+ fichas;
	}
}

// No pude pensar el mazo como algo estatico, instanciaria uno en Game y fue.