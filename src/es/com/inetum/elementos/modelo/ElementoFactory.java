package es.com.inetum.elementos.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoFactory {
	
	public static final int PIEDRA = 0;
	public static final int PAPEL = 1;
	public static final int TIJERA = 2;
	
	private static List<ElementoFactory> elementos;
	
	protected String descripcionResultado;
	protected String nombre;
	protected int numero;
	
	
	public ElementoFactory(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
	
	static {
		elementos = new ArrayList<>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
	}
	
	
	public static ElementoFactory getInstance(int num) {
		for (ElementoFactory elemento : elementos)
			if (elemento.isMe(num))
				return elemento;
		
		return null;
	}

	
	public String getDescripcionResultado() {
		return descripcionResultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public boolean isMe(int numero) {
		return this.numero == numero;
	}
	
	public abstract int comparar(ElementoFactory elemento);
}
