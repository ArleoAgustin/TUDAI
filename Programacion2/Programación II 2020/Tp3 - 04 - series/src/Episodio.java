  class Episodio{
    
  	private String titulo; 
    private String descripcion; 
    private boolean visto; 
    private int calificacion;
    
    private String []tituloParte1 = {"Caballo ", "Amor ", "Odio ", "Desesperados ", "agua intranquila ", "Horno ", "Zapatoos sucios ", "Porcelana"};
    private String []tituloParte2 = {"por odio ", "y humedad ", "y silencio ", "por un poco de moyonesa ", "y sin papel higenico ", "por cemento ", " pintura probablemente violeta"};
    private String []tituloParte3 = {"sangrita", "amoroso", "extrañoble", "abrasable", "pesado", "violetardo", "sudoroso"};
    
    public Episodio (){
    	titulo = obtenerTitulo();
    	descripcion = "Ni en Nexflix llegarian a tanto";
    	visto = true;
    	calificacion = (int) ((Math.random()*6)+1);
    }

    public Episodio (String titulo){
    	this.titulo = titulo;
    	descripcion = "Ni en Nexflix llegarian a tanto";
    	visto = true;
    	calificacion = (int) ((Math.random()*6)+1);
    }
        
    public Episodio (String nuevoTitulo, String nuevoDescripcion){
    	titulo = nuevoTitulo;
    	descripcion = nuevoDescripcion;
    	visto = true;
    	calificacion = (int) ((Math.random()*6)+1);
    }
    
    public Episodio (String nuevoTitulo, String nuevoDescripcion, boolean estaVisto){
    	titulo = nuevoTitulo;
    	descripcion = nuevoDescripcion;
    	visto = estaVisto;
    	calificacion = (int) ((Math.random()*6)+1);
    }
    
    public Episodio (String nuevoTitulo, String nuevoDescripcion, boolean estaVisto, int nuevaCalificacion){
    	titulo = nuevoTitulo;
    	descripcion = nuevoDescripcion;
    	visto = estaVisto;
    	calificacion = nuevaCalificacion;
    }

    private String obtenerTitulo() {
		return (tituloParte1[(int) ((Math.random()*7)-1)]+
				tituloParte2[(int) ((Math.random()*7)-1)]+
				tituloParte3[(int) ((Math.random()*7)-1)]);
	}

	public void darCalificacion (int puntos){
      if (puntos > 5 || puntos < 1){
        System.out.println("Solo se puede ingresar valores entre 1 y 5 inculisives");
      } else {
        calificacion = puntos;
      }
    }
    
    

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
  }