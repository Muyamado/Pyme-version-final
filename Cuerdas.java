package instrumentos;

public abstract class Cuerdas extends Instrumento{

  protected int nCuerdas;
  protected int nTrastes;

  public Cuerdas() {}
  
  public Cuerdas(int cuerdas, int trastes) {
	  setCuerdas(cuerdas);
	  setTrastes(trastes);
}

public int getCuerdas() {
	  return nCuerdas;
  }
  	
  public void setCuerdas(int cuerdas) {
	  nCuerdas = cuerdas;
  }
  
  public int getTrastes() {
	  return nTrastes;
  }
  
  public void setTrastes(int trastes) {
	  nTrastes = trastes;
  }
  
}