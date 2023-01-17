package clase20211109.cocina;

import java.util.ArrayList;

public class Cocina {
    private String nombre;
    private ArrayList<EstacionTrabajo> estaciones;
    private EstacionTrabajo aceptaTodo;

    public Cocina(String nombre) {
        this.nombre = nombre;
        this.estaciones = new ArrayList<>();
        aceptaTodo = new EstacionTrabajo("defecto",
                new CriterioTiempoMenor(200000));
    }

    public void agregarEstacion(EstacionTrabajo e){
        estaciones.add(e);
    }

    public void tomarPedido(ArrayList<Comida> pedido){
        for(Comida comida:pedido){
            boolean aceptada = false;
            int i = 0;
            while (i<estaciones.size() && !aceptada){
                EstacionTrabajo est = estaciones.get(i);
                if (est.aceptas(comida)){
                    est.tomarComida(comida);
                    aceptada = true;
                }
                i++;
            }
            if (!aceptada)
                aceptaTodo.tomarComida(comida);
        }
    }
}
