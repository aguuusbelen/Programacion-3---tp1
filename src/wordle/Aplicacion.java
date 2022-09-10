package wordle;

import java.util.Random;
import java.util.Set;

import javax.swing.JTextField;

public class Aplicacion {

	private String[] palabras;
	private String palabra;
	private Boolean gano;

	public Aplicacion() {
		palabras = new String[4];
		palabras[0] = "CASAS";
		palabras[1] = "CERCA";
		palabras[2] = "CARGA";
		palabras[3] = "CLASE";
		palabra = buscarPalabra();
		gano = false;
		System.out.print(palabra);
	}

	public String buscarPalabra() {
		Random random = new Random();
		int indice = random.nextInt(0, palabras.length);
		return palabras[indice];
	}

	
	public ColorLetra[] verificar2(String letra1, String letra2, String letra3, String letra4, String letra5) {
		String nuevaPalabra = palabra;
		char[] letras = { letra1.charAt(0), letra2.charAt(0), letra3.charAt(0), letra4.charAt(0), letra5.charAt(0) };
		ColorLetra[] valorLetraLista = { ColorLetra.GRIS, ColorLetra.GRIS, ColorLetra.GRIS, ColorLetra.GRIS,
				ColorLetra.GRIS };

		// Reviso cuales letras con las verdes y reemplazo la posicion de la letra en la palabra por un espacio
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] == nuevaPalabra.charAt(i)) {
				valorLetraLista[i] = ColorLetra.VERDE;
				String nuevaPalabraAux = nuevaPalabra.substring(0, i) + '_' + nuevaPalabra.substring(i + 1);
				nuevaPalabra = nuevaPalabraAux;
			}
		}

		// Reviso cuales letras estan en la palabra (amarillo) y reemplazo la posicion de la letra en la palabra por un espacio
		for (int i = 0; i < letras.length; i++) {
			if (valorLetraLista[i] != ColorLetra.VERDE) {
				boolean esAmarillo = false;
				for (int j = 0; j < letras.length; j++) {
					if (letras[i] == nuevaPalabra.charAt(j) && !esAmarillo) {
						esAmarillo = true;
						valorLetraLista[i] = ColorLetra.AMARILLO;
						String nuevaPalabraAux = nuevaPalabra.substring(0, j) + "_" + nuevaPalabra.substring(j + 1);
						nuevaPalabra = nuevaPalabraAux;
					}
				}
			}
		}

		// Por ultimo, verificamos si gano o no
		if (valorLetraLista[0] == ColorLetra.VERDE && valorLetraLista[1] == ColorLetra.VERDE
				&& valorLetraLista[2] == ColorLetra.VERDE && valorLetraLista[3] == ColorLetra.VERDE
				&& valorLetraLista[4] == ColorLetra.VERDE) {
			gano = true;
		}

		return valorLetraLista;
	}

	public Boolean getGano() {
		return gano;
	}

	public String getPalabra() {
		return palabra;
	}

}
