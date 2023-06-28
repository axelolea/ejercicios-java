package entidades;

public class Cliente {

	String nombre;
	String cuentaBancaria;
	private float saldo;
	private String nip;
	private boolean vip;
	
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		this.saldo = saldo;
		this.nip = nip;
	}
	
	
	public void mostrarInformacion() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La cuenta bancaria es: " + cuentaBancaria);
		System.out.println("El saldo es: " + saldo);
		System.out.println("El nip es: " + nip);
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
