import javax.swing.*;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][];
        int nFilas;
        int nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas de la matriz: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas de la matriz: "));

        matriz = new int[nFilas][nCol];

        System.out.println("Digite la matriz: ");
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nCol; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("La matriz es: ");
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nCol; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }
}
