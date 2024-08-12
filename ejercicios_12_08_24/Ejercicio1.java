package ejercicios_12_08_24;
import java.util.Scanner;
//Realizar la suma de cada elemento del vector
public class Ejercicio1 {
    public static void main(String[] args) {
        int n,s,ele;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Tamaño del Vector");
        n = sc.nextInt();        
        int V[]= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese Elemento "+i);
            ele = sc.nextInt();
            V[i] = ele;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("["+V[i]+"] ");            
        }
        s = 0;
        for (int i = 0; i < n; i++) {
            s = s + V[i];
        }
        System.out.println("La suma es: "+s);
    }
}
