package vector;

import java.util.Scanner;

public class Ejercicio9_Vector {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el Tamaño del Vector  : ");
        n = Integer.parseInt(leer.nextLine());

        boolean vec[] = new boolean[3]; //Instanciar vector
        //Llenar
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese Elemento (" + i + ") ");
            vec[i] = leer.nextBoolean();
        }
        //Mostrar
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + vec[i] + "] ");
        }

    }
}
