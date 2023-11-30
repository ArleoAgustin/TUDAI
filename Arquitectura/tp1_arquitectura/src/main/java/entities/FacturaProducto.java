package entities;

public class FacturaProducto {

    private int idProducto;
    private int idFactura;
    private int cantidad;

    public FacturaProducto() {}

    public FacturaProducto(int idProducto, int idFactura, int cantidad) {
        this.idProducto = idProducto;
        this.idFactura = idFactura;
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "FacturaProducto {" +
                "idFactura = " + idFactura +
                ", idProducto = " + idProducto +
                ", cantidad = " + cantidad +
                '}'+"ln\"";
    }
}
