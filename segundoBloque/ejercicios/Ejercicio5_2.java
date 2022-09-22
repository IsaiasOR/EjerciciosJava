package ejercicios;

import javax.swing.JOptionPane;

/*
 * Un obrero necesita calcular su salario semanal, el 
 * cual se obtiene de la siguiente manera:
 * -Si trabaja 40 horas o menos se le paga $16 por hora.
 * -Si trabaja más de 40 horas se le paga $16 por cada una
 * de las primeras 40 horas y $20 por cada hora extra. 
 */
public class Ejercicio5_2 {
	
	public static int digitalizarHs() {
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas"));
		return horas;
	}
	
	public static float calcularSalario(int horas) {
		float salario = 0;
		int horasExtras = 0;
		if (horas <= 40) {
			salario = horas * 16;
		}
		else {
			horasExtras = horas - 40;
			salario = (40 * 16) + (horasExtras * 20);
		}
		return salario;
	}

	public static void main(String[] args) {
		int horas = digitalizarHs();
		float salario = calcularSalario(horas);
		
		JOptionPane.showMessageDialog(null, "El salario total es de: " + salario);
		
	}

}
