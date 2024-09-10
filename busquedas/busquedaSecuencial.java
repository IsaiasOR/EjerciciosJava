import javax.swing.*;
import java.util.Scanner;

public class busquedaSecuencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[];
        int n;
        int dato;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

        arreglo = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print((i+1) + ". Digite un número: ");
            arreglo[i] = scanner.nextInt();
        }

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));

        //Búsqueda secuencial
        int i = 0;
        boolean band = false;

        while ((i < n) && (!band)) {
            if (arreglo[i] == dato) {
                band = true;
            }
            i++;
        }

        if (!band) {
            JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo");
        } else {
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición " + (i-1));
        }
    }
}
