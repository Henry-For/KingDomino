public class Ficha {
	
	private int valorFicha;
	private Casillero[] casilleros = new Casillero[2];
	
	public Ficha(int valorFicha, Casillero[] casilleros) {
		this.valorFicha = valorFicha;
		this.casilleros = casilleros;
	}

	public Ficha() {
		// TODO Auto-generated constructor stub
	}

	public boolean sonConsecutivas(Ficha f) {
		return true;
	}
	
	@Override
	public String toString() {
		return "\nVF : "+ valorFicha+ "\t C1 : "+ casilleros[0] +" C2 : "+casilleros[1];
	}
}
