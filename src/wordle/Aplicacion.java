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

	public ColorLetra[] verificar(String letra1, String letra2, String letra3, String letra4, String letra5) {

		ColorLetra[] valorLetraList = { ColorLetra.GRIS, ColorLetra.GRIS, ColorLetra.GRIS, ColorLetra.GRIS,
				ColorLetra.GRIS };

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(0) == letra1.charAt(0)) {
				valorLetraList[0] = ColorLetra.VERDE;
			} else if (letra1.charAt(0) == palabra.charAt(i) && i != 0) {
				valorLetraList[0] = ColorLetra.AMARILLO;
			}
		}

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(1) == letra2.charAt(0)) {
				valorLetraList[1] = ColorLetra.VERDE;
			} else if (letra2.charAt(0) == palabra.charAt(i) && i != 1) {
				valorLetraList[1] = ColorLetra.AMARILLO;
			}
		}

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(2) == letra3.charAt(0)) {
				valorLetraList[2] = ColorLetra.VERDE;
			} else if (letra3.charAt(0) == palabra.charAt(i) && i != 2) {
				valorLetraList[2] = ColorLetra.AMARILLO;
			}
		}

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(3) == letra4.charAt(0)) {
				valorLetraList[3] = ColorLetra.VERDE;
			} else if (letra4.charAt(0) == palabra.charAt(i) && i != 3) {
				valorLetraList[3] = ColorLetra.AMARILLO;
			}
		}

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(4) == letra5.charAt(0)) {
				valorLetraList[4] = ColorLetra.VERDE;
			} else if (letra5.charAt(0) == palabra.charAt(i) && i != 4) {
				valorLetraList[4] = ColorLetra.AMARILLO;
			}
		}

		if (palabra.charAt(0) == letra1.charAt(0) && palabra.charAt(1) == letra2.charAt(0)
				&& palabra.charAt(2) == letra3.charAt(0) && palabra.charAt(3) == letra4.charAt(0)
				&& palabra.charAt(4) == letra5.charAt(0)) {
			gano = true;
		}

		return valorLetraList;
	}

	public Boolean getGano() {
		return gano;
	}

}
