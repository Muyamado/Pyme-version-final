package instrumentos;

public class PianoDigital extends Teclados{

  private int sensibilidad;

  public PianoDigital(int sensibilidad,String tipo,int octavas) {
	setTipo(tipo);
	setnOctavas(octavas);
	this.sensibilidad = sensibilidad;
}
 
  @Override
  public void getDescripcion() {
	  String s = (sensibilidad == 0)?"a presión":"sin presión";
	  System.out.println("Piano "+getTipo()+" de "+getnOctavas()+" octavas con teclas: "+s);
  }

  public PianoDigital() {
	  setPrecio(150000);
  }
}