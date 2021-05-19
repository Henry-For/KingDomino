
public class Ficha implements Comparable<Ficha> {
	private int numero;
	private Casillero[] subFicha = new Casillero[2];
	private Posicion posFicha = new Posicion();

	Ficha() {

	}

	Ficha(int numero, Casillero subFicha1, Casillero subFicha2) {
		this.numero = numero;
		this.subFicha[0] = subFicha1;
		this.subFicha[1] = subFicha2;
		this.posFicha = new Posicion(0,0);
	}

	@Override
	public String toString() {
		return "\nFicha: " + numero + ("\n---------------------------------")
				+ ("\n|" + subFicha[0].getCantDeCoronas() + "		|" + subFicha[1].getCantDeCoronas() + "		|")
				+ ("\n|" + subFicha[0].getTipoDeTerreno() + "		|" + subFicha[0].getTipoDeTerreno() + "		|")
				+ ("\n|" + subFicha[0].getPos() + "	|" + subFicha[1].getPos() + "	|")
				+ ("\n---------------------------------");
	}

	@Override
	public int compareTo(Ficha o) {
		return this.numero - o.numero;
	}

	public void setSubFicha(Casillero[] subFicha) {
		this.subFicha = subFicha;
	}
	public void setPosFicha(int x, int y) {
		posFicha.setX(x);
		posFicha.setY(y);
	}

	public int getNumero() {
		return numero;
	}
	

}
