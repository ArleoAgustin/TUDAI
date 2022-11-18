package centroAnimales;

import java.util.ArrayList;

public class Jaula {

    private ArrayList<Caracteristica> caracteristicas;

    public Jaula(){
        caracteristicas = new ArrayList<>();
    }

    public void addCaracteristica(String nombre, Object valor){
        if (!tieneCaracteristica(nombre))
            this.caracteristicas.add(new Caracteristica(nombre, valor));
        else {
            actualizarCaracteristica(nombre, valor);
        }
    }

    public void actualizarCaracteristica(String nombre, Object valor){
        Caracteristica c = getCaracteristica(nombre);
        if (c!=null)
            c.setValor(valor);
    }

    /**
     * Dado el nombre de una característica retorna el objeto
     * Característica correspondiente de la jaula. Si no existe retorna null.
     * @param nombre
     * @return
     */
    public Caracteristica getCaracteristica(String nombre){
        for (int i = 0; i < caracteristicas.size(); i++) {
            if (caracteristicas.get(i).getNombre().equals(nombre))
                return caracteristicas.get(i);
        }
        return null;
    }

    public boolean tieneCaracteristica(String nombre){
        Caracteristica c = this.getCaracteristica(nombre);
        return (c != null);
    }

    public boolean tieneCaracteristica(Caracteristica c){
        return caracteristicas.contains(c);
    }

    @Override
    public String toString() {
        return caracteristicas.toString();
    }
}
