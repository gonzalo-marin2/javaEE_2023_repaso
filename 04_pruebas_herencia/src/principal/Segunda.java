package principal;

public class Segunda extends Primera {
	public Segunda() {
		//de manera implícita se llama al constructor sin parámetros de la superclase
		//super(); llamada implícita
		//si hay un constructor con parámetros, hay que especificarlo
		super(3);
		System.out.println("Constructor de Segunda");
	}

	//Sobreescribimos el método heredado de Primera
	@Override
	public void print() {
		System.out.println("Imprimiendo en Segunda");
	}
	
	

}
