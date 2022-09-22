package ejercicios;

import javax.swing.JOptionPane;

/*
 * Pedir un número N, y mostrar todos los números del
 * 1 al N.
 */

public class Ejercicio8_3 {

	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un  número: "));
		
		for(int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
	}

}
