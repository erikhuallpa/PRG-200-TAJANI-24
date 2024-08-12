package ejercicios_12_08_24;
import java.util.Scanner;
//Generar la serie de pares de un vector usando indice
public class Ejercicio4 {
    public static void main(String[] args) {
        int n, p;        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Tamaño del Vector");
        n = sc.nextInt();        
        int V[]= new int[n];
        
        for (int i = 0; i < n; i++) {            
            p = (i+1) * 2;
            V[i] = p;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("["+V[i]+"] ");            
        }        
    }
}
