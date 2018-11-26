package instrumentos;

public class Guitarra extends Cuerdas{

	public Guitarra(){
		setPrecio(70000);
	}
	
	public Guitarra(String tipo,int cuerdas,int trastes) {
		super(cuerdas,trastes);
		setPrecio(70000);
		setTipo(tipo);
	}

  @Override
  public void getDescripcion() {
  	
  	System.out.println("Guitarra "+getTipo()+" de "+getCuerdas()+" cuerdas de "+getTrastes()+" trastes");
  }
 
  
}