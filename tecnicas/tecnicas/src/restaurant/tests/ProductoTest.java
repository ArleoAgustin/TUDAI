package restaurant.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import restaurant.*;

public class ProductoTest {

    public boolean calcularGanancia(float compra, float venta){
        //return (venta-compra > compra*0.2);
        return ((venta-compra)/compra)*100 > 20;
    }

    @Test
    public void testVerificarGanancias(){

        Producto p1 = new ProductoBasico("Canelones", 500, (float) (500 * 1.21));   //con esto se verifica que sea mayor al 20% el precio de venta

        Ingrediente pan = new Ingrediente("Pan", "gr", 10,300);
        Ingrediente carne = new Ingrediente("Carne", "gr", 10,800);
        Receta hamburgesa = new Receta("Hamburgesa", 15, 2);
        hamburgesa.addIngrediente(pan, 1);
        hamburgesa.addIngrediente(carne, 1);

        ProductoElaborado pe1 = new ProductoElaborado("Hamburgesa", (float)(hamburgesa.calcularCosto()*1.21)); //con esto se verifica que sea mayor al 20% el precio de venta
        pe1.setReceta(hamburgesa);
        pe1.setPrecioUnitarioCompra(hamburgesa.calcularCosto());
        Assertions.assertAll(
                () -> Assert.assertTrue("La ganancia de los canelones es mayor al 20%", calcularGanancia(p1.getPrecioUnitarioCompra(), p1.getPrecioUnitarioVenta())),
                ()->Assert.assertTrue("La ganancia de la hamburgesa (producto elaborado) es mayor al 20%", calcularGanancia(pe1.getPrecioUnitarioCompra(), pe1.getPrecioUnitarioVenta()))
        );
    }

    @Test
    public void controlarAumentoStock() {
       // ProductoBasico pBasico = new ProductoBasico("Coca Cola",500, 500);
        Ingrediente ingrediente = new Ingrediente("Pan", "un", 1, 10);
        int stockInicialIngrediente = ingrediente.getStock();
     //   int stockInicialPBasico = pBasico.getStock();
      //  pBasico.reponerStock(10);
        ingrediente.reponerStock(10);
        Assert.assertTrue("Se repuso el stock de "+ingrediente.getNombre(), ingrediente.getStock() > stockInicialIngrediente);
    }
}
