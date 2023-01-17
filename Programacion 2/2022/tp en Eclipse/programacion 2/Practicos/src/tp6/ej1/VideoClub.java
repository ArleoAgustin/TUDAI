package tp6.ej1;

import java.util.ArrayList;

public class VideoClub {
	
	private ArrayList<Item> productos = new ArrayList<>();
	private ArrayList<Alquiler> productosAlquilados  = new ArrayList<>();
	private ArrayList<Cliente> clientes  = new ArrayList<>();
	
	public VideoClub() {
		
	}
	
	public void addProducto(Item p) {
		productos.add(p);
	}


	public ArrayList<Cliente> getClientes() {
		return new ArrayList<>(clientes);
	}

	public void addCliente(Cliente c) {
		this.clientes.add(c);
	}

	public ArrayList<Alquiler> getAlquileres() {
		return new ArrayList<>(productosAlquilados);
	}

	public void addAlquiler(Alquiler a) {
		this.productosAlquilados.add(a);
	}
	
	public ArrayList<Cliente> clientesConAlquilerVencido(){
		
		ArrayList<Cliente> clientesVencidos = new ArrayList<Cliente>();
		
		for(Cliente c: this.clientes) {
			if(c.alquilerVencido())
				clientesVencidos.add(c);
		}
		return clientesVencidos;
	}
	
}
