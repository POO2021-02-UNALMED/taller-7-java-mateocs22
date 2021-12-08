package comunicacion;

public class Fabula extends Escrito {
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen , titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * palabrasPagina; 
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String r= this.resumen() + "\n";
		r += this.ensenanza;
		return r;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
