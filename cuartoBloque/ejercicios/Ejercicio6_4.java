package ejercicios;
/*
 * Leer los datos correspondiente a dos tablas de 12 elementos
 * numéricos, y mezclarlos en una tercera de la forma:
 * 3 de la tabla A, 3 de la B,
 * otros 3 de A, otros 3 de la B, etc.
 */

public class Ejercicio6_4 {

	public static void main(String[] args) {

		int a[] = new int[12];
		int b[] = new int[12];
		int c[] = new int[24];
		
		for(int i=0; i<12; i++) {
			a[i] = (int)(Math.random()*10+1);
		}
		
		for(int i=0; i<12; i++) {
			b[i] = (int)(Math.random()*10+1);
		}
		
		System.out.println("1er arreglo: ");
		for(int i=0; i<12; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("2do arreglo");
		for(int i=0; i<12; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		int j = 0;
		for(int i=0; i<12; i+=3) {
			c[j] = a[i];
			j++;
			c[j] = a[i+1];
			j++;
			c[j] = a[i+2];
			j++;
			c[j] = b[i];
			j++;
			c[j] = b[i+1];
			j++;
			c[j] = b[i+2];
			j++;
		}
		
		System.out.print("El 3er arreglo es: ");
		for(int i=0; i<24; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
	}

}
