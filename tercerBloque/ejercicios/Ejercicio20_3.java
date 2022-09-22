package ejercicios;

import javax.swing.JOptionPane;

/*
 * Pedir un número N, introducir N sueldos, y mostrar el sueldo
 * máximo.
 */

public class Ejercicio20_3 {

	public static void main(String[] args) {
		int num;
		float sueldo;
		float sueldoMax=0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldos a introducir: "));
		
		for(int i=1; i<=num; i++) {
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite un sueldo: "));
			
			if(sueldo > sueldoMax) {
				sueldoMax = sueldo;
			}
		}
		System.out.println("El sueldo máximo es: "+sueldoMax);
	}

}
