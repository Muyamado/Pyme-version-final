package instrumentos;

public class Bongos extends Percusion{

  private int diametro;

  public Bongos(int diametro,int tambores) {
	  setTambores(tambores);
	  this.diametro = diametro;
  }
  
  public int getDiametro() {
	  return diametro;
  }
  
  public void setDiametro(int nDiametro) {
	  diametro = nDiametro;
  }
  
  @Override
  public void getDescripcion() {
	  System.out.println(getTambores()+" bongos de "+diametro+" diemetro");
	
  }
  
  public Bongos() {
	  setPrecio(60000);
  }
  
}