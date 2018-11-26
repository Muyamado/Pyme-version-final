package instrumentos;

public class Piano extends Teclados{

  private int nPedales;
  
  public Piano(int pedales,String tipo,int octavas){
	  setTipo(tipo);
	  setnOctavas(octavas);
	  this.nPedales = pedales;
  }
    
  @Override
  public void getDescripcion() {
	  System.out.println("Piano "+getTipo()+" de "+getnOctavas()+" con "+nPedales+ " pedales");
  }

  public Piano() {
	  setPrecio(300000);
  }

}