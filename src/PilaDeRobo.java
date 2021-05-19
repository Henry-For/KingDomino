import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PilaDeRobo {
	private List<Ficha> listaDeFichas = new ArrayList<Ficha>(4);
	private int size;

	public PilaDeRobo(List<Ficha> ficha) {
		for(int i=0;i<ficha.size();i++) {
			listaDeFichas.add(ficha.get(i));
		}
		Collections.sort(listaDeFichas);
		size = listaDeFichas.size();
	}

	public int getSize() {
		return size;
	}
	public void volverAGenerenarLista(List<Ficha> ficha) {
		listaDeFichas=ficha;
	}

	public Ficha getFicha(int indice) {
		size--;
		return listaDeFichas.remove(indice);
	}

	@Override
	public String toString() {
		return "PilaDeRobo [listaDeFichas=" + listaDeFichas + "]";
	}
	public void eliminarTodo(){
		listaDeFichas.removeAll(listaDeFichas);
	}
	

}
