package comunicacion;

public class Tesis extends Escrito {
	
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen , titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	

	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * 5;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String r = this.resumen() + "\n";
		r += this.idea + "\n";
		r += this.argumentos.length + "\n";
		r += this.conclusion + "\n";
		r += this.referencias;
		return r;
	}
	
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	public String getIdea() {
		return idea;
	}
	
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	
	public String[] getArgumentos() {
		return argumentos;
	}
	
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	
	public String getConclusion() {
		return conclusion;
	}
	
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	
	public String getReferencias() {
		return referencias;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
