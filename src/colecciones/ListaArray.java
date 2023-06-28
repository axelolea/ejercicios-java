package colecciones;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListaArray {

	public static void main(String[] args) {
		
		System.out.println("<---- Lista de Compras ---->");
		
		String[] listaCompras = new String[]{"leche", "pan", "frutas"};
		
		System.out.println(listaCompras);
		
		System.out.println("<---- Lista de habitaciones ---->");

		for(String producto: listaCompras) {
			System.out.println(producto);
		}
		
		
		String[] habitaciones = new String[10];
		
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[7] = "108";
		habitaciones[8] = "109";
		habitaciones[9] = "110";
		
		for(String habitacion: habitaciones) {
			System.out.println(habitacion);
		}
		
		System.out.println("<---- Lista de Clientes ---->");
		
		List<Cliente> listaDeClientes = new ArrayList<>();
		
		Cliente axel = new Cliente("Axel", "ASSD1209k", 12_000, "1234");
		
		listaDeClientes.add(axel);
		listaDeClientes.add(new Cliente("Jose", "JMP123P", 12_900, "1234"));
		
		System.out.println("Lista completa");
		System.out.println(listaDeClientes);
		
		for(Cliente cliente: listaDeClientes) {
			cliente.mostrarInformacion();
		}
		
		listaDeClientes.remove(0);
		
		System.out.println(listaDeClientes);
		
		System.out.println("<---- Set de serviciones ---->");
		
		Set<String> roomService = new HashSet<>();
		
		roomService.add("Chilaquiles");
		roomService.add("Agua Mineral");
		roomService.add("Wi-Fi");
		
		if(roomService.contains("Agua Mineral")) {
			System.out.println("Obtienes un descuento del 15%");
		}
		
		System.out.println(roomService);

		roomService.clear();
		
		System.out.println(roomService);
		
		Map<String, Cliente> reservasHab = new HashMap<>();
		
		reservasHab.put("201", axel);
		reservasHab.put("112", new Cliente("Ramiro", "ASF123", 15_000, "2154"));
		
		System.out.println(reservasHab);
		
	}
}
