public class Casillero {
	
	public static final String TERRENO_REY = "rey";
	
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
	
	public boolean sonTerrenosConsecutivos(Casillero c) {
		return tipoTerreno.equals(c.tipoTerreno) || c.tipoTerreno.equals(TERRENO_REY);
	}
	
	@Override
	public String toString() {
		return "TTer: " +tipoTerreno+" Ccor: " +cantCoronas +" Pos: " + posicion;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public int getCantCoronas() {
		return this.cantCoronas;
	}
	
	public String getTipoTerreno()
	{
		return this.tipoTerreno;
	}
	
}
