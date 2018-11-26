package instrumentos;

public abstract class Teclados extends Instrumento{

	private int nOctavas;
	  
	public int getnOctavas() {
		return nOctavas;
	}
	public void setnOctavas(int nOctavas) {
		this.nOctavas = nOctavas;
	}
 
}