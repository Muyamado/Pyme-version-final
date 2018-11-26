package material;

public class Material {

	private String nombre;
	private int precio;
	private int calidad;
	
	public Material(String nombre, int calidad, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.calidad = calidad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nNombre) {
		nombre = nNombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCalidad() {
		return calidad;
	}

	public void setCalidad(int calidad) {
		this.calidad = calidad;
	}
	
}
