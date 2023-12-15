package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import exceptions.SaldoNegativoException;
import model.Movimiento;

public class CuentaBancariaMovimientos extends CuentaBancariaLimite {
	private ArrayList<Movimiento> movimientos=new ArrayList<>();

	public CuentaBancariaMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}
	
	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}
	
	//sobreescribimos los métodos ingresar y extraer para que registren el movimiento producido

	@Override
	public void extraer(double cantidad) throws SaldoNegativoException {
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),TipoMovimiento.EXTRACCION));
		super.extraer(cantidad);
	}
	
	//Da igual que se ponga antes o después de la llamada al método de la súperclase
	//En extraer antes, en ingresar después de la llamada
	
	@Override
	public void ingresar(double cantidad) {
		super.ingresar(cantidad);
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),TipoMovimiento.INGRESO));
	}
	
	
	
	
	
	
	

}
