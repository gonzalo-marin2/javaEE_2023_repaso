package pruebas;

public class OperacionesNumeros {
	
	/*
	 Realizar un método que calcule el cuadrado de cualquier tipo de número, el resultado se devuelve como entero(int)
	 */

	public static void main(String[] args) {
		Double a=5.78;
		Integer b=345;
		Byte c=33;
		System.out.println(cuadrado(a));
		System.out.println(cuadrado(b));
		System.out.println(cuadrado(c));
		//System.out.println(cuadrado(new Number()));no se puede crear objetos Number, es una clase abstracta
		//Number n;
		//mostramos el valor entero del número generado aleatoriamente
		Number n=getRandomNumber();
		System.out.println(n.intValue());
	}
	
	private static int cuadrado(Number num) {
		//primero sacamos la parte entera del número y luego calculamos el cuadrado
		int n=num.intValue();
		return n*n;
	}
	
	//hacer un método que devuelva aleatoriamente un Double, un Integer o un Long
	private static Number getRandomNumber() {
		int numberType=(int)(Math.random()*3+1);
		switch(numberType) {
			case 1:
				return Double.valueOf(3.45);//devolvemos un Double
			case 2:
				return Integer.valueOf(200);//devolvemos un Integer
			default:
				return Long.valueOf(30);//devolvemos un Long
		}
	}
	
}
