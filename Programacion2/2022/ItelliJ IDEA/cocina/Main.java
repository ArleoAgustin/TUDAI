package clase20211109.cocina;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cocina barDeLaEsquina = new Cocina("Bar de la esquina");

        Criterio postre = new CriterioTipoPreparacion("Postre");
        EstacionTrabajo est1 = new EstacionTrabajo("Estacion de Ensaladas",
                new CriterioTipoPreparacion("Ensalada"));
        EstacionTrabajo est2 = new EstacionTrabajo("Estacion de Postres", postre
                );
        EstacionTrabajo est3 = new EstacionTrabajo("Estacion de Comidas al horno",
                new CriterioModoPreparacion("horneado"));
        EstacionTrabajo est4 = new EstacionTrabajo("Estacion rapida",
                new CriterioTiempoMenor(15));
        EstacionTrabajo est5 = new EstacionTrabajo("Estacion postres rapidos",
                new CriterioAND(
                        postre,
                        new CriterioTiempoMenor(10))
                );

        barDeLaEsquina.agregarEstacion(est1);
        barDeLaEsquina.agregarEstacion(est2);
        barDeLaEsquina.agregarEstacion(est3);
        barDeLaEsquina.agregarEstacion(est4);
        barDeLaEsquina.agregarEstacion(est5);

        Comida tiramisu = new Comida("Tiramisu", "Postre", "Horneado", 60);
        Comida cesar = new Comida("Ensalada Cesar", "Ensalada", "Crudo", 30);
        Comida papasFritas = new Comida("Papas Fritas", "Aperitivo", "Frito", 30);
        ArrayList<Comida> pedidoMesa1 = new ArrayList<>();
        pedidoMesa1.add(tiramisu);
        pedidoMesa1.add(cesar);
        pedidoMesa1.add(papasFritas);

        barDeLaEsquina.tomarPedido(pedidoMesa1);

    }
}
