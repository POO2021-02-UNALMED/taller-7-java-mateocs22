package comunicacion;

public class Periodico extends Escrito {
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen , titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * 10 * palabrasPagina;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String r = this.resumen() + "\n";
		r += this.fecha + "\n";
		r += this.primicia;
		return r;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	
	public String getPrimicia() {
		return primicia;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
}
