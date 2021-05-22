public class Tablero {

	private Casillero[][] tablero = new Casillero[5][5];
 int [][] m = new int [5][5];
	private int[][] trigo = new int[5][5];
	private int[][] agua = new int[5][5];
	private int[][] mina = new int[5][5];
	private int[][] pasto = new int[5][5];
	private static int cantCoronas=0; // aux;

	public int calcularPuntaje() {
		return 1;
	}

	public boolean posicionarFicha(Ficha f, Posicion posCasillero1, Posicion posCasillero2) {
		if (tablero[posCasillero1.getX()][posCasillero1.getY()] == null
				&& tablero[posCasillero2.getX()][posCasillero2.getY()] == null) {
			f.getCasilleros()[0].setPosicion(posCasillero1);
			f.getCasilleros()[1].setPosicion(posCasillero2);
			tablero[posCasillero1.getX()][posCasillero1.getY()] = f.getCasilleros()[0];
			tablero[posCasillero2.getX()][posCasillero2.getY()] = f.getCasilleros()[1];
			return true;
		}
		return false;
	}
	public void generarMatrizTrigo() {
		for(int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				tablero[i][j]= new Casillero("agua",0,new Posicion(0,1));
			}
		}
		tablero[0][1]= new Casillero("trigo",0,new Posicion(0,1));
		tablero[0][3]= new Casillero("trigo",0,new Posicion(0,3));
		tablero[0][4]= new Casillero("trigo",0,new Posicion(0,1));
		tablero[2][1]= new Casillero("trigo",0,new Posicion(0,1));
		tablero[3][1]= new Casillero("trigo",0,new Posicion(0,1));
		tablero[4][0]= new Casillero("trigo",0,new Posicion(0,1));
		tablero[4][1]= new Casillero("trigo",0,new Posicion(0,1));
		tablero[4][2]= new Casillero("trigo",0,new Posicion(0,1));
		tablero[3][3]= new Casillero("trigo",1,new Posicion(0,1));
		tablero[3][4]= new Casillero("trigo",0,new Posicion(0,1));
		tablero[4][3]= new Casillero("trigo",1,new Posicion(0,1));
		tablero[4][4]= new Casillero("trigo",0,new Posicion(0,1));
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				if(tablero[i][j].getTipoTerreno()=="trigo") {
					trigo[i][j]=1;
				}
			}
		}

		
	}
	public int contarPuntosTrigo1() {
		int puntos=0;
		generarMatrizTrigo();
		for(int i=0;i<5;i++) {
			for(int j=0; j<5; j++) {
				cantCoronas=0;
				if(trigo[i][j]==1) {
//					int fichas=contarPuntosTrigo(i,j);
//					System.out.print(cantCoronas + " ");
//					System.out.println(fichas);
					puntos+= contarPuntosTrigo(i,j) * cantCoronas;
				}
			}
		}
		return puntos;
	}
	public int contarPuntosTrigo(int i, int j) {
			if(i>=5 || i<0 || j>=5 || j<0 || trigo[i][j]!=1) {
				return 0;
			}
			trigo[i][j]=0;
			cantCoronas+=tablero[i][j].getCantCoronas();
			return  (1 + contarPuntosTrigo(i,j+1) + 
					contarPuntosTrigo(i,j-1)+
					contarPuntosTrigo(i-1,j)+
					contarPuntosTrigo(i+1,j));
	}
	public static void main(String[] args) {
		Tablero t = new Tablero();
		t.generarMatrizTrigo();
//		System.out.println(t.tablero[2][3].getTipoTerreno());
//		System.out.println(t.tablero[0][1].getTipoTerreno());
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(t.trigo[i][j]+ "|");
//			}
//			System.out.println();
//		}
		System.out.println(t.contarPuntosTrigo1());
	}
}
