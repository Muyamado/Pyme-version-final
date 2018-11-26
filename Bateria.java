package instrumentos;

public class Bateria extends Percusion{

  private int nPlatillos;
  private int tipo;

  public Bateria(int nPlatillos,int tipo,int tambores) {
	  setTambores(tambores);
	  this.nPlatillos = nPlatillos;
	  this.tipo = tipo;
  }

  @Override
  public void getDescripcion() {
	  String t = (tipo==0)?"Acustica":"Electrica";
	  System.out.println("Bateria "+t+" con "+nPlatillos+" platillos y "+getTambores());
  }
  
  public Bateria() {
	  setPrecio(180000);
  }
  
}