package es.com.inetum.elementos.modelo;

public class Papel extends ElementoFactory {

	public Papel() {
		super("papel", PAPEL);
	}
	

	@Override
	public int comparar(ElementoFactory elemento) {
		int numero = elemento.getNumero();
		int resultado;
		
		if (numero == PIEDRA) {
			resultado = 1;
			descripcionResultado = "Papel ganó a Piedra";
		} else if (numero == TIJERA) {
			resultado = -1;
			descripcionResultado = "Papel perdió contra Tijera";
		} else {
			resultado = 0;
			descripcionResultado = "Empate";
		}
		return resultado;
	}
}
