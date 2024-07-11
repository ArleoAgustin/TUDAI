package restaurant.tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import restaurant.*;

import java.util.ArrayList;

public class PedidoTest {

    static Pedido pedido;
    static Usuario usuario;

    @BeforeClass
    public static void cargarDatos(){

        usuario = new Usuario("Agustin Arleo",1,25000, "Aa@gmail.com");
        ProductoBasico p1 = new ProductoBasico("Empanada",300,600);
        ItemPedido i1 = new ItemPedido(6,p1,"en preparacion");
        ArrayList<ItemPedido> items = new ArrayList<>();
        items.add(i1);
        pedido = new Pedido(items, usuario);

    }

    @Test
    public void testReducirSaldoUsuario() throws SinSaldoException {
        float saldoAntes = usuario.getSaldo();
        pedido.solicitarPedido();
        float saldoDespues = usuario.getSaldo();
        Assert.assertTrue(saldoAntes > saldoDespues);
    }
}
