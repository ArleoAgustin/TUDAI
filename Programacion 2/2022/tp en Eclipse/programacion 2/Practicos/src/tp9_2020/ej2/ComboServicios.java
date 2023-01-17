package tp9_2020.ej2;

public class ComboServicios extends Combo {
	
	private final double pesoMax = 300;
	
	public ComboServicios(int nro) {
		super(nro);
	}



	@Override
	public void addEnvio(Envio e) {
		
		if(e.getPeso() <= this.pesoMax)
			this.envios.add(e);

	}

}
