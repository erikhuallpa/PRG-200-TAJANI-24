package vector;

import java.util.Scanner;

public class Ejercicio8_Vector {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el Tamaño del Vector  : ");
        n = Integer.parseInt(leer.nextLine());

        char vec[] = new char[3]; //Instanciar vector
        //Llenar
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese Elemento (" + i + ") ");
            vec[i] = leer.nextLine().charAt(0);
        }
        //Mostrar
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + vec[i] + "] ");
        }

    }
}
