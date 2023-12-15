package geometria;

/*
 La clase Figura representa una figura geométrica
Toda figura geométrica, se caracteriza por un atributo "color"
y un método para calcular su superficie
 */

/*
 Crearemos dos subclases de Figura:
*Triangulo, con los atributos base y altura
*Circulo, con el atributo radio
 */

public abstract class Figura {
	private String color;
	public Figura(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double superficie();
}
