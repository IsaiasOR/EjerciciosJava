package ejercicios;

import javax.swing.JOptionPane;

/*
 * Pedir un número entre 0 y 99.999 y decir cuántas cifras tiene.
 */
public class Ejercicio8_2 {
	
	public static int pedirNum() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
		return num;
	}
	
	public static void contarCifras(int num) {
		if (num < 0 || num > 99999) {
			JOptionPane.showMessageDialog(null, "Número no autorizado");
		} else {
			if(num >= 0 && num < 10) {
				JOptionPane.showMessageDialog(null, "El número tiene una cifra");
			}
			if(num >= 10 && num < 100) {
				JOptionPane.showMessageDialog(null, "El número tiene dos cifra");
			}
			if(num >= 100 && num < 1000) {
				JOptionPane.showMessageDialog(null, "El número tiene tres cifra");
			}
			if(num >= 1000 && num < 10000) {
				JOptionPane.showMessageDialog(null, "El número tiene cuatro cifra");
			}
			if(num >= 10000 && num <= 99999) {
				JOptionPane.showMessageDialog(null, "El número tiene cinco cifra");
			}
		}
	}

	public static void main(String[] args) {
		int num = pedirNum();
		contarCifras(num);
	}

}
