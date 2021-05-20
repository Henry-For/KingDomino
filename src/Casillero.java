public class Casillero {
	
	private String tipoTerreno;
	private int cantCoronas;
	private Posicion posicion;
	
	public Casillero(){
		
	}
	public Casillero(String tipoTerreno, int cantCoronas, Posicion posicion) {
		this.tipoTerreno = tipoTerreno;
		this.cantCoronas = cantCoronas;
		this.posicion = posicion;
	}

	public boolean sonConsecutivos(Casillero c) {
		return true;
	}
	
	@Override
	public String toString() {
		return "TTer: " +tipoTerreno+" Ccor: " +cantCoronas +" Pos: " + posicion;
	}
}
