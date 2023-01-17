package saltarin.filtros.recu2021;

import saltarin.filtros.recu2021.condiciones.Condicion;

import java.util.ArrayList;

public class Combo extends ProdAbstracto{
    private double porcentajeDtoPorProducto; //el 1.4
    private double porcentajeTopeDto; //el 0.5
    protected ArrayList<ProdAbstracto> elementos;
    private Condicion condicion;

    public Combo(String nombre, double porcentajeDtoPorProducto,
                 double porcentajeTopeDto,
                 Condicion condicion) {
        super(nombre);
        this.porcentajeDtoPorProducto = porcentajeDtoPorProducto;
        this.porcentajeTopeDto = porcentajeTopeDto;
        this.elementos = new ArrayList<>();
        this.condicion = condicion;
    }

    public void agregarElemento(ProdAbstracto elemento){
        if (condicion.cumple(elemento))
            elementos.add(elemento);
    }

    public void setPorcentajeDtoPorProducto(double porcentajeDtoPorProducto) {
        this.porcentajeDtoPorProducto = porcentajeDtoPorProducto;
    }

    public void setPorcentajeTopeDto(double porcentajeTopeDto) {
        this.porcentajeTopeDto = porcentajeTopeDto;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }


    @Override
    public double getPeso() {
        double suma = 0.0;
        for (ProdAbstracto elemento:elementos)
            suma+=elemento.getPeso();
        return suma;
    }

    protected double precioSinDescuento(){
        double precioTotal = 0.0;
        for (ProdAbstracto elemento:elementos)
            precioTotal+=elemento.getPrecio();
        return precioTotal;
    }

    @Override
    public double getPrecio() {

        double precioTotal = precioSinDescuento();
        double porcentajeDescuento = porcentajeDtoPorProducto * contarProductos();
        if (porcentajeDescuento>this.porcentajeTopeDto)
            porcentajeDescuento = porcentajeTopeDto;

        return precioTotal - porcentajeDescuento*precioTotal;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categorias = new ArrayList<>();
        for (ProdAbstracto elemento:elementos){
            ArrayList<String> catElem = elemento.getCategorias();
            for (String cat:catElem)
                if (!categorias.contains(cat))
                    categorias.add(cat);
        }
        return categorias;
    }

    @Override
    public int contarProductos() {
        int total = 0;
        for (ProdAbstracto elemento:elementos)
            total = total + elemento.contarProductos();
        return total;
    }

    @Override
    public ArrayList<ProdAbstracto> buscar(Condicion f) {
        ArrayList<ProdAbstracto> resultado = new ArrayList<>();
        if (f.cumple(this))
            resultado.add(this);
        else {
            for (ProdAbstracto elemento : elementos)
                resultado.addAll(elemento.buscar(f));
        }
        return resultado;
    }

    private boolean tieneElementos(){
        return this.elementos.size()>0;
    }

    @Override
    public ProdAbstracto copiar(Condicion f) {
        if (f.cumple(this)){
            Combo copiaCombo = new Combo(this.getNombre(), porcentajeDtoPorProducto,
                    porcentajeTopeDto, condicion);
            for (ProdAbstracto elemento : elementos){
                ProdAbstracto copia = elemento.copiar(f);
                if (copia!=null)
                    copiaCombo.agregarElemento(copia);
            }
            if (copiaCombo.tieneElementos())
                return copiaCombo;
        }
        return null;
    }

    @Override
    public Producto productoMenorPeso() {
       double menorPeso = Double.MAX_VALUE;
       Producto productoMenorPeso = null;
       for (ProdAbstracto elemento:elementos) {
           Producto productoMenorPesoAux = elemento.productoMenorPeso();
           double temp = productoMenorPesoAux.getPeso();
           if (productoMenorPeso==null || temp < menorPeso){
               menorPeso = temp;
               productoMenorPeso = productoMenorPesoAux;
           }
       }
       return productoMenorPeso;
    }
}
