package ejerciciosSegundoBloque;

import javax.swing.JOptionPane;

/*
 * Hacer un programa que simule un cajero automático con un
 * saldo inicial de 1000 dólares, con el siguiente menú de
 * opciones:
 * 1. Ingresar dinero a la cuenta
 * 2. Retirar dinero de la cuenta
 * 3. Salir
 */

public class Ejercicio13_2 {
	
	public static void ingresarDinero(int saldoInicial, float monto) {
		float saldoActual = saldoInicial + monto;
		JOptionPane.showMessageDialog(null, "El saldo actual es: "+saldoActual);
	}
	
	public static void retirarDinero(int saldoInicial, float monto) {
		if (monto > saldoInicial) {
			JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro");
		} else {
			float saldoActual = saldoInicial - monto;
			JOptionPane.showMessageDialog(null, "El saldo actual es: "+saldoActual); 
		}
	}
	
	public static void salir() {
		JOptionPane.showMessageDialog(null, "Gracias por visitarnos!");
	}

	public static void main(String[] args) {
		final int saldoInicial = 1000;
		int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a su cajero automático\n"
				+ "Digite una opción:\n" 
				+ "1. Ingresar dinero a la cuenta\n"
				+ "2. Retirar dinero de la cuenta\n"
				+ "3. Salir\n"));
		
		switch(opc) {
			case 1:
				float monto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto que quiere ingresar"));
				ingresarDinero(saldoInicial, monto);
				break;
			case 2:
				float monto1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto que quiere retirar"));
				retirarDinero(saldoInicial, monto1);
				break;
			case 3: 
				salir();
				break;
			default: JOptionPane.showMessageDialog(null,"Opción incorrecta");
		}
	}

}
