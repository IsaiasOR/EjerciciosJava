package ejerciciosSegundoBloque;

import javax.swing.JOptionPane;

/*
 * En MegaPlaza se hace un 20% de descuento a los clientes
 * cuya compra supere los $300.
 * ¿Cuál será la cantidad que pagará una persona por 
 * su compra?
 */

public class Ejercicio4_2 {

	public float digitalizar() {
		float cant = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a pagar: "));
		return cant;
	}
	
	public void descuento(float cant) {
		if (cant > 300) {
			cant *= 0.20;
			JOptionPane.showMessageDialog(null, "La cantidad a pagar con el descuento es de: " + cant);
		}
		else {
			JOptionPane.showMessageDialog(null, "La cantidad a pagar es de: " + cant);
		}
	}

	public void main(String[] args) {
		float cant = digitalizar();
		descuento(cant);
	}
}
