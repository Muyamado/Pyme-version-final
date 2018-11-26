package instrumentos;

public class Trompeta extends Viento{

  private int boquilla;

  public int getBoquilla() {
	return boquilla;
  }

  public void setBoquilla(int nBoquilla) {
	boquilla = nBoquilla;
  }

  @Override
  public void getDescripcion() {
	  String x = (boquilla==0)?"C":"V";
	  System.out.println("trompeta boquilla tipo "+x);
  }
  
  public Trompeta(){
	  setPrecio(100000);
  }
  
}