package clase20211118recu;

import clase20211118recu.condiciones.Condicion;

public class ComboLiviano extends Combo{

    public ComboLiviano(String nombre, double porcentajeDtoPorProducto, double porcentajeTopeDto, Condicion condicion) {
        super(nombre, porcentajeDtoPorProducto, porcentajeTopeDto, condicion);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() - this.productoMenorPeso().getPrecio();
    }
}
