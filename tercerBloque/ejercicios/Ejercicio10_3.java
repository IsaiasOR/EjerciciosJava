package ejercicios;
/*
 * Pedir 10 números y escribir la suma total.
 */

import javax.swing.JOptionPane;

public class Ejercicio10_3 {

	public static void main(String[] args) {
		int num;
		int suma = 0;
		
		for(int i=1; i <= 10; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
			suma += num;
		}
		
		System.out.println("La suma total de los números es: "+ suma);
	}

}
