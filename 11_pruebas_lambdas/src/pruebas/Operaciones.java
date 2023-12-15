package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Operaciones {

	public static void main(String[] args) {
		List<Integer> enteros=List.of(8,5,-2,4,1,7,12);
		//llamando al método print definido en esta clase,
		//mostrar los números pares de la lista de enteros
		/*Operaciones op=new Operaciones();
		op.print(enteros, n->n%2==0);*/
		print(enteros, n->n%2==0);
		//otro que imprima los negativos
		print(enteros, n->n<0);
		
		//llamar al método transform, coger la colección de enteros y obtener
		//una colección con las raíces cuadradas de cada entero
		Collection<Double> raices=transform(enteros, n->Math.sqrt(n));
		System.out.println(raices);
		/*for(Double d:raices) {
			System.out.println(d);
		}*/
		

	}
	
	//método que muestra todos los números de la colección recibida como parámetro
	//y que cumple la condición recibida como parámetro
	static void print(Collection<Integer> col, Predicate<Integer> pr) {
		for(Integer in:col) {
			if(pr.test(in)) {
				System.out.println(in);
			}
		}
	}
	
	//método que recibe una colección de enteros y devuelve una colección de double
	//resultante de transformar cada entero de la colección en un double
	//según la operación de transformación referida como parámetro
	static Collection<Double> transform(Collection<Integer> col, Function<Integer,Double> tx){
		ArrayList<Double> resultado=new ArrayList<>();
		for(Integer in:col) {
			resultado.add(tx.apply(in));//método apply de la interfaz Function
		}
		return resultado;
	}

}
