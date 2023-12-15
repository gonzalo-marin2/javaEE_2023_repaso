package service;

/*
Clase que hereda CuentaBancaria. Incorporará un atributo "limite",
para limitar la extracción a dicho valor.
Dispondrá también de un método ajustarLimite(), que fijará el límite
en la mitad del saldo 
*/ 

public class CuentaBancariaLimite extends CuentaBancaria {
	private double limite;
	
	public CuentaBancariaLimite(double saldo, double limite) {
		super(saldo);//accedemos al constructor de la superclase para que nos dé este dato.
		this.limite = limite;
	}
	
	public void ajustarLimite() {
		limite=getSaldo()/2;//getSaldo está llamando al getter de la superclase
	}
	
	@Override
	public void extraer(double cantidad) {
		if(cantidad<=limite) {
			super.extraer(cantidad);//estamos llamando al de la superclase, necesitamos especificar para que sepa a cuál llama
		}else {
			super.extraer(limite);
		}	
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
