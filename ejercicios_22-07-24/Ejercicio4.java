package matriz;
public class Ejercicio4 {
    public static void main(String[] args) {        
        boolean M[][] = new boolean[2][3];     
        M[0][0]=true;
        M[0][1]=false;
        M[0][2]=true;
        
        M[1][0]=false;
        M[1][1]=false;
        M[1][2]=true;
        
        System.out.print("["+M[0][0]+"] ");
        System.out.print("["+M[0][1]+"] ");                
        System.out.print("["+M[0][2]+"] \n");
        
        System.out.print("["+M[1][0]+"] ");
        System.out.print("["+M[1][1]+"] ");                
        System.out.print("["+M[1][2]+"] \n");         
    }
}
