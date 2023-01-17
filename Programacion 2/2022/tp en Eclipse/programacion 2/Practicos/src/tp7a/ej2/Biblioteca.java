package tp7a.ej2;

import java.util.ArrayList;

import tp7a.ej2.condicion.Condicion;

public class Biblioteca {
	
	private ArrayList<Documento> documentos;
	
	public Biblioteca() {
		this.documentos = new ArrayList<>();
	}

	public ArrayList<Documento> getDocumentos() {
		return new ArrayList<>(documentos);
	}

	public void addDocumento(Documento documento) {
		this.documentos.add(documento);
	}
	
	public ArrayList<Documento> buscarDocumentos(Condicion c){
		
		ArrayList<Documento> docs = new ArrayList<>();
		
		for(Documento d: this.documentos) {
			if(c.cumple(d)) {
				docs.add(d);
			}
		}
		return docs;
		
	}

	@Override
	public String toString() {
		return "Biblioteca [documentos=" + documentos + "]";
	}
	
	
}
