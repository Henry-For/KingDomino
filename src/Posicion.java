import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Posicion implements Cloneable {
	protected int x; 
	protected int y;
	
	Posicion(int x, int y){
		this.x=x;
		this.y=y;
	}
	public Posicion() {
		// TODO Auto-generated constructor stub
	}
	public double distancia(Posicion obj)
	{
		return sqrt(pow(this.x - obj.x,2)+pow(this.y-obj.y,2));
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	@Override
	protected Posicion clone() throws CloneNotSupportedException {
		return new Posicion(this.x, this.y);
	}
	
}
