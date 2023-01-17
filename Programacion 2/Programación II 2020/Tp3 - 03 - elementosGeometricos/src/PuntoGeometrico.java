
public class PuntoGeometrico {
	
	private float x;
	private float y;
	
	public PuntoGeometrico (){
		x = 0;
		y = 0;
	}
	
	public PuntoGeometrico (float pX, float pY){
		x = pX;
		y = pY;
	}
	
	private float obtenerMinValor (float punto){
		float decimal = punto;
		int entero = (int) decimal;
		decimal -= entero;
		if (decimal < 0){
			int cifras = Float.toString(decimal).length();
			float minDecimal = 1;
			while (cifras != 2) {
				minDecimal /= 10;
				cifras--;
			}
			return minDecimal;
		} else {
			return 1;
		}
	}
	
	public void desplazarCordenada ( float coordenadaX, float coordenadaY){
		setX(coordenadaX);
		setY(coordenadaY);
		//x = desplazarPunto(coordenadaX, x);
		//y = desplazarPunto(coordenadaY, y);
	}
	
	public float desplazarPunto (float puntoNuevo,float puntoViejo){
		float minValor = obtenerMinValor(puntoViejo);
		if (puntoNuevo > puntoViejo){
			while (puntoViejo != puntoNuevo){
				puntoViejo += minValor; 
			}
		} else if (puntoNuevo < puntoViejo){
			while (puntoViejo != puntoNuevo){
				puntoViejo -= minValor; 
			}
		}
		
		return puntoViejo;
	}
	
	public float calcularDistanciaEuclidea (PuntoGeometrico punto1){
		float pX1 = x;
		float pY1 = y;
		float pX2 = punto1.getX();
		float pY2 = punto1.getY();
		float aux;

		
		
		
		if (pX1 < 0 && pX2 >= 0){
			pX1 = pX1 * -1 + pX2;
			pX2 = 0;
		} else if (pX1 >= 0 && pX2 < 0){
			pX2 = pX2 * -1 + pX1;
			pX1 = 0;
		} else if (pX1 < 0 && pX2 < 0){
			 pX1 *= -1;
			 pX2 *= -1;
		}
		
		
		if (pY1 < 0 && pY2 >= 0){
			pY1 =pY1 * -1 + pY2;
			pY2 = 0;
		} else if (pY1 >= 0 && pY2 < 0){
			pY2 = pY2 *-1 + pY1;
			pY1 = 0;
		} else if (pY1 < 0 && pY2 < 0){
			pY1 *= -1;
			pY2 *= -1;
		}
		

		if (valorMenor(pX1, pX2) == false){
			aux = pX2;
			pX2 = pX1;
			pX1 = aux;
		}
		
		if (valorMenor(pY1, pY2) == false){
			aux = pY2;
			pY2 = pY1;
			pY1 = aux;
		}
		
		float distanciaEuclidea = (float) Math.sqrt((pX2 - pX1) * (pX2 - pX1) + (pY2 - pY1) * (pY2 - pY1));
		return distanciaEuclidea;
	}
	
	private boolean valorMenor (float p1, float p2){
		if (p1 < p2){
			return true;
		} else {
			return false;
		}
	} 
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
}
