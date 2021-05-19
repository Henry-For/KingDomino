
public class Casillero implements Cloneable{
	private String tipoDeTerreno;
	private int cantDeCoronas;
	private Posicion pos;
	
	Casillero(String tipoDeTerreno, int cantDeCoronas, Posicion pos){
		this.cantDeCoronas=cantDeCoronas;
		this.tipoDeTerreno= tipoDeTerreno;
		this.pos=pos;
	}
	Casillero(String tipoDeTerreno, int cantDeCoronas){
		this.cantDeCoronas=cantDeCoronas;
		this.tipoDeTerreno= tipoDeTerreno;
		pos= new Posicion(0,0);
	}

	public String getTipoDeTerreno() {
		return tipoDeTerreno;
	}

	public int getCantDeCoronas() {
		return cantDeCoronas;
	}

	public Posicion getPos() {
		return pos;
	}

	public void setTipoDeTerreno(String tipoDeTerreno) {
		this.tipoDeTerreno = tipoDeTerreno;
	}

	public void setCantDeCoronas(int cantDeCoronas) {
		this.cantDeCoronas = cantDeCoronas;
	}

	public void setPos(Posicion pos) {
		this.pos = pos;
	}

	@Override
	protected Casillero clone() throws CloneNotSupportedException {		
		return new Casillero(this.tipoDeTerreno,this.cantDeCoronas,this.getPos().clone());
	}



}

