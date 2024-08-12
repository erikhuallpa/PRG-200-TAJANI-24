package matriz;
public class Ejercicio5 {
    public static void main(String[] args) {        
        String M[][] = new String[4][2];     
        M[0][0]="Natalio";
        M[0][1]="Nati";
        
        M[1][0]="Leticia";
        M[1][1]="Leti";
        
        M[2][0]="Angela";
        M[2][1]="Angy";
        
        M[3][0]="Paula";
        M[3][1]="Pau";               
        System.out.print("["+M[0][0]+"] \t");
        System.out.print("["+M[0][1]+"] \t\n");                
        System.out.print("["+M[1][0]+"] \t");
        System.out.print("["+M[1][1]+"] \t\n");
        System.out.print("["+M[2][0]+"] \t");                
        System.out.print("["+M[2][1]+"] \t\n");
        System.out.print("["+M[3][0]+"] \t");
        System.out.print("["+M[3][1]+"] \t\n");                        
    }
}
