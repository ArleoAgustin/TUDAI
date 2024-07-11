package restaurant.tests;

import JUnit.Persona;
import JUnit.test.PersonaTest;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;
import restaurant.Mostrador;
import restaurant.Usuario;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class UsuarioTest {


    static Mostrador mostrador = new Mostrador();

    @Test
    @DisplayName("Probando insertar usuario repetido.")

    public void testAddUsuarioRepetido() throws Exception {


        Usuario u1 = new Usuario("Juan Perez",2, 4200,"juanPe23@gmail.com");
        Usuario u2 = new Usuario("Pedro Gimenez",1,12000,"pedrito@gmail.com");
        Usuario u3 = new Usuario("Maria Colon",2,2600,"mari@gmail.com");
        Usuario u4 = new Usuario("Cecilia Rodriguez",2,6100,"ceci@gmail");


        mostrador.setUsuarios(u1);
        mostrador.setUsuarios(u2);
        mostrador.setUsuarios(u3);
    //    mostrador.setUsuarios(u4);

        // Verificar que no se pueden agregar usuarios duplicados
        Assert.assertTrue("Existe usuario",mostrador.setUsuarios(u4));
    }


    @Test
    @DisplayName("Verificar correo inválido al crear usuario")
    public void testVerificarEmailInvalidoParaCrearUsuario() {
        try {
            new Usuario("Juan Perez", 2, 4200, "juanPe23gmail.com");
            fail("Se creo un usuario con un correo electronico valido, no se probo el test");
        } catch (IllegalArgumentException e) {
            assertEquals("Correo electrónico inválido", e.getMessage());
        }
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After class de UsuarioTest");
    }


}
