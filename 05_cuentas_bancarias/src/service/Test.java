package service;

public class Test {

	public static void main(String[] args) {
		CuentaBancariaLimite cbl=new CuentaBancariaLimite(100, 50);
		cbl.ingresar(30);
		cbl.extraer(80);
		System.out.println(cbl.getSaldo());
	}
}
