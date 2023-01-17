package tp7a.ej1;

import java.util.ArrayList;

import tp7a.ej1.condicion.Condicion;

public class EmpresaAgricola {
	
	private ArrayList<Producto> agroquimicos;

	public EmpresaAgricola() {
		
		this.agroquimicos = new ArrayList<Producto>();
	}

	public ArrayList<Producto> getAgroquimicos() {
		return new ArrayList<>(agroquimicos);
	}

	public void addAgroquimicos(Producto a) {
		this.agroquimicos.add(a);
	}
	
	public ArrayList<Producto> ProductosFiltrados(Condicion c){
		
		ArrayList<Producto> prod = new ArrayList<>();
		
		for(Producto p: agroquimicos) {
			if(c.cumple(p))
				prod.add(p);
		}
		return prod;
	}
}
