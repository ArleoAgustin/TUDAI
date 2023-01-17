package tp5.ej2;

public class Main {

	public static void main(String[] args) {
		
		Casa c1 = new Casa(2, "Casa normal");
		CasaExigente c2 = new CasaExigente(2, "Casa exigente");
		CasaEnemistada c3 = new CasaEnemistada(2, "Casa Competitiva", c1);
		
		c1.addCualidad("Mago");
		c1.addCualidad("Hechicero");
		c1.addCualidad("Gato");
		
		c2.addCualidad("Mago");
		c2.addCualidad("Hechicero");
		c2.addCualidad("Gato");
		
		c3.addCualidad("A");
		c3.addCualidad("Hechicero");
		c3.addCualidad("Gato");
		
		
		Alumno a1 = new Alumno("Agustin");
		Alumno a2 = new Alumno("Lucas");
		Alumno a3 = new Alumno("Gonzalo");
		Alumno a4 = new Alumno("Leandro");
		
		
		
		a1.addCualidad("Mago");
		a1.addCualidad("Hechicero");
		a1.addCualidad("Gato");
		
		a2.addCualidad("Mago");
		a2.addCualidad("Gato");
		a2.addCualidad("Hechicero");
		
		a3.addCualidad("A");
		a3.addCualidad("Gato");
		a3.addCualidad("Hechicero");
		
		a4.addCualidad("Mago");
		a4.addCualidad("Gato");
		a4.addCualidad("Hechicero");
		
		a2.addFamiliar(a4);
		a4.addFamiliar(a2);
		
		c1.addAlumno(a1);
		
		c2.addAlumno(a2);
		c2.addAlumno(a4);
		
		c3.addAlumno(a3);
		
		System.out.println(c1);
		System.out.println(c2);		
		System.out.println(c3);
		
		
	}

	
}
