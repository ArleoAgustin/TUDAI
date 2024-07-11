package restaurant.tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import restaurant.Ingrediente;
import restaurant.ItemReceta;
import restaurant.Receta;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;

public class RecetaTest {

    static Receta r;


    @BeforeClass
    public static void cargarDatos(){

        Ingrediente ing1 = new Ingrediente("Harina","gr", 10, 500); //control de stock

        r = new Receta("Canelones", 120, 2300);

        r.addIngrediente(new ItemReceta(ing1,1));
    }

    @Test
    public void testUnoOMasIngredientes(){

        Assert.assertTrue("La receta esta compuesta por uno o mas ingredientes", r.getIngredientes().size() >= 1);
    }

    @Test
    public void testExistenTodosLosIngredientes(){

        List<ItemReceta> ingredientes = r.getIngredientes();

        ingredientes.forEach( i -> {

            if (i.getIngrediente().getStock() < 1)
                fail("El ingrediente "+ i.getIngrediente().getNombre() + " se quedo sin stock");
        });


    }
}
