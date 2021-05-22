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
                + ("\n|" + String.format("%-23s|",casilleros[0].getCantCoronas()) + String.format("%23s|",casilleros[1].getCantCoronas()))
                + ("\n|" + String.format("%-23s|",casilleros[0].getTipoTerreno()) + String.format("%23s|",casilleros[0].getTipoTerreno()))
                + ("\n|" + String.format("%-23s|",casilleros[0].getPosicion()) + String.format("%23s|",casilleros[1].getPosicion() ))
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
