import static org.junit.Assert.*;

import org.junit.Test;

public class ContarPuntosTest {

	@Test
	public void casoNormal() {
		Casillero[][] tablero = {
				{
				new Casillero("agua",0,new Posicion(0,0)),
				new Casillero("arena",0,new Posicion(0,1)),
				new Casillero("agua",0,new Posicion(0,2)),
				new Casillero("arena",0,new Posicion(0,3)),
				new Casillero("arena",0,new Posicion(0,4))
				},
				
				{
				new Casillero("agua",0,new Posicion(1,0)),
				new Casillero("agua",1,new Posicion(1,1)),
				new Casillero("agua",0,new Posicion(1,2)),
				new Casillero("agua",1,new Posicion(1,3)),
				new Casillero("agua",0,new Posicion(1,4)),
				},
				
				{
				new Casillero("bosque",0,new Posicion(2,0)),
				new Casillero("arena",0,new Posicion(2,1)),
				new Casillero("pasto",1,new Posicion(2,2)),
				new Casillero("pasto",0,new Posicion(2,3)),
				new Casillero("pasto",2,new Posicion(2,4))
				},
				{
				new Casillero("bosque",1,new Posicion(3,0)),
				new Casillero("arena",0,new Posicion(3,1)),
				new Casillero("rey",0,new Posicion(3,2)),
				new Casillero("arena",1,new Posicion(3,3)),
				new Casillero("arena",0,new Posicion(3,4))
				},
				{
				new Casillero("arena",0,new Posicion(4,1)),
				new Casillero("arena",0,new Posicion(4,2)),
				new Casillero("arena",0,new Posicion(4,3)),
				new Casillero("arena",1,new Posicion(4,4)),
				new Casillero("arena",0,new Posicion(4,5))
				}
		};
	}

}
