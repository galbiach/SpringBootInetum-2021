package es.com.inetum.elementos.modelo;

public class Tijera extends ElementoFactory {

	public Tijera() {
		super("tijera", TIJERA);
	}
	

	@Override
	public int comparar(ElementoFactory elemento) {
		int numero = elemento.getNumero();
		int resultado;
		
		if (numero == PAPEL) {
			resultado = 1;
			descripcionResultado = "Tijera ganó a Papel";
		} else if (numero == PIEDRA) {
			resultado = -1;
			descripcionResultado = "Tijera perdió contra Piedra";
		} else {
			resultado = 0;
			descripcionResultado = "Empate";
		}
		return resultado;
	}
}
