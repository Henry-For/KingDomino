import java.util.List;
import java.util.TreeMap;

public class PilaDeRobo {
	
	private TreeMap<Ficha, Jugador> fichasRonda;
	
	public PilaDeRobo() {
		fichasRonda = new TreeMap<Ficha, Jugador>();
	}
		
	public void almacenarFichas(List<Ficha> f) {
		for (Ficha ficha : f) {
			fichasRonda.put(ficha, null);
		}
	}
	
	public void asignarFicha(Ficha f, Jugador j) {
		this.fichasRonda.put(this.fichasRonda.ceilingKey(f), j);
	}
	
	public void mostrarFichas() {
		for (Ficha ficha : fichasRonda.keySet()) {
			System.out.println(ficha);
		}
	}

	public TreeMap<Ficha, Jugador> getFichasRonda() {
		return fichasRonda;
	}	
}
