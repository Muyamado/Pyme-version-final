package instrumentos;

public abstract class Percusion extends Instrumento{

  private int nTambores;

  public int getTambores() {
	  return nTambores;
  }
  
  public void setTambores(int nuevoT) {
	  nTambores = nuevoT;
  }
}