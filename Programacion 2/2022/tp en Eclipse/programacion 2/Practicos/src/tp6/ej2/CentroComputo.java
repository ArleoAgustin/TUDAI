package tp6.ej2;

public class CentroComputo {
    private ColaOrdenada computadoras;
    private ColaOrdenada procesos;

    public CentroComputo(){
        this.computadoras = new ColaOrdenada();
        this.procesos = new ColaOrdenada();
    }

    public void agregarComputadora(Computadora c){
        computadoras.addElemento(c);
    }


    public Computadora agregarProceso(Proceso p){
        if (computadoras.tieneElementos()){
            Computadora c1=(Computadora) computadoras.siguiente();
            c1.ejecutarProceso(p);
            return c1;
        }
        else {
            procesos.addElemento(p);
            return null;
        }
    }

    public void imprimirComputadoras(){
        System.out.println(this.computadoras);
    }

    public void imprimirProcesos(){
        System.out.println(this.procesos);
    }
}
