package clase20211118recu;

import clase20211118recu.condiciones.Condicion;

public class ComboPromocional extends Combo{
    public ComboPromocional(String nombre, double porcentajeDtoPorProducto, double porcentajeTopeDto, Condicion condicion) {
        super(nombre, porcentajeDtoPorProducto, porcentajeTopeDto, condicion);
    }

    @Override
    public double getPrecio() {
        double precioTotal = this.precioSinDescuento();
        double totalProductos = this.contarProductos();
        return precioTotal / totalProductos;
    }
}
