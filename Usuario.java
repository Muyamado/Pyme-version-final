package CarroCompra;

public class Usuario {

  private int ID;
  private String nombre;
  private Carro miCarro;
  
  public Usuario() {
	  setMiCarro(new Carro());
  }

  public Usuario(int id,String nombre) {
	  this();
	  this.nombre = nombre;
	  this.ID = id;
  }

public Carro getMiCarro() {
	return miCarro;
}

public void setMiCarro(Carro miCarro) {
	this.miCarro = miCarro;
}
}