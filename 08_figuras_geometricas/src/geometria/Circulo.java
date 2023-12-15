package geometria;

/*
Crearemos dos subclases de Figura:
*Triangulo, con los atributos base y altura
*Circulo, con el atributo radio
*/

public class Circulo extends Figura {
	private int radio;
	
	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public double superficie() {
		//return Math.PI*radio*radio;
		return Math.PI*Math.pow(radio, 2);
	}
}
