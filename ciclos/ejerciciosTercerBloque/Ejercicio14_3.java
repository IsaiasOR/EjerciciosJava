package ejerciciosTercerBloque;
/*
 * Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores
 * de $1000.
 */

import javax.swing.JOptionPane;

public class Ejercicio14_3 {

	public static void main(String[] args) {
		float sueldo;
		float suma = 0;
		int mayores = 0;
		
		for(int i=1; i<=10; i++) {
			sueldo = Integer.parseInt(JOptionPane.showInputDialog("Digite un sueldo: "));
			suma += sueldo;
			if (sueldo > 1000) {
				mayores++;
			}
		}
		
		System.out.println("La suma de los sueldos es: "+suma);
		System.out.println("La cantidad de sueldos mayores a $1000 es: "+mayores);
	}

}
