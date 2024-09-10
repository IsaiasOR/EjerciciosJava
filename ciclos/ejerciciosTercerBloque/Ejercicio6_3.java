package ejerciciosTercerBloque;

import javax.swing.JOptionPane;

/*
 * Pedir números hasta que se teclee un 0, mostrar la
 * suma de todos los números introducidos.
 */

public class Ejercicio6_3 {

	public static void main(String[] args) {
		double numero;
		double suma = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		while(numero != 0) {
			suma += numero;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		}
		
		if(suma == 0) {
			System.out.println("Cancelado");
		} else {
			System.out.println("La suma de los números digitalizados es: "+suma);
		}
	}

}
