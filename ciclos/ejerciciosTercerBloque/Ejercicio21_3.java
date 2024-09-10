package ejerciciosTercerBloque;
/*
 * Pedir 10 números, y mostrar al final si se ha 
 * introducido alguno negativo.
 */

import javax.swing.JOptionPane;

public class Ejercicio21_3 {

	public static void main(String[] args) {
		int num;
		boolean hayNegativos = false;
		
		for(int i=1; i<=10; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
			
			if(num < 0) {
				hayNegativos = true;
			}
		}
		
		if(hayNegativos == true) {
			System.out.println("Si existe al menos un número negativos");
		} else {
			System.out.println("No existe ningún número negativo");
		}
	}

}
