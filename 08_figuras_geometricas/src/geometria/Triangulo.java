package geometria;

/*
Crearemos dos subclases de Figura:
*Triangulo, con los atributos base y altura
*Circulo, con el atributo radio
*/

public class Triangulo extends Figura {
	private int base,altura;

	public Triangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double superficie() {
		return base*altura/2;
	}
}
