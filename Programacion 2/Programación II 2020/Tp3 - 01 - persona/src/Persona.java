import java.time.LocalDate;
import java.time.Period;


public class Persona {

	private String nombre;
	private int edad;
	private	String fechaNacimiento;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;

	public Persona (int dniValor){
		dni = dniValor;
		nombre = "N N";
		fechaNacimiento = "1/1/2000";
		sexo = "femenino";
		peso = 1;
		altura = 1;
		mayorDeEdad();
		
	}
	
	public Persona (int dniValor, String nom, int edad){
		dni = dniValor;
		edad = 2;
		nombre = nom;
		fechaNacimiento = "1 de enero de 2000";
		sexo = "femenino";
		peso = 1;
		altura = 1;
	}
	
	public Persona (int dniValor, String nom, String fechaNa){
		dni = dniValor;
		nombre = nom;
		fechaNacimiento = fechaNa;
		sexo = "femenino";
		peso = 1;
		altura = 1;
	}
	
	
	public Persona (int dniValor, String nom, String fechaNa, String sex){
		dni = dniValor;
		nombre = nom;
		fechaNacimiento = fechaNa;
		sexo = sex;
		peso = 1;
		altura = 1;
	}
	
	public Persona (int dniValor, String nom, String fechaNa, String sex, double pesoValor){
		dni = dniValor;
		nombre = nom;
		fechaNacimiento = fechaNa;
		sexo = sex;
		peso = pesoValor;
		altura = 1;
	}
	
	public Persona (int dniValor, String nom, String fechaNa, String sex, double pesoValor, double alturaValor){
		dni = dniValor;
		nombre = nom;
		fechaNacimiento = fechaNa;
		sexo = sex;
		peso = pesoValor;
		altura = alturaValor;
	}
	
	public double calcularImc () {
		return peso/ Math.pow(altura, 2);
	}
	
	public String estadoFisico (){
		if (calcularImc() < 18.5) {
			return "bajo peso";
		} else if (calcularImc() >= 18.5 && calcularImc() < 25) {
			return "normal";
		} else if (calcularImc() >= 25 && calcularImc() < 30) {
			return "sobre peso";
		} else if (calcularImc() >= 30) {
			return "obesidad";
		} else {
			return "NaN";
		}
	}
	
	public boolean poderVotar () {
		if (edad < 16) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean edadCorrecta (){
		LocalDate fecha1 = fechaNacimiento();
		LocalDate fecha2 = LocalDate.now();
		Period period = Period.between(fecha1, fecha2);
		if (period.getYears() != edad){
			return false;
		}else {
			return true;
		}
		//Locale spanishLocale = new Locale("es", "ES");
		//String dateInSpanish=date.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM 'de'yyyy",spanishLocale));

		//System.out.println(spanishLocale);
	}
	
	private LocalDate fechaNacimiento (){
		String []arrAux = fechaNacimiento.split("/");
		int []arrFecha = new int [3];
		for (int i = 0; i < arrAux.length; i++) {
			arrFecha[i] = Integer.parseInt(arrAux[i]); 
			System.out.println();
		}
		LocalDate fecha = LocalDate.of(arrFecha[2], arrFecha[1], arrFecha[0]);
		return fecha;
	}
	
	public boolean esCumpleanos(){
		LocalDate fecha1 = fechaNacimiento();
		LocalDate fecha2 = LocalDate.now();
		Period period = Period.between(fecha1, fecha2);
		if (period.getMonths() != 0 && period.getDays() != 0){
			return false;
		}else {
			return true;
		}
	}
	
	public boolean mayorDeEdad(){
		LocalDate fecha1 = fechaNacimiento();
		LocalDate fecha2 = LocalDate.now();
		Period period = Period.between(fecha1, fecha2);
		if (period.getMonths() != 0 && period.getDays() != 0){
			return false;
		}else {
			return true;
		}
	}
	
	public void datosPersonales (){
		System.out.println("Datos personales: \nNombre: " + nombre + "\nEdad: "
				+ getEdad() + "\nDNI: " + getDni() + "\nFecha de nacimiento: "
				+ getFechaNacimiento() + "\nSexo: " + getSexo() + "\nPeso: "
				+ getPeso() + "\nAltura: " + getAltura());
	} 
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getDni() {
		return dni;
	}
	
	
	
	
	
	
	/*Implementar una clase llamada Persona con las siguientes características:
Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
Valores por defecto:
? El DNI es un valor obligatorio, no posee valor por defecto.
? En caso de la fecha de nacimiento será el 1 de enero de 2000.
? Sexo será Femenino por defecto.
? El nombre por defecto es N y el apellido es N.
? El peso y la altura son 1 por defecto.
Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
apellido, con DNI nombre apellido y Fecha de nacimiento.....
La responsabilidad de la clase es la siguiente:
? Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
de masa corporal el cual es peso / altura2
? Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
? Saber si está cumpliendo años.
? Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
años
? Métodos set de cada parámetro, excepto de DNI.
? Saber si puede votar. Es necesario ser mayor de 16 años.
? Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
? Mostrar toda la información del objeto. Es decir devolver un String con la
información del mismo.*/
	
}