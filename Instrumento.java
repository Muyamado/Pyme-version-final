package instrumentos;

import java.util.LinkedList;

import material.Material;

public abstract class Instrumento {
  private String tipo;
  private int precio;
  private LinkedList<Material> materiales = new LinkedList<Material>();

  public abstract void getDescripcion();

  public int getPrecio() {
	  return precio;
  }
	
  public void setPrecio(int precio) {
	  this.precio = precio;
  }

  public void agregarMaterial(Material material) {
	  materiales.add(material);
  }

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}
  
}