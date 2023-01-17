package tp3.ej1;

public class Main {

	public static void main(String[] args) {
		
		Compania comp = new Compania();
		
		Empleado emp1 = new Empleado("Agustin");
		Empleado emp2 = new Empleado("Gonzalo");
		Empleado emp3 = new Empleado("Lucas");
		Empleado emp4 = new Empleado("Bautista");
	
		Encuestado en1 = new Encuestado(45);
		Encuestado en2 = new Encuestado(44);
		Encuestado en3 = new Encuestado(49);

		Encuesta e1 = new Encuesta(emp1);
		Encuesta e2 = new Encuesta(emp2);
		Encuesta e3 = new Encuesta(emp3);
		Encuesta e4 = new Encuesta(emp1);
		
		Pregunta p1 = new Pregunta("1");
		Pregunta p2 = new Pregunta("2");
		Pregunta p3 = new Pregunta("3");
		Pregunta p4 = new Pregunta("4");
		Pregunta p5 = new Pregunta("5");
	
	
		e1.addPregunta(p1);
		e1.addPregunta(p2);
		e1.addPregunta(p3);
		e1.addPregunta(p4);
		e1.addPregunta(p5);
		
		e2.addPregunta(p1);
		e2.addPregunta(p2);
		e2.addPregunta(p3);
		e2.addPregunta(p4);
		e2.addPregunta(p5);
		
		e3.addPregunta(p1);
		e3.addPregunta(p2);
		e3.addPregunta(p3);
		e3.addPregunta(p4);
		e3.addPregunta(p5);
		
		e4.addPregunta(p1);
		e4.addPregunta(p2);
		e4.addPregunta(p3);
		e4.addPregunta(p4);
		e4.addPregunta(p5);
	
		
		en1.llenarEncuesta(e3);
		en2.llenarEncuesta(e3);
		en3.llenarEncuesta(e3);
		en1.llenarEncuesta(e2);
		en2.llenarEncuesta(e2);
		en1.llenarEncuesta(e2);
		en1.llenarEncuesta(e4);
		
		comp.addEncuesta(e1);
		comp.addEncuesta(e2);
		comp.addEncuesta(e3);
		comp.addEncuesta(e4);

		
		System.out.println(comp.getEncuestas());
	
	
		System.out.println(comp.numeroDeEncuestasXEmpleado(emp4));

	}

}
