package CarroCompra;

import java.util.Iterator;
import java.util.LinkedList;

import instrumentos.Instrumento;

public class Carro {

  public LinkedList<Instrumento> instrumentos;
  
  public Carro() {
	  instrumentos = new LinkedList<Instrumento>();
  }
  
  public int calculeTotal() {
	  int total = 0;
	  Iterator it = instrumentos.iterator();
	  while (it.hasNext()) {
		  /* Instrumento i = (Instrumento) it.next();
		  total += i.getPrecio() */
		  total += ( (Instrumento) (it.next() ) ).getPrecio();
	  }
	  
	  return total;
	  
  }
  
}