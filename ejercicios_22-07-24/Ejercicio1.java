package matriz;
public class Ejercicio1 {
    public static void main(String[] args) {        
        int M[][];//Declaracion de la Matriz       
        M = new int[3][3];//Instanciar        
        M[0][0]=8;//Asignar
        M[0][1]=7;
        M[0][2]=6;
        
        M[1][0]=88;
        M[1][1]=77;
        M[1][2]=66;
        
        M[2][0]=100;
        M[2][1]=200;
        M[2][2]=300;        
        //int m = M[2][2];
        System.out.print("["+M[0][0]+"] \t");
        System.out.print("["+M[0][1]+"] \t");
        System.out.print("["+M[0][2]+"] \n");
        
        System.out.print("["+M[1][0]+"] \t");
        System.out.print("["+M[1][1]+"] \t");
        System.out.print("["+M[1][2]+"] \n");
        
        System.out.print("["+M[2][0]+"] \t");
        System.out.print("["+M[2][1]+"] \t");
        System.out.print("["+M[2][2]+"] \n");                  
    }
}
