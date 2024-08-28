package procedimientos;
import java.util.Scanner;
public class Ejemplo5_Vector {
    public static void LlenarVector(int V[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < V.length; i++) {
            System.out.println("Ingrese Elemento " + (i + 1));
            int elemento = sc.nextInt();
            V[i] = elemento;
        }
    }
    public static void MostrarVector(int V[]) {
        for (int i = 0; i < V.length; i++) {
            System.out.print("[" + V[i] + "] ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Tamaño Vector");
        int n = sc.nextInt();
        int A[] = new int[n];        
        LlenarVector(A);
        MostrarVector(A);
    }
}
