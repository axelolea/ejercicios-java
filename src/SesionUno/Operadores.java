package SesionUno;

public class Operadores {
    public static void main(String[] args) {

        // Operadores aritmeticos

        int dias = 28;

        // dias = dias / 2;
        dias /= 2;

        System.out.println("Dias: " + dias);

        int incremento = 0;

        incremento++;
        incremento++;
        incremento++;
        incremento++;
        incremento++;

        System.out.println("El incremento final es: " + incremento);

        // Operadores Relacionales

        // == si es igual aotro valor
        //!= si es diferente a otro valor
        // < es menor a
        // > es mayor a
        // <= es menor o igual  a
        // >= es mayor o igual a

        int a = 15;
        int b = 10;

        boolean resultado;
        resultado = a != b;
        System.out.println("¿a y b son diferentes? " + resultado);
    }
}
