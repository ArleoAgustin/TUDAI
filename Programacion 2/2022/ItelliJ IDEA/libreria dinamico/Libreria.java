import java.util.ArrayList;


public class Libreria {

	ArrayList<Producto>  elementos;
	ArrayList<Cliente> clientes;
	
	public double getPrecio(Producto p, Cliente c) {
		
		return p.getPrecio()* (1- c.getDescuento());
	}
	
	public boolean yaCompro(Cliente c, Producto p) {
		return c.yaCompro(p);
	}
	
	public boolean leGusta(Producto p , Cliente c) {
		
		return c.leGusta(p);
		
		
	/*
	  	if (c.getTipo().equals("normalito")) {
	 
			ArrayList<String> autores = c.getAutores();
			for(int i = 0; i<autores.size();i++) {
				if (p.getAutor().equals(autores.get(i))) {
					return true;
				}
			}
			return false;
		} else {
			ArrayList<String> autores = c.getAutores();
			boolean encontro = false;
			for(int i = 0; i<autores.size()&&!encontro;i++) {
				if (p.getAutor().equals(autores.get(i))) {
					encontro= true;
				}
			}
			if (!encontro) {
				return false;
			}else {
				ArrayList<String> generos = c.getGeneros();
				for (int i =0; i<generos.size();i++) {
					if (p.tieneGenero(generos.get(i))) {
						return true;
					}
				}
				return false;
			}
			
		}
		*/
	}
	
	public ArrayList<Cliente> lesGustaElProducto(Producto p){
		ArrayList<Cliente> salida = new ArrayList<Cliente>();
		for(int i = 0; i<clientes.size();i++) {
			if( clientes.get(i).leGusta(p)) {
				salida.add(clientes.get(i));
			}
		}
		return salida;
	}
	
	
	
	public ArrayList<Producto> recomendados(Cliente c){
		ArrayList<Producto> salida = new ArrayList<Producto>();
		for(int i = 0; i<elementos.size();i++) {
			if( c.leGusta(elementos.get(i))) {
				salida.add(elementos.get(i));
			}
		}
		return salida;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Libreria ll = new Libreria();
		Cliente c = new Cliente("marcelo", "Armentano","Siempreviva 555"
				               , 5, 0);
		
		c.addAutor("Borges");
		c.addGenero("comedia");
		
		Cliente c2 = new ClienteTodoLeVieneBien("marcelo2", "Armentano","Siempreviva 555"
	               , 5, 0);

	    c2.addAutor("Superman");
        c2.addGenero("comediadd");
        
        Producto l1= new Producto("uno","Borges","",2,3);
        Producto l2= new Producto("uno","Borges","",2,3);
        l2.addGenero("comedia");
        
        System.out.println("A " + c.getNombre() + " " +
                               ll.leGusta(l1, c));
        System.out.println("A " + c.getNombre() + " " +
                ll.leGusta(l2, c));
        
        System.out.println("A " + c2.getNombre() + " " +
                ll.leGusta(l1, c2));
        System.out.println("A " + c2.getNombre() + " " +
                           ll.leGusta(l2, c2));


/**		
		Producto l1= new Producto("uno","otro","",2,3);
		Producto l2= new Producto("dos","otro",null,2,3);
		Producto l3= new Producto("uno","otro","",2,3);
		
		c.addCompra(l1);
		c.addCompra(l2);
		c.addCompra(l3);
		
		System.out.println(c);
		
		ArrayList aux = c.getCompras();
		
		aux.set(0, "PROG2");
		
		System.out.println(c);
		aux.clear();
		System.out.println(c);
	*/	
		
		
		
	}
	
}
