package SesionUno;

public class TiposYVariables {

    public static void main(String[] args) {

        System.out.println("Hello Magic Town");

        // Tipos de Datos

        // <-- Byte -->
        // Almacena 8 bits
        // Desde -128 a 127

        byte salas = 10;

        System.out.println("Byte Type");
        System.out.println("- Max Value: " + Byte.MIN_VALUE);
        System.out.println("- Max Value: " + Byte.MAX_VALUE);

        // <-- Short -->
        // Almacena 16 bits
        // Desde -32_768 a 32_767

        short asientos = 1120;

        System.out.println("Short Type");
        System.out.println("- Max Value: " + Short.MIN_VALUE);
        System.out.println("- Max Value: " + Short.MAX_VALUE);

        // <-- Integer -->
        // Almacena 32 bits
        // Desde -2_147_483_648 a 2_147_483_647

        int dulces = 34_776;

        System.out.println("Integer Type");
        System.out.println("- Max Value: " + Integer.MIN_VALUE);
        System.out.println("- Max Value: " + Integer.MAX_VALUE);

        // <-- Long -->
        // Almacena 64 bits
        // Desde -9_223_372_036_854_775_808 a 9_223_372_036_854_775_807

        long boletos = 2_122_121_212;

        System.out.println("Long Type");
        System.out.println("- Max Value: " + Long.MIN_VALUE);
        System.out.println("- Max Value: " + Long.MAX_VALUE);

        // <-- Float -->
        // Almacena 32 bits
        // Desde 1.4 E^-45 a 3.4028235 E^38

        float palomitas = 35.4f;

        System.out.println("Float Type");
        System.out.println("- Max Value: " + Float.MIN_VALUE);
        System.out.println("- Max Value: " + Float.MAX_VALUE);

        // <-- Double -->
        // Almacena 64 bits
        // Desde 4.9 E^-324 a 1.7976931348623157 E^308

        double ganancias = 123.1231312d;

        System.out.println("Double Type");
        System.out.println("- Max Value: " + Double.MIN_VALUE);
        System.out.println("- Max Value: " + Double.MAX_VALUE);

        // <-- Boolean -->
        // Almacena valores booleanos (true o false)

        boolean valorVerdadero = true;
        boolean valorFalso = false;

        // <-- Char -->
        // Almacena un caracter (el mismo tamaño que un int)

        char salaUno = 'A';

        // Casting o casteo

        double miNumero = 123.1d;

        int miOtroNumero = (int) miNumero;

        System.out.println("Double a Int: " + miOtroNumero);

        long miOtroNumeroLargo = (long) miNumero;

        System.out.println("Double a Long: " + miOtroNumeroLargo);

        // Objeto String

        String cantidad = "85";
        String precio = "59.7";

        int cantidadEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);

        System.out.println("Cantidad: " + cantidadEntero);
        System.out.println("Precio: " + precioDouble);

        double precioTotal = cantidadEntero + precioDouble;

        System.out.println("El precio total es: $" + precioTotal);
    }
}
