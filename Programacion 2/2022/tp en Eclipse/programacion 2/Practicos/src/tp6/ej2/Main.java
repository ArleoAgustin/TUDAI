package tp6.ej2;


public class Main {
    public static void main(String[] args) {
        Proceso p1 =new Proceso("p1", 600);
        Proceso p2 =new Proceso("p2", 800);
        Proceso p3 =new Proceso("p3", 100);
        Proceso p4 =new Proceso("p4", 400);

        Computadora c1 = new Computadora("C1", 200);
        Computadora c2 = new Computadora("C2", 100);
        Computadora c3 = new Computadora("C3", 500);

        CentroComputo centro = new CentroComputo();

        centro.agregarProceso(p1);
        centro.agregarProceso(p2);
        centro.agregarProceso(p3);
        centro.agregarProceso(p4);

        centro.imprimirProcesos();

        centro.agregarComputadora(c1);
        centro.agregarComputadora(c2);
        centro.agregarComputadora(c3);

        centro.imprimirComputadoras();


    }
}
