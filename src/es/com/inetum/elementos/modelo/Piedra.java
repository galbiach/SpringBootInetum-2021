package es.com.inetum.elementos.modelo;

public class Piedra extends ElementoFactory {

	public Piedra() {
		super("piedra", PIEDRA);
	}
	

	@Override
	public int comparar(ElementoFactory elemento) {
		int numero = elemento.getNumero();
		int resultado;
		
		if (numero == TIJERA) {
			resultado = 1;
			descripcionResultado = "Piedra ganó a Tijera";
		} else if (numero == PAPEL) {
			resultado = -1;
			descripcionResultado = "Piedra perdió contra Papel";
		} else {
			resultado = 0;
			descripcionResultado = "Empate";
		}
		return resultado;
	}
}
