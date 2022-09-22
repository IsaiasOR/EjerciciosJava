package ejercicios;

import javax.swing.JOptionPane;

/*
 * Pedir una nota de 0 a 10 y mostrarla de la forma:
 * Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
 */

public class Ejercicio12_2 {
	
	public static int pedirNota() {
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota"));
		return nota;
	}
	
	public static void mostrarNota(int nota) {
		if (nota >= 0 && nota <= 5) {
			JOptionPane.showMessageDialog(null, "Insuficiente");
		} else {
			if (nota == 6) {
				JOptionPane.showMessageDialog(null, "Suficiente");
			} else {
				if (nota == 7) {
					JOptionPane.showMessageDialog(null, "Bien");
				} else {
					if (nota == 8 || nota == 9) {
						JOptionPane.showMessageDialog(null, "Notable");
					} else {
						JOptionPane.showMessageDialog(null, "Sobresaliente");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int nota = pedirNota();
		mostrarNota(nota);
	}

}
