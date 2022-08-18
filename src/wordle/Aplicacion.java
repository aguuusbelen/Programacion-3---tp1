package wordle;

import java.util.Random;

import javax.swing.JTextField;

public class Aplicacion {

	String[] palabras = { "casas", "mundo", "regla", "clase" };
	String palabra = palabra();

	public Aplicacion() {
	}

	public String palabra() {
		Random random = new Random();
		int indice = random.nextInt(0, palabras.length);
		System.out.print(palabras[indice] + palabras[indice].charAt(0));
		return palabras[indice];
	}

	public ColorLetra[] verificar(String letra1, String letra2, String letra3, String letra4, String letra5) {
		ColorLetra[] valorLetraList = { ColorLetra.GRIS, ColorLetra.AMARILLO, ColorLetra.GRIS, ColorLetra.VERDE, ColorLetra.GRIS};
		System.out.print(valorLetraList[0]);
		/*
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(0) == letra1.charAt(0)) {
				valorLetraList[0] = ColorLetra.VERDE;
			} else if (letra1.charAt(0) == palabra.charAt(i) && i != 0) {
				valorLetraList[0] = ColorLetra.VERDE;
			}
		}

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(1) == letra2.charAt(0)) {
				// color verde
			} else if (letra2.charAt(0) == palabra.charAt(i) && i != 1) {
				// cambia color amarillo
			} else {
				// color gris
			}
		}

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(2) == letra3.charAt(0)) {
				// color verde
			} else if (letra3.charAt(0) == palabra.charAt(i) && i != 2) {
				// cambia color amarillo
			} else {
				// color gris
			}
		}

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(3) == letra4.charAt(0)) {
				// color verde
			} else if (letra4.charAt(0) == palabra.charAt(i) && i != 3) {
				// cambia color amarillo
			} else {
				// color gris
			}
		}

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(4) == letra5.charAt(0)) {
				// color verde
			} else if (letra5.charAt(0) == palabra.charAt(i) && i != 4) {
				// cambia color amarillo
			} else {
				// color gris
			}
		}

		if (palabra.charAt(0) == letra1.charAt(0) && palabra.charAt(1) == letra2.charAt(0)
				&& palabra.charAt(2) == letra3.charAt(0) && palabra.charAt(3) == letra4.charAt(0)
				&& palabra.charAt(4) == letra5.charAt(0)) {
			// cambia color verde
			// gana
		}
		*/
		return valorLetraList;
	}

}
