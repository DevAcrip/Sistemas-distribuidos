package vista;

import models.Cliente;
import servicios.ClienteServices;

public class Menu {
	public static void main(String[] args) {
		
		ClienteServices objClienteServices= new ClienteServices();
	    System.out.println("\nConsultando un cliente");
	    Cliente objCliente= objClienteServices.consultarCliente(1);
        imprimirCliente(objCliente);
	}
	
	private static void imprimirCliente(Cliente objCliente)
	{
		System.out.println(objCliente.getId());
		System.out.println(objCliente.getNombre());
		System.out.println(objCliente.getApellido());
		System.out.println(objCliente.getEmail());
		System.out.println(objCliente.getTelefono());
		System.out.println(objCliente.getUsuario());
		System.out.println(objCliente.getContraseña());
		System.out.println(objCliente.getCreateAt());
	}

}
