package procedimientos;
import java.util.Scanner;
public class Ejemplo6_Matriz {
    public static void LlenarMatriz(int f, int c, int M[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese Elemento " + i + " " + j+":_");
                int elemento = sc.nextInt();
                M[i][j] = elemento;
            }
        }
    }
    public static void MostrarMatriz(int f, int c, int M[][]) {
        for (int i = 0; i < f; i++) {
            System.out.println("");
            for (int j = 0; j < c; j++) {
                System.out.print("[" + M[i][j] + "] ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Fila de la Matriz ");
        int f = sc.nextInt();
        System.out.print("Ingrese Columna de la Matriz ");
        int c = sc.nextInt();
        int M[][] = new int[f][c];
        LlenarMatriz(f, c, M);
        MostrarMatriz(f, c, M);
    }
}
