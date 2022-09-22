package ejercicios;
/*
 * Hacer unas modificaciones al ejercicio anterior suponiendo
 * que no se introduce el precio por litro. Solo existen tres
 * productos con precios:
 * 		1- 0,6 $/litro
 * 		2- 3 $/litro
 * 		3- 1,25 €/litro
 */

import javax.swing.JOptionPane;

public class Ejercicio18_3 {

	public static void main(String[] args) {
		int codigo;
		int litros;
		float importeFactura;
		float facturaTotal = 0;
		int litrosArt1 = 0;
		int conteoMas600 = 0;
		final float producto1 = (float) 0.6;
		final int producto2 = 3;
		final float producto3 = (float) 1.25;
		int x;
		
		for(int i=1; i<=5; i++) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° "+i+"\nDigite el código: "));
			litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° "+i+"\nDigite la cantidad en litros: "));
			x = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° "+i+"\nDigite si quiere el producto N°1, N°2 o N°3: "));
			
			if (x == 1) {
				importeFactura = (float) litros * producto1;
			} else if (x == 2) {
				importeFactura = (float) litros * producto2;
			} else {
				importeFactura = (float) litros * producto3;
			}
			
			facturaTotal += importeFactura;
				
			if(codigo == 1) {
				litrosArt1 += litros;
			}
				
			if(importeFactura > 600) {
				conteoMas600++;
			}
		}
			
		System.out.println("Resumen de ventas");
		System.out.println("Facturación total: "+facturaTotal);
		System.out.println("Cantidad en litros vendidos del articulo 1: "+litrosArt1);
		System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
	}

}
