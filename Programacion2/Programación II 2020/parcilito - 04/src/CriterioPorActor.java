
public class CriterioPorActor extends Criterio{
	private String actor;
	public CriterioPorActor(String actor) {
		this.actor = actor;
	}
	
	public boolean cumple(Pelicula p) {
		return p.tenesActor(actor);
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
}
