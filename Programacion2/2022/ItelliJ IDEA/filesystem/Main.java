package filesystem;

import filesystem.condiciones.*;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Archivo parcial = new Archivo("parcial", "doc", 1000);
        Archivo recu = new Archivo("recu", "pdf", 4000);
        Archivo prefi = new Archivo("recu", "doc", 6000);

        Carpeta prog2 = new Carpeta("prog2");
        prog2.agregarElemento(parcial);
        prog2.agregarElemento(prefi);
        prog2.agregarElemento(recu);

        Carpeta tudai = new Carpeta("TUDAI");
        tudai.agregarElemento(prog2);
        tudai.agregarElemento(new Archivo("alumnos","xls",200));

        Carpeta raiz = new Carpeta("\\");
        raiz.agregarElemento(tudai);

        Condicion pesoMenor5000 = new CondicionPesoMenor(5000);
        System.out.println(raiz.buscar(pesoMenor5000));

        Condicion nombreR = new CondicionNombreContiene("r");
        System.out.println(raiz.buscar(nombreR));

        System.out.println(raiz.buscar(new CondicionNot(nombreR)));

        Condicion and = new CondicionAnd(new CondicionNot(nombreR),
                new CondicionNot(pesoMenor5000));
        System.out.println(raiz.buscar(and));

        System.out.println(raiz.buscarOrdenado(pesoMenor5000, new ComparadorExtension().reversed()));

        Comparator<Archivo> ext = new ComparadorExtension();
        Comparator<Archivo> nombre = new ComparadorNombre();
        Comparator<Archivo> peso = new ComparadorPeso();

        Comparator<Archivo> nombreYpeso = new ComparadorMultiple(nombre,peso);
        Comparator<Archivo> multiple = new ComparadorMultiple(ext,nombreYpeso);
        System.out.println(raiz.buscarOrdenado new CondicionPesoMenor(10000), multiple));

    }
}
