
public class Player {
	private Ficha ficha = new Ficha();
	private Tablero tablero= new Tablero();

	public Player() {

	}
	public void setFicha(Ficha f) {
		ficha= f;
	}
	public void ponerEnTablero(int x, int y) {
		if(this.tablero.puedoUbicar(x,y)) {
			tablero.lista.add(ficha);
		}
		ficha.setPosFicha(x, y);
		//////
		System.out.println("Ficha que ubico en la posicion: ( " + x + " ; " + y + " ) del tablero ");
		System.out.println(ficha);
		/////
	}

	

}
