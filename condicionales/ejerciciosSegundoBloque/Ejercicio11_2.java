package ejerciciosSegundoBloque;

import javax.swing.JOptionPane;

/*
 * Construir un programa que simule el funcionamiento de una
 * calculadora que puede realizar las 4 operaciones aritméticas
 * básicas(suma, resta, producto y división) con valores numéricos
 * enteros. El usario debe especificar la operación de la línea
 * de comandos: S o s para la suma, R o r para la resta, P,p, M o m
 */

public class Ejercicio11_2 {
	
	public static int pedirNum() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		return num;
	}

	public static void realizarOperacion() {
		int suma, resta, div, mult;
		
		int num1 = pedirNum();
		char operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar: ").charAt(0);
		int num2 = pedirNum();
		
		switch(operacion) {
			case 's':
			case 'S':
			case '+': suma = num1 + num2;
				JOptionPane.showMessageDialog(null, "La suma es: "+suma);
				break;
			case 'r':
			case 'R':
			case '-': resta = num1 - num2;
				JOptionPane.showMessageDialog(null, "La suma es: "+resta);
				break;
			case 'm':
			case 'M':
			case 'p':
			case 'P':
			case '*': mult = num1 * num2;
				JOptionPane.showMessageDialog(null, "La suma es: "+mult);
				break;
			case 'd':
			case 'D':
			case '/': div = num1 / num2;
				JOptionPane.showMessageDialog(null, "La suma es: "+div);
				break;
			default : JOptionPane.showInputDialog("Error, se equivocoó de operación"); 
		}
	}
	
	public static void main(String[] args) {
		realizarOperacion();
	}

}
