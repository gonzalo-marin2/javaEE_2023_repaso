package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import model.Curso;
import service.CursosService;

public class MenuCursos {
	/*
	Menú con las siguientes opciones:
	1.- Nuevo curso
	2.- Buscar cursos por precio máximo
	3.- Eliminar curso
	4.- Modificar duración curso
	5.- Salir
	*/

	//necesitamos una variable de CursosService
	static CursosService service=new CursosService();
	
	public static void main(String[] args) {
		int opcion;
		Scanner sc=new Scanner(System.in);
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				nuevoCurso();
				break;
			case 2:
				cursoPrecioMax();
				break;
			case 3:
				eliminarCurso();
				break;
			case 4:
				modificarDuracion();
				break;
			case 5:
				System.out.println("Adiós");
				
			}
		}while(opcion!=5);
			
	}
	
	static void mostrarMenu() {//tiene que ser static, pq el main es static y para poder llamar  otros métodos de su clase
		//necesita que sean static
		System.out.println("1.- Nuevo curso");
		System.out.println("2.- Buscar cursos por precio");
		System.out.println("3.- Eliminar curso");
		System.out.println("4.- Modificar duración curso");
		System.out.println("5.- Salir");
	}
	
	static void nuevoCurso() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el nombre del nuevo curso:");
		String nombre=sc.nextLine().toLowerCase();
		System.out.println("Introduce la duración del nuevo curso:");
		int duracion=sc.nextInt();
		System.out.println("Introduce el precio del nuevo curso:");
		double precio=sc.nextDouble();
		if(service.nuevo(nombre, duracion, precio)) {
			System.out.println("Curso añadido");
		}else {
			System.out.println("Curso existente, no se ha añadido");
		}
	}
	
	static void cursoPrecioMax() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el precio máximo del curso:");
		double precioMax=sc.nextDouble();
		//el método preciosCursoMax devuelve un arraylist, por eso lo metemos en un array
		ArrayList<Curso> cursos=service.preciosCursoMax(precioMax);
		for(Curso c:cursos) {
			System.out.println(c.getNombre()+"-"+c.getDuracion()+"-"+c.getPrecio());
		}
		
	}
	
	static void eliminarCurso() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el nombre del curso que quieres eliminar:");
		String nombre=sc.nextLine().toLowerCase();
		service.eliminarCurso(nombre);
	}
	
	static void modificarDuracion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el nombre del curso:");
		String nombre=sc.nextLine().toLowerCase();
		System.out.println("Introduce la nueva duración del curso:");
		int duracion=sc.nextInt();
		service.modificarDuracion(nombre, duracion);
	}

}
