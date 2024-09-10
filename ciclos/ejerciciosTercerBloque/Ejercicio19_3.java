package ejerciciosTercerBloque;

import javax.swing.JOptionPane;

/*
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, 
 * condicionados (=4) y suspensos.
 */

public class Ejercicio19_3 {

	public static void main(String[] args) {
		int nota;
		int aprobados=0;
		int condicionados=0;
		int suspensos=0;
		
		for(int i=1; i<=6; i++) {
			do {
				nota = Integer.parseInt(JOptionPane.showInputDialog("Digite una nota: "));
			} while(nota<0 || nota>10); //Mientras los numeros ingresados no están dentro del intervalo de 1-10 el do-while sigue actuando y el contador del ciclo for no avanza
			
			if(nota == 4) {
				condicionados++;
			} else if(nota>=5) {
				aprobados++;
			} else {
				suspensos++;
			}
		}
		System.out.println("Cantidad de aprobados: "+aprobados);
		System.out.println("Cantidad de condicionados: "+condicionados);
		System.out.println("Cantidad de suspensos: "+suspensos);
	}

}
