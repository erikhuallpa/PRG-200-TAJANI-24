package ejemplos;
import java.util.Scanner;
public class Ejemplo_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Tamaño del Vector ");
        int n = Integer.parseInt(sc.nextLine());        
        
        String nombres[] = new String[n];
        //Leer Vector
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre "+(i+1)+" : ");
            nombres[i]=sc.nextLine();
        }
        
        //Mostrar Vector
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("["+nombres[i]+"] ");
        }
        
        String apellidos[] = new String[n];
        //Leer Vector
        System.out.println("");
        for (int i = 0; i < apellidos.length; i++) {
            System.out.print("Apellido "+(i+1)+" : ");
            apellidos[i]=sc.nextLine();
        }        
        //Mostrar Vector
        for (int i = 0; i < apellidos.length; i++) {
            System.out.print("["+apellidos[i]+"] ");
        }
        
        int edades[] = new int[n];
        //Leer Vector
        System.out.println("");
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Edad "+(i+1)+" : ");
            edades[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("");
        //Mostrar Vector
        for (int i = 0; i < edades.length; i++) {
            System.out.print("["+edades[i]+"] ");
        }
        
        int ci[] = new int[n];
        //Leer Vector
        System.out.println("");
        for (int i = 0; i < ci.length; i++) {
            System.out.print("CI "+(i+1)+" : ");
            ci[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("");
        //Mostrar Vector
        for (int i = 0; i < ci.length; i++) {
            System.out.print("["+ci[i]+"] ");
        }
        
        double estatura[] = new double[n];
        //Leer Vector
        System.out.println("");
        for (int i = 0; i < estatura.length; i++) {
            System.out.print("Estatura "+(i+1)+" : ");
            estatura[i]=Double.parseDouble(sc.nextLine());
        }
        System.out.println("");
        //Mostrar Vector
        for (int i = 0; i < estatura.length; i++) {
            System.out.print("["+estatura[i]+"] ");
        }
    }
}
