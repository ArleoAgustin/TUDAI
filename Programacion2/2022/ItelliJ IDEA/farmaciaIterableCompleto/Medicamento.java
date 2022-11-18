package farmaciaIterableCompleto;

import java.util.ArrayList;
import java.util.Locale;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private double precio;
    private ArrayList<String> sintomasQueTrata;

    public Medicamento(String nombre, String laboratorio, double precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        this.sintomasQueTrata = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void addSintoma(String sintoma){
        this.sintomasQueTrata.add(sintoma.toLowerCase());
    }

    public ArrayList<String> getSintomasQueTrata(){
        return new ArrayList<>(this.sintomasQueTrata);
    }

    public boolean trataSintoma(String sintoma){
        return this.sintomasQueTrata.contains(sintoma.toLowerCase());
    }

    @Override
    public String toString() {
        return this.getNombre()+"-"+this.getLaboratorio();
    }

    @Override
    public boolean equals(Object m){
        try {
            Medicamento otro = (Medicamento) m;
            return (this.nombre.toLowerCase().equals(otro.getNombre().toLowerCase()) &&
                    this.getLaboratorio().toLowerCase().equals(otro.getLaboratorio().toLowerCase()) &&
                    this.getPrecio() == otro.getPrecio());
        } catch (Exception e){
            return false;
        }
    }
}
