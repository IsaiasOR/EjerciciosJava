package ejerciciosSegundoBloque;

import javax.swing.JOptionPane;

/*
 * Hacer un programa que lea un carácter por
 * teclado y compruebe si es una letra
 * mayúscula.
 */

public class Ejercicio3_2 {
	
	public static void main(String[] args) {
		char letra = digitarLetra();
		esMayuscula(letra);
	}
	
	public static char digitarLetra() {
		char letra = JOptionPane.showInputDialog("DIgite una letra: ").charAt(0);
		return letra;
	}
	
	public static void esMayuscula(char letra) {
		if (Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
		} 
		else {
			JOptionPane.showMessageDialog(null, "Es una letra minúscula");
		}
	}
}
