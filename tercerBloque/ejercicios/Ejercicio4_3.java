package ejercicios;

import javax.swing.JOptionPane;

/*
 * Pedir números hasta que se teclee uno negativo, y 
 * mostrar cuántos números se han introducido.
 */

public class Ejercicio4_3 {

	public static void main(String[] args) {
		int numero;
		int	contador = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		
		while(numero > 0) {
			System.out.println(numero);
			contador++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		}
		System.out.println("Se han introducido "+contador+" números");
	}

}
