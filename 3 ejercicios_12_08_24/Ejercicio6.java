package ejercicios_12_08_24;//Realizar la suma de cada elemento de la Matriz
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int n,s,ele;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Tamaño del Matriz (n*n) ");
        n = sc.nextInt();        
        int M[][]= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese Elemento "+i+"-"+j+": ");
                ele = sc.nextInt();
                M[i][j] = ele;
            }            
        }
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("["+M[i][j]+"] ");
            }            
        }
        s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s = s + M[i][j];
            }            
        }
        System.out.println("La suma es: "+s);
    }
}
