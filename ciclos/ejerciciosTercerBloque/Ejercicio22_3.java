package ejerciciosTercerBloque;
/*
 * Pedir 5 calificaciones de alumnos y decir al final si hay
 * algún suspenso.
 */

import javax.swing.JOptionPane;

public class Ejercicio22_3 {

	public static void main(String[] args) {
		int calificacion;
		boolean haySuspenso = false;
		
		for(int i=1; i<=5; i++) {
			do {
				calificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite una calificación entre 1 y 10: "));
			} while(calificacion<0 || calificacion>10);
			
			if(calificacion < 6) {
				haySuspenso = true;
			}
		}
		
		if(haySuspenso == true) {
			System.out.println("Si existe al menos un alumno suspendido");
		} else {
			System.out.println("No existe ningún alumno suspendido");
		}
	}

}
