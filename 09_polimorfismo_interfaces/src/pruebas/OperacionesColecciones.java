package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class OperacionesColecciones {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(6);v.add(7);v.add(5);
		System.out.println(sumatorio(v));
		
		HashSet<Integer> set=new HashSet<>();
		set.add(4);set.add(3);set.add(8);set.add(10);set.add(4);
		System.out.println(pares(set));//obtenemos un objeto con los métodos de la interfaz, en este caso, List
		System.out.println(pares(v));
	}
	
	//realizar un método que reciba una lista de Integer
	//y devuelva la suma de todos los números de la lista
	
	//listas son todas aquellas clases que implementan List
	//por eso puede recibir cualquier tipo de clase que implemente List
	//ejemplo de paso por parámetro de una interfaz
	static int sumatorio(List<Integer> list) {
		int suma=0;
		for(Integer n:list) {
			suma+=n;
		}
		return suma;
	}
	
	//realizar un método que reciba una colección de números enteros(Integer)
	//y devuelva una lista con los pares de esa colección
	
	static List<Integer> pares(Collection<Integer> list) {
		List<Integer> result=new ArrayList<>();
		for(Integer n:list) {
			if(n%2==0) {
				result.add(n);
			}
		}
		return result;
	}

}
