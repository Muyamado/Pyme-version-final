package instrumentos;

public class Bajo extends Cuerdas {
	
	private String pastillas;

	public String getPastillas() {
		return pastillas;
	}

	public void setPastillas(String pastillas) {
		this.pastillas = pastillas;
	}

	public Bajo() {
		setPrecio(90000);
	}
	public Bajo(String tipo,String pastillas,int cuerdas,int trastes){
		this();
		this.nTrastes = trastes;
		this.nCuerdas = cuerdas;
		setTipo(tipo);
		this.pastillas = pastillas;
	}

	@Override
	public void getDescripcion() {
		System.out.println("Bajo "+getTipo()+" de pastillas "+getPastillas());
  }
	
}