import java.time.LocalDate;
import java.util.ArrayList;

class Main {
  
  
  public static void main(String[] args) {
    Peluqueria peluqueria = new Peluqueria();
    Cliente cliente1  = new Cliente("Jose", 34);
    peluqueria.pedirTurno(cliente1.getNombre(), cliente1.obtenerDescuento());
  }
  



}