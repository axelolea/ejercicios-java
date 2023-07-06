package abstraccion;

abstract public class Vehiculo {

    // Atributos
	public String marca;
    public int anno;

    public void mostrarInfo(){
        System.out.println("Mi auto es: " + marca + "y es del año: " + anno);
    }

    public abstract void acelerar();

    public abstract void frenar();

}
