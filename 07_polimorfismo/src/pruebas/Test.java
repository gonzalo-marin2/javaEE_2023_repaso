package pruebas;

public class Test {

	public static void main(String[] args) {
		// crear un objeto Primera y un objeto Segunda y llamar a print()
		/*Primera pr=new Primera(5);
		pr.print();
		Segunda sg=new Segunda(4,"Marca");
		sg.print();*/
		//podemos llamar a print creando una variable de tipo Base:
		//en una variable del objeto padre Base, metemos un objeto Primera y otro Segunda
		llamadas(new Primera(5));
		llamadas(new Segunda(4,"Marca"));
	}
	//creamos un método con la súperclase como parámetro y hacemos la llamada al método
	static void llamadas(Base b) {
		b.print();
	}

}
