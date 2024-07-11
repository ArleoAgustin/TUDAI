package automation;

public class GoogleSearchMain {
    public static void main(String[] args) {
        GoogleSearch buscador = new GoogleSearch();
        buscador.launchBrowser();
        buscador.launchTest();
        // Para observar lo sucedido, se puede comentar la siguiente llamada asi no se cierra
        buscador.closeDriver();
    }
}

