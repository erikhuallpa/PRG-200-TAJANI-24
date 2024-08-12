package vector;

import java.util.Scanner;

public class Ejercicio6_Vector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el Tamaño del Vector");
        n = leer.nextInt();
        
        int vec[] = new int[n]; //Instanciar vector
        //Llenar
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese Elemento " +i);
            vec[i] = leer.nextInt();
        }      
        //Mostrar
        for (int i = 0; i < n; i++) {
            System.out.print("["+vec[i]+"] ");
        }                
    }
}
