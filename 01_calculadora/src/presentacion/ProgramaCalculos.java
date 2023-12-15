package presentacion;

import java.util.Scanner;

import service.Calculadora;

public class ProgramaCalculos {

	public static void main(String[] args) {
		Calculadora cal;
		int n1,n2,opcion;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce número 1: ");
		n1=sc.nextInt();
		System.out.println("Introduce número 2: ");
		n2=sc.nextInt();
		//creamos objeto calculadora y le pasamos los números al constructor 
		cal=new Calculadora(n1,n2);
		
		//mediante un bucle while, vamos mostrando el menú
		//hasta que seleccione la opción de salir
		do {
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Factorial");
			System.out.println("6.- Salir");
			opcion=sc.nextInt();
			
			//comprobamos la opción elegida y realizamos la operación correspondiente
			switch(opcion) {
				case 1:
					System.out.println(cal.sumar()); 
					break;
				case 2:
					System.out.println(cal.restar()); 
					break;
				case 3:
					System.out.println(cal.multiplicar()); 
					break;
				case 4:
					System.out.println(cal.dividir()); 
					break;
				case 5:
					System.out.println("Introduce un número: ");
					n1=sc.nextInt();
					System.out.println("El factorial es: "+cal.factorial(n1));
					break;
				case 6:
					System.out.println("Adiós");
			}
		}while(opcion!=6);
	}

}
