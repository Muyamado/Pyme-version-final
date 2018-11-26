package instrumentos;

public class Flauta extends Viento{

  private int embocadura;
  
  public int getEmbocadura() {
	  return embocadura;
  }
  
  public void setEmbocadura(int nEmbocadura) {
	  embocadura = nEmbocadura;
  }

  @Override
  public void getDescripcion() {	
	  String x = (embocadura==0)?"Directa":"Indirecta";
	  System.out.println("Flauta con embocadura "+x);
	  
  }	
  
  public Flauta() {
	  setPrecio(65000); 
  }

}