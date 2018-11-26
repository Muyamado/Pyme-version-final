package instrumentos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import material.Material;
import material.TipoMaterial;

public class InstrumentoViento {
	private LinkedList<Material> materiales;
	
	public InstrumentoViento(LinkedList<Material> materiales) {
		this.materiales = materiales;
	}
	
	public Instrumento crearInstrumentoViento() {
		Scanner scan = new Scanner(System.in);
		Instrumento instrumento = null;
		System.out.println("1.-Flauta\n2.-Trompeta");
		int op = scan.nextInt();
		switch(op) {
		case 1:instrumento = crearFlauta();break;
		case 2:instrumento = crearTrompeta();break;
		}
		return instrumento;
	}

	public Instrumento crearFlauta() {
		System.out.println("Que tipo embocadura:\n1.-Directa\n2.-Indirecta");
		int op = (new Scanner(System.in)).nextInt();
		Flauta f= new Flauta();
		if (op==1) f.setEmbocadura(0);
		else if(op==2) f.setEmbocadura(1);
		
		System.out.println("Eliga material: ");
		Iterator it = materiales.iterator();
		int i = 1;
		//para guardar opciones que se guardan al usuario
		LinkedList<Material> opciones = new LinkedList<Material>();
		while(it.hasNext()) {
			Material mat = (Material) it.next();
			if((mat.getNombre()==TipoMaterial.MADERA) || (mat.getNombre()==TipoMaterial.METAL)) {
				opciones.add(mat);
				System.out.println(i+".-"+mat.getNombre()+" calidad "+mat.getCalidad()+" $"+mat.getPrecio());
				i++;
			}
		}
		op = (new Scanner(System.in)).nextInt();
		f.agregarMaterial(opciones.get(op-1));
		System.out.println("Elija el tipo de instrumento:\n1.-"+TipoInstrumento.AMATEUR+"\n2.-"+TipoInstrumento.PROFESIONAL);
		op = (new Scanner(System.in)).nextInt();
		String tipo = (op==1)?TipoInstrumento.AMATEUR:TipoInstrumento.PROFESIONAL;
		f.setTipo(tipo);
		
		return f;
	}
	
	public Instrumento crearTrompeta() {
		System.out.println("Que tipo de boquilla:\n1.-Forma de C\n2.-Forma en V");
		int op = (new Scanner(System.in).nextInt());
		Trompeta t = new Trompeta();
		if(op==1) t.setBoquilla(0);
		else if(op==2) t.setBoquilla(1);
		
		System.out.println("Eliga material: ");
		Iterator it = materiales.iterator();
		int i = 1;
		
		LinkedList<Material> opciones = new LinkedList<Material>();
		while(it.hasNext()) {
			Material mat = (Material)it.next();
			if((mat.getNombre()==TipoMaterial.BRONCE) || (mat.getNombre()==TipoMaterial.BRONCE)) {
				opciones.add(mat);
				System.out.println(i+".-"+mat.getNombre()+" calidad "+mat.getCalidad()+" $"+mat.getPrecio());
				i++;
			}
		}
		op = (new Scanner(System.in)).nextInt();
		t.agregarMaterial(opciones.get(op-1));
		System.out.println("Elige el tipo de instrumento:\n1.-"+TipoInstrumento.AMATEUR+"\n2.-"+TipoInstrumento.PROFESIONAL);
		op = (new Scanner(System.in)).nextInt();
		String tipo = (op==1)?TipoInstrumento.AMATEUR:TipoInstrumento.PROFESIONAL;
		t.setTipo(tipo);
		
		return t;
	}
	
}
