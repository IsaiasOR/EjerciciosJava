package ejercicios;

import javax.swing.JOptionPane;

/*
 * Pedir el día, mes y año de una fecha e indicar
 * si la fecha es correcta. Suponiendo que todos
 * los meses son de 30 días.
 */

public class Ejercicio9_2 {

	int dia;
	int mes;
	int año;

	public Ejercicio9_2(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public static int pedirDia() {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite un día"));
		return dia;
	}

	public static int pedirMes() {
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite un mes"));
		return mes;

	}

	public static int pedirAño() {
		int año = Integer.parseInt(JOptionPane.showInputDialog("Digite un año"));
		return año;
	}

	public static void verificarFecha(int dia, int mes, int año) {
		/*
		if (dia > 30 || dia < 0) {
			JOptionPane.showMessageDialog(null, "El día es incorrecto");
		}
		if (mes > 12 || mes < 0) {
			JOptionPane.showMessageDialog(null, "El mes es incorrecto");
		}
		if (año < 0) {
			JOptionPane.showMessageDialog(null, "El año es incorrecto");
		} else {
			JOptionPane.showMessageDialog(null, "La fecha es correcta");
		}
		*/

		if (dia >= 1 && dia <= 30) {
			if (mes >= 1 && mes <= 12) {
				if (año != 0) {
					JOptionPane.showMessageDialog(null, "La fecha es correcta");
				} else {
					JOptionPane.showMessageDialog(null, "La fecha es incorrecto, año incorrecto");
				}
			} else {
				JOptionPane.showMessageDialog(null, "La fecha es incorrecto, mes incorrecto");
			}

		} else {
			JOptionPane.showMessageDialog(null, "La fecha es incorrecto, día incorrecto");
		}
	}

	public static void main(String[] args) {
		int d = pedirDia();
		int m = pedirMes();
		int a = pedirAño();
		verificarFecha(d, m, a);
	}
}