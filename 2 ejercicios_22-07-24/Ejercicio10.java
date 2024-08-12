package matriz;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);        
        int fil = 2;
        int col = 2;
        String M[][] = new String[fil][col];
        for (int f = 0; f < fil; f++) {
            for (int c = 0; c < col; c++) {
                System.out.print("Ingrese Elemento ["+f+"]["+c+"]_");
                M[f][c] = sc.nextLine();
            }
        }        
        for (int f = 0; f < fil; f++) {
            System.out.println("");
            for (int c = 0; c < col; c++) {
                System.out.print("["+M[f][c]+"]\t");
            }
        }                                 
    }
}
