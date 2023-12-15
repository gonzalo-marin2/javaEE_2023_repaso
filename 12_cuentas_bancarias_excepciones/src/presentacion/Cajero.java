package presentacion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.SaldoNegativoException;
import model.Movimiento;
import service.CuentaBancariaMovimientos;

public class Cajero {
	
	/*
	Aplicación cajero
	Al iniciar el programa, se solicita un saldo inicial y un límite.
	A continuación, se mostrará el menú:
	1.- Ingresar
	2.- Extraer
	3.- Saldo y movimientos
	4.- Salir
	*/
	
	static CuentaBancariaMovimientos cuenta;
	
	public static void main(String[] args) throws SaldoNegativoException {
		int opcion;
		Scanner sc=new Scanner(System.in);
		try {
				System.out.println("Introduce el saldo inicial:");
				double saldo=sc.nextDouble();
				System.out.println("Introduce el límite:");
				double limite=sc.nextDouble();
				cuenta=new CuentaBancariaMovimientos(saldo,limite);
				do {
					try {
							mostrarMenu();
							opcion=sc.nextInt();
							switch(opcion) {
							case 1:
								ingresar();
								break;
							case 2:
								extraer();
								break;
							case 3:
								saldoMovimientos();
								break;
							case 4:
								System.out.println("Adiós");		
						}
					}catch(InputMismatchException ex) {
						System.out.println("Opción incorrecta o dato erróneo");
						sc=new Scanner(System.in);//reconstruimos el scanner, sino entra en bucle infinito.
						opcion=0;//al ver que opcion es distinto de 4, vuelve a mostrar el menú
				}
			} while(opcion!=4);
		}
		catch(InputMismatchException ex) {
			System.out.println("Solo valores numéricos");
		}
		
		
	}
	
	static void mostrarMenu() {//tiene que ser static, pq el main es static y para poder llamar a otros métodos de su clase
		//necesita que sean static
		System.out.println("1.- Nuevo ingreso");
		System.out.println("2.- Extraer dinero");
		System.out.println("3.- Mostrar saldo y movimientos");
		System.out.println("4.- Salir");
	}
	
	static void ingresar() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la cantidad a ingresar");
		double cantidad=sc.nextDouble();
		cuenta.ingresar(cantidad);
	}
	
	static void extraer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la cantidad a extraer");
		double cantidad=sc.nextDouble();
		try {
			cuenta.extraer(cantidad);
		}
		catch(SaldoNegativoException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			//System.out.println("No puedes retirar más dinero del que hay en la cuenta");
		}
		
	}
	
	static void saldoMovimientos() {
		//mostramos el saldo
		System.out.println("Saldo actual: "+cuenta.getSaldo());
		//mostramos los movimientos
		//como el método devuelve un arraylist, lo guardamos en otro arraylist
		ArrayList<Movimiento> movimientos=cuenta.obtenerMovimientos();
		//recorremos el array y mostramos los campos que nos interesan 
		for(Movimiento m:movimientos) {
			System.out.println(m.getCantidad()+"-"+m.getFechaHora()+"-"+m.getTipo());
		}
	}
	
}
