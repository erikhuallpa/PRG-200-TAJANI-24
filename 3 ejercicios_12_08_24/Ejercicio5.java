package ejercicios_12_08_24;
import java.util.Scanner;
//Generar la serie de pares de un vector usando contador de pares
public class Ejercicio5 {
    public static void main(String[] args) {
        int n, cp;        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Tamaño del Vector");
        n = sc.nextInt();        
        int V[]= new int[n];
        cp = 2;
        for (int i = 0; i < n; i++) {                        
            V[i] = cp;
            cp =  cp + 2;
        }        
        for (int i = 0; i < n; i++) {
            System.out.print("["+V[i]+"] ");            
        }        
    }
}
