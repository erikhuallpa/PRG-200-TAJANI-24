package matriz;
public class Ejercicio3 {
    public static void main(String[] args) {        
        char M[][] = new char[3][3];     
        M[0][0]='a';
        M[0][1]='e';
        M[0][2]='i';
        M[1][0]='o';
        M[1][1]='u';
        M[1][2]='a';
        M[2][0]='e';
        M[2][1]='i';
        M[2][2]='o';        
        System.out.print("["+M[0][0]+"] \t");
        System.out.print("["+M[0][1]+"] \t");                
        System.out.print("["+M[0][2]+"] \t\n");
        System.out.print("["+M[1][0]+"] \t");
        System.out.print("["+M[1][1]+"] \t");                
        System.out.print("["+M[1][2]+"] \t\n");
        System.out.print("["+M[2][0]+"] \t");
        System.out.print("["+M[2][1]+"] \t");                
        System.out.print("["+M[2][2]+"] \t\n");        
    }
}
