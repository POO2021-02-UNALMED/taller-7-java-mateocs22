package comunicacion;


public class Alfabeto extends Pictograma {
 
	static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion= interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String cadena =  letras[0];
		for(int i = 1; i < letras.length; i++) {
			cadena +=  ", " + letras[i];
		}
		return cadena;
	
	}
	
	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	
	public String[] getLetras() {
		return letras;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
