package miPrueba;

import miPrueba.Moodle;
import org.testng.annotations.Test;

public class MoodleMain {

    @Test
    public static void main(String[] args) {

        Moodle m = new Moodle();

        m.initPageFactory();
        m.loadPage();
        m.login();
        m.finishTest();
    }
}
