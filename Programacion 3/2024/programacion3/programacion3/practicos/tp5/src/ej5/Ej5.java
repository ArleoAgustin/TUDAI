package ej5;
import java.util.ArrayList;
import java.util.HashMap;

public class Ej5 {

    private HashMap<Procesador, ArrayList<Tarea>> procesadores;
    private ArrayList<Tarea> tareas;
    private ArrayList<Tarea> mejorAsignacion;

    public Ej5(HashMap<Procesador, ArrayList<Tarea>> procesadores, ArrayList<Tarea> tareas) {
        this.procesadores = procesadores;
        this.tareas = tareas;
        this.mejorAsignacion = new ArrayList<>();
    }

    public void asignarTareas(){
        asignarTareasBack(new ArrayList<>(), Integer.MAX_VALUE, 0, 0);
        // Imprimir la mejor asignación encontrada
        System.out.println("Mejor asignación de tareas a procesadores:");

        for (int i = 0; i < mejorAsignacion.size(); i++) {
            Tarea tarea = mejorAsignacion.get(i);
            System.out.println("Tarea " + tarea.getId() + " asignada al procesador " + obtenerProcesadorDeTarea(tarea).getId());
        }

    }

    private Procesador obtenerProcesadorDeTarea(Tarea tarea) {
        for (Procesador procesador : procesadores.keySet()) {
            if (procesadores.get(procesador).contains(tarea)) {
                return procesador;
            }
        }
        return null;
    }

    private void asignarTareasBack(ArrayList<Tarea> asignacionActual, int tiempoTotalMinimo, int tiempoTotalActual, int indiceTarea){

        if (indiceTarea == tareas.size()) {
            if (tiempoTotalActual <= tiempoTotalMinimo) {
                tiempoTotalMinimo = tiempoTotalActual;
                this.mejorAsignacion = new ArrayList<>(asignacionActual);
            }
            return;
        }

        Tarea tareaActual = tareas.get(indiceTarea);
        ArrayList<Tarea> tareasProcesador = procesadores.get(obtenerProcesadorDeTarea(tareaActual));
        for (Tarea tarea : tareasProcesador) {
            asignacionActual.add(tarea);
            asignarTareasBack(asignacionActual, tiempoTotalMinimo, tiempoTotalActual + tarea.getTiempoDeEjecucion(), indiceTarea + 1);
            asignacionActual.remove(asignacionActual.size() - 1);
        }
    }

    public HashMap<Procesador, ArrayList<Tarea>> getProcesadores() {
        return procesadores;
    }
}
