import java.util.HashMap;


public class Provincia {
	
	private String nombre;
	private Ciudad ciudad1;
	private Ciudad ciudad2;
	private HashMap<String, Ciudad> ciudades = new HashMap<String, Ciudad>();
	
	public Provincia (String nom){
		nombre = nom;
		ciudad1 = new Ciudad();
		ciudad2 = new Ciudad();
		ciudades.put("Tandil", ciudad1);
		ciudades.put("Azul", ciudad2);
	}
	
	public void Provincia (String nom, String h){
		nombre = nom;
		ciudad1 = new Ciudad();
		ciudad2 = new Ciudad();
		ciudades.put("Tandil", ciudad1);
		ciudades.put("Azul", ciudad2);
	}
	
	public void Provincia (String nom, int g){
		nombre = nom;
		ciudad1 = new Ciudad();
		ciudad2 = new Ciudad();
		ciudades.put("Tandil", ciudad1);
		ciudades.put("Azul", ciudad2);
	}
	
	public void Provincia (String nom, String ws, int g){
		nombre = nom;
		ciudad1 = new Ciudad();
		ciudad2 = new Ciudad();
		ciudades.put("Tandil", ciudad1);
		ciudades.put("Azul", ciudad2);
	}
	
	public boolean getDeficitCiudades (){
		int deficitProvincia = 0;
		for(Ciudad ciudad : ciudades.values()){
			System.out.println("La ciudad "+(ciudades.keySet())+" tiene deficit "+ ciudad.getDeficit());
			if (ciudad.getDeficit() == true){
				deficitProvincia++;
			}
		}
		if (deficitProvincia >= (ciudades.size()/2)){
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
