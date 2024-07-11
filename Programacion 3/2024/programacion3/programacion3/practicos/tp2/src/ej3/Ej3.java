package ej3;

public class Ej3 {

    public Ej3() {
    }

    public String convertirABinario(int cociente){

        if (cociente == 0)
            return "0";

        if (cociente == 1)
            return "1";

        int cocienteR = cociente / 2;
        int resto = cociente % 2;

        String result = convertirABinario(cocienteR);

        return result + resto;

    }
}
