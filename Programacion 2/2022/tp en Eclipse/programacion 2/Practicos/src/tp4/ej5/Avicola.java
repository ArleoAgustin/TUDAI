package tp4.ej5;

import java.util.ArrayList;

public class Avicola {
		
		private ArrayList<Producto> productos = new ArrayList<Producto>();

		public Avicola() {
			
		}

		public ArrayList<Producto> getProductos() {
			return productos;
		}

		public void addProducto(Producto p) {
			this.productos.add(p);
		}
		
		public String imprimirDAtosProductos(Producto p) {
			
			for(Producto pr: this.productos) {
				if(pr.equals(p))
					return pr.toString();
				
			}
			return "No se encotro el producto";
		}
		
		
		
	}
