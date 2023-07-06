package abstraccion;

public class TestVehiculos {

    public static void main(String[] args) {

        Automovil miTroquita = new Automovil();

        Motocicleta laNinja = new Motocicleta();

        miTroquita.acelerar();
        laNinja.acelerar();


        miTroquita.frenar();
        laNinja.frenar();

    }

}
