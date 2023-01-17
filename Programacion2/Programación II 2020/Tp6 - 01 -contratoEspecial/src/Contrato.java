
public class Contrato {

	private String empresa;
	private int horaDeTrabajoSemanal;
	private int sueldo;

	public Contrato(String empresa, int horaDeTrabajoSemanal, int sueldo) {
		this.empresa = empresa;
		this.horaDeTrabajoSemanal = horaDeTrabajoSemanal;
		this.sueldo = sueldo;
	}
	public String toString() {
		return "Contrato: "+ empresa +" - "+ horaDeTrabajoSemanal + "hs - "+ sueldo+"$";
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getHoraDeTrabajoSemanal() {
		return horaDeTrabajoSemanal;
	}
	public void setHoraDeTrabajoSemanal(int horaDeTrabajoSemanal) {
		this.horaDeTrabajoSemanal = horaDeTrabajoSemanal;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}
