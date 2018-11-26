package instrumentos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import material.Material;
import material.TipoMaterial;

public class InstrumentoPercusion {
	private LinkedList<Material> materiales;
	
	public InstrumentoPercusion(LinkedList<Material>materiales) {
		this.materiales = materiales;
	}
	
	public Instrumento crearInstrumentoPercu() {
		Scanner scan = new Scanner(System.in);
		Instrumento instrumento = null;
		System.out.println("1.-Bateria\n2.-Bongos");
		int op = scan.nextInt();
		
		switch(op) {
			case 1:instrumento = crearBateria();break;
			case 2:
		}
		return instrumento;
	}

	public Instrumento crearBateria() {
		System.out.println("Elige tipo de bateria:\n1.-Acustica\n2.-Electrica");
		
		int op = (new Scanner(System.in)).nextInt();
		Bateria bateria = new Bateria();
		
		if(op==1) bateria.setTipo(TipoInstrumento.ACUSTICA);
		else if (op==2) bateria.setTipo(TipoInstrumento.ELECTRICA);
		
		System.out.println("Elija numero de tambores (5-7):");
		op = (new Scanner(System.in)).nextInt();
		while(op>7 || op<5) {
			System.out.println("Ingrese un numero valido de tambores (5-7): ");
			op = (new Scanner(System.in)).nextInt();
		}
		bateria.setTambores(op);
		
		System.out.println("Elija material de platillos:");
		Iterator it = materiales.iterator();
		int i = 1;
		LinkedList<Material> opciones = new LinkedList<Material>();
		while(it.hasNext()) {
			Material mat = (Material) it.next();
			if((mat.getNombre()==TipoMaterial.BRONCE) || (mat.getNombre()==TipoMaterial.COBRE)) {
				opciones.add(mat);
				System.out.println(i+".-"+mat.getNombre()+" calidad "+mat.getCalidad()+" $"+mat.getPrecio());
				i++;
			}
		}
		op = (new Scanner(System.in)).nextInt();
		bateria.agregarMaterial(opciones.get(op-1));
		
		return bateria;
	}
	
	/*public Instrumento crearBongos() {
		
	}*/
}
