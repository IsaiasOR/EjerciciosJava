package ejerciciosTercerBloque;

import javax.swing.JOptionPane;

/*
 * Una empresa que se dedica a la venta de desinfectantes 
 * necesita un programa para gestionar las facturas. En cada 
 * factura figura: el código del artículo, la cantidad 
 * vendida en litros y el precio por litro. Se pide de 5 
 * facturas introducidas: 
 * Facturación total, cantidad en litros vendidos del 
 * artículo 1 y cuantas facturas se emitieron de más de $600.
 */

public class Ejercicio17_3 {

	public static void main(String[] args) {
		int codigo;
		int litros;
		float precioXlitro;
		float importeFactura;
		float facturaTotal = 0;
		int litrosArt1 = 0;
		int conteoMas600 = 0;
		
		for(int i=1; i<=5; i++) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° "+i+"\nDigite el código: "));
			litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° "+i+"\nDigite la cantidad en litros: "));
			precioXlitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N° "+i+"\nDigite el precio por litro: "));
			
			importeFactura = (float) litros * precioXlitro;
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
		System.out.println("Cantidad en litros vendidos  del articulo 1: "+litrosArt1);
		System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
	}

}
