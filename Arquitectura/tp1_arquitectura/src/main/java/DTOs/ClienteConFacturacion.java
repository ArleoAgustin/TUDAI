package DTOs;

import entities.Cliente;

public class ClienteConFacturacion extends Cliente {

    private double facturacion;

    public ClienteConFacturacion(int id, String nombre, double facturacion) {
        super(id, nombre, null);
        this.facturacion = facturacion;
    }

    @Override
    public String toString() {
        return "cliente {" +
                "id = " + super.getId() +
                " , nombre = '" + super.getNombre() + '\'' +
                " facturacion = " + facturacion + "\n";

    }

}
