import java.util.List;
import java.util.TreeMap;

public class PilaDeRobo {
	
	private TreeMap<Ficha, Jugador> fichasRonda;
	
	public void almacenarFichas(List<Ficha> f) {
		for (Ficha ficha : f) {
			fichasRonda.put(ficha,null);
		}
	}
	
	public void asignarFicha(Ficha f, Jugador j) {
	this.fichasRonda.put(this.fichasRonda.ceilingKey(f), j);
	}
	
	public void mostrarFichas() {
	
	}
		
}
