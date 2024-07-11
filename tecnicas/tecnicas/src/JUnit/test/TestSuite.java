package JUnit.test;

import JUnit.Padron;
import JUnit.Persona;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)

@Suite.SuiteClasses({
        DemoPrecedencia.class,
        PersonaTest.class,
        /*PersonaTest.class,
        PadronTest.class
        */
})

public class TestSuite {
//CLASE VACIA
}