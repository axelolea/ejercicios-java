package ejercicioProducto;

public class Consumidor extends Producto {

	String nombreConsumidor;
	
	public Consumidor(String nombreConsumidor, String nombreProducto, float precioProducto) {
		// TODO Auto-generated constructor stub
		super(nombreProducto, precioProducto);
		this.nombreConsumidor = nombreConsumidor;
	}
	
	public void productoInfo() {
		System.out.println("---- Informacion del producto ----");
		this.imprimirInfo();
	}
	
	public void mostrarDescuento() {
		float descuento = this.obtenerDescuento();
		System.out.println("El descuento de " + this.nombre + " es de: " + descuento);
	}
	
	public void mostrarConDescuento() {
		float descuento = this.aplicarDescuento();
		System.out.println("El precio de " + this.nombre + " despues de descuento es de: " + descuento);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inferencia de tipo
		var felipe = new Consumidor("Felipe", "Laptop Lenovo", 12_000f);
		
		felipe.productoInfo();
		felipe.mostrarDescuento();
		felipe.mostrarConDescuento();
	}

}
