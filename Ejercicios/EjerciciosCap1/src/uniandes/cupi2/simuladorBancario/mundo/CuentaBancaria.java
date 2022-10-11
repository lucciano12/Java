package uniandes.cupi2.simuladorBancario.mundo;

public class CuentaBancaria {
	
	//Atributos
	private String cedula;
	private String nombre;
	
	private CuentaCorriente corriente; 
	private CuentaAhorros ahorros; 
	private CDT inversion;
	private Mes mesActual;
	
	//Metodos
	public void ahorrar(int valor) {
		int temp = corriente.retirar(valor);
		ahorros.depostirar(temp);
	}
	
	public void retirarAhorro(int valor) {
		ahorros.retirar(valor);
	}
	
	public void retirarCorriente(int valor) {
		corriente.retirar(valor);
	}
	
	public int darSaldoCorriente() {
		return corriente.saldo();
	}
	
}
