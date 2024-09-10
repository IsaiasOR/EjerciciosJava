package ejerciciosSegundoBloque;

import javax.swing.JOptionPane;

/*
 * Pedir el día, mes y año de una fecha e indicar
 * si la fecha es correcta. Con meses de 28, 30 y 31.
 * Sin años bisiestos.
 */
public class Ejercicio10_2 {

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
		if (mes == 2 && dia > 28) {
			JOptionPane.showMessageDialog(null, "El mes de febrero no puede traer más de 28 días");
		} 
		else {
			if ((mes == 4 || mes == 6 || mes == 9) && (dia > 30)) {
				JOptionPane.showMessageDialog(null, "Días incorrectos, no pueden tener más de 30 días");
			}
			else { 
				if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 ||
						mes == 11 || mes == 12) && (dia > 31)) {
					JOptionPane.showMessageDialog(null, "Días incorrectos, no pueden tener más de 31 días");
				}
				else {
					if (mes > 12 || mes < 0) {
						JOptionPane.showMessageDialog(null, "El mes es incorrecto");
					}
					else {
						if (año < 0) {
							JOptionPane.showMessageDialog(null, "El año es incorrecto");
						}
						else {
							JOptionPane.showMessageDialog(null, "La fecha es correcta");

						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int d = pedirDia();
		int m = pedirMes();
		int a = pedirAño();
		verificarFecha(d, m, a);
	}
}
