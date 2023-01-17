package parcial2022;

import parcial2022.Filtros.Filtro;

import java.util.ArrayList;

public class Noticia extends ElementoNoticia{
    private String contenido;
    private String titulo;
    private String autor;
    private String categoria;
    private ArrayList<String> palabrasClaves;

    public Noticia(String contenido, String titulo, String autor, String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabrasClaves = new ArrayList<String>();
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void addPalabrasClave(String palabra){
       this.palabrasClaves.add(palabra);
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String>(palabrasClaves);
    }

    public ArrayList<Noticia> buscar(Filtro filtro){
        ArrayList<Noticia> resultado =new ArrayList<>();
        if (filtro.cumple(this))
            resultado.add(this);
        return resultado;
    }



}
