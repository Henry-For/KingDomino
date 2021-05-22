public class Ficha implements Comparable<Ficha>{
	
	private int valorFicha;
	private Casillero[] casilleros = new Casillero[2];
	

	public void setCasilleros(Casillero[] casilleros) {
		this.casilleros = casilleros;
	}

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
        return "\nFicha: " + valorFicha + ("\n------------------------------------------------- ")
                + ("\n|" + casilleros[0].getCantCoronas() + "\t\t\t|" + casilleros[1].getCantCoronas() + "\t\t\t|")
                + ("\n|" + casilleros[0].getTipoTerreno() + "\t\t\t|" + casilleros[0].getTipoTerreno() + "\t\t\t|")
                + ("\n|" + casilleros[0].getPosicion() + "\t\t\t|" + casilleros[1].getPosicion() + "\t\t\t|")
                + ("\n-------------------------------------------------");
    }
	
	public Casillero[] getCasilleros() {
		return casilleros;
	}

	@Override
	public int compareTo(Ficha o) {
		return this.valorFicha - o.valorFicha;
	}
}
