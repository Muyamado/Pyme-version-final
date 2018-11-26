package Main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import CarroCompra.Carro;
import CarroCompra.Usuario;
import instrumentos.*;
import material.Material;
import material.TipoMaterial;

public class ProgramaPrincipal {
	
	public static LinkedList<Material>materiales = new LinkedList<Material>();
	
	public static void main(String[] args) {
		boolean exit = false;
		Scanner scan = new Scanner(System.in);
		//creacion de catalogo y mostrar descripcion de los instrumentos del catalogo
		LinkedList<Instrumento> catalogo = crearCatalogo();
		crearMateriales();
		Iterator<Instrumento> it = catalogo.iterator();
		while (it.hasNext()) {
			Instrumento i = (Instrumento) it.next();
			//System.out.print("1.-");
			System.out.print("$"+i.getPrecio()+" ");
			i.getDescripcion();			
		}
		//creacion del carro y se agrega instrumento del catalogo
		//Carro c = new Carro();
		//c.instrumentos.add(catalogo.getFirst());
		//int totalCompra = c.calculeTotal();
		
		 
		System.out.println("Ingrese su rut: ");
		int id = scan.nextInt();
		System.out.println("Ingrese su nombre: ");
		String nombre = scan.next();
		
		Usuario usuario = new Usuario(id,nombre);
		do {
			System.out.println("que desea hacer?\n1.-Crear Instrumento\n2.-Elegir del catalogo\n3.-Salir");
			int op = scan.nextInt();
			
			switch(op) {
			case 1:	Instrumento i = crearInstrumento();
					usuario.getMiCarro().instrumentos.add(i);
					break;
			case 2:
			case 3:exit = true;break;
			}
			
		}while(!exit);
		
		
	}

	private static Instrumento crearInstrumento() {
		Scanner scan = new Scanner(System.in);
		Instrumento i = null; 
		System.out.println("Que instrumento quiere:\n1.-Viento\n2.-Cuerda\n3.-Percusion\n4.-Teclados");
		int op = scan.nextInt();
		switch(op) {
		case 1:	i = new InstrumentoViento(materiales).crearInstrumentoViento();break;
		case 2:break;
		case 3:break;
		case 4:break;
		}
		return i;
	}

	public static LinkedList<Instrumento> crearCatalogo(){
		LinkedList<Instrumento> catalogo = new LinkedList<Instrumento>();
		
		Guitarra guitarra1 = new Guitarra(TipoInstrumento.ACUSTICA,6,21);
		//System.out.println("Prueba: ");
		catalogo.add(guitarra1);
		Bajo bajo1 = new Bajo(TipoInstrumento.ELECTRICO,TipoInstrumento.ACTIVA,6,18);
		catalogo.add(bajo1);
		
		return catalogo;
	}
	
	public static void crearMateriales(){
		//Guitarras
		Material materialM1 = new Material(TipoMaterial.MADERA,1,450000);
		materiales.add(materialM1);
		Material material2 = new Material(TipoMaterial.MADERA,2,250000);
		materiales.add(material2);
		Material material3 = new Material(TipoMaterial.MADERA,3,120000);
		materiales.add(material3);
		//Trompeta
		Material material4 = new Material(TipoMaterial.BRONCE,1,300000);
		materiales.add(material4);
		Material material5 = new Material(TipoMaterial.BRONCE,2,250000);
		materiales.add(material5);
		Material material6 = new Material(TipoMaterial.BRONCE,3,180000);
		materiales.add(material6);
		//PianoDigital
		Material material7 = new Material(TipoMaterial.PLASTICO,0,120000);
		materiales.add(material7);
		//Platillos
		Material material8 = new Material(TipoMaterial.COBRE,1,230000);
		materiales.add(material8);
		Material material9 = new Material(TipoMaterial.COBRE,2,180000);
		materiales.add(material9);
		Material material10 = new Material(TipoMaterial.COBRE,3,120000);
		materiales.add(material10);
		//Cuerdas
		Material material11 = new Material(TipoMaterial.NYLON,1,5000);
		materiales.add(material11);
		Material material12 = new Material(TipoMaterial.METAL,1,10000);
		materiales.add(material12);
	}
	
}
