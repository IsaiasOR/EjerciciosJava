package ejerciciosSegundoBloque;
/*
 * Hacer un programa que pase de Kg a otra unidad de medida
 * de masa, mostrar en pantalla un menú con las opciones
 * posibles.
 */
import javax.swing.JOptionPane;

public class Ejercicio14_2 {
	
	

	public static void main(String[] args) {
		double kg = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de Kg: "));
		int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite una opción: \n"
				+ "1. De Kg a tonelada\n"
				+ "2. De Kg a gramo\n"
				+ "3. De Kg a miligramo\n"));
		
		switch(opc) {
			case 1:
				kg_tonelada(kg);
				break;
			case 2:
				kg_gramo(kg);
				break;
			case 3:
				kg_miligramo(kg);
				break;
			default: JOptionPane.showMessageDialog(null,"Opción incorrecta");
		}

	}

	
	private static void kg_miligramo(double kg) {
		double mlg = kg * 1000000;
		JOptionPane.showMessageDialog(null,kg+"kg en miligramo es: "+mlg);
	}
	
	private static void kg_gramo(double kg) {
		double g = kg * 1000;
		JOptionPane.showMessageDialog(null,kg+"kg en gramo es: "+g);
	}
	
	private static void kg_tonelada(double kg) {
		double t = kg / 1000;
		JOptionPane.showMessageDialog(null,kg+"kg en tonelada es: "+t);
	}
}
