package ejercicios;

import javax.swing.JOptionPane;

/*
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad 
 * y la estatura media, la cantidad de alumnos mayores de 
 * 18 años, y la cantidad de alumnos que miden más de 1.75.
 */

public class Ejercicio15_3 {

	public static void main(String[] args) {
		int edad;
		float edadMedia;
		int sumaEdades = 0;
		
		float altura;
		float alturaMedia;
		float sumaAlturas = 0;
		
		int mayores = 0;
		int altura175 = 0;
		
		for(int i=1; i<=5; i++) {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\ndigite su edad: "));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\ndigite su altura: "));
			
			sumaEdades += edad;
			sumaAlturas += altura;
			
			if(edad > 18){
				mayores++;
			}
			if(altura > 1.75) {
				altura175++;
			}
		}
		edadMedia = (float) sumaEdades/5;
		alturaMedia = (float) sumaAlturas/5;
		
		System.out.println("La edad media es: "+edadMedia);
		System.out.println("La altura media es: "+alturaMedia);
		System.out.println("La cantidad de alumnos mayores de 18 años es: "+mayores);
		System.out.println("La cantidad de alumnos que miden más de 1.75 es: "+altura175);
	}

}
