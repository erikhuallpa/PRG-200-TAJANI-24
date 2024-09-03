package ordenacion;
import java.util.Random;
import java.util.Scanner;
//Ordenacion Descendentemente
public class MetodoBurbuja2 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {            
            System.out.print("Ingrese Tamaño del Vector_ ");
            n = sc.nextInt();
        } while (n<=0);
        int V[] = new int[n];
        //LlenarVector(V, n);
        LlenarVectorRandom(V, n);
        System.out.println("Vector Original");
        MostrarVector(V, n);  
        
        long tiempoInicial = System.nanoTime();
        OrdenarBubbleSort(V, n);
        long tiempoFinal = System.nanoTime();
        long duracion = (tiempoFinal - tiempoInicial);
       
        System.out.println("\nVector Ordenado");
        MostrarVector(V, n);
        
        System.out.println("\nEl Tiempo de Ejecución es: "+duracion+" nanosegundos");
    }
    public static void LlenarVector(int V[], int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese Elementos "+"_"+(i+1)+" ");
            int ele = sc.nextInt();
            V[i] = ele;
        }
    }
    public static void LlenarVectorRandom(int V[], int n){
        Random random = new Random();
        for (int i = 0; i < n; i++) {            
            V[i]=random.nextInt(n);
        }
    }
    public static void MostrarVector(int V[], int n){        
        for (int i = 0; i < n; i++) {
            System.out.print("["+V[i]+"] ");
        }
    }
    public static void OrdenarBubbleSort(int V[], int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-1); j++) {
                if (V[j]<V[j+1]) {
                    int aux = V[j];
                    V[j] = V[j+1];
                    V[j+1]=aux;
                }
            }
        }
    }       
}