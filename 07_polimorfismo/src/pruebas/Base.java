package pruebas;

public class Base {
	public void print() {
		System.out.println("Indeterminado");
	}
}

class Primera extends Base{
	private int k;
	public Primera(int k) {
		this.k = k;
	}
	@Override
	public void print() {
		System.out.println("Clase primera con atributo: "+k);
	}
}

class Segunda extends Base{
	private int a;
	private String n;
	public Segunda(int a, String n) {
		this.a = a;
		this.n = n;
	}
	@Override
	public void print() {
		System.out.println("Clase segunda con atributos: "+a+" y "+n);
		
	}
	
	
}