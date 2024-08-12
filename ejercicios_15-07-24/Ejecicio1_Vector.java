package vector;
public class Ejecicio1_Vector {
    public static void main(String[] args) {
        int vec[]; //Declarar un vector
        vec = new int[5]; //Instanciar vector
        //Llenar o Asignar al Vector
        vec[0]=8;
        vec[1]=71;
        vec[2]=2;
        vec[3]=11;
        vec[4]=66;
        //Mostrar o Extraer Vector
//        int m;
//        m = vec[0];
//        System.out.print(","+m);
//        m = vec[1];
//        System.out.print(","+m);
//        m = vec[2];
//        System.out.print(","+m);
//        m = vec[3];
//        System.out.print(","+m);
//        m = vec[4];
//        System.out.print(","+m);
        //Otra forma
        System.out.print("["+vec[0]+"] ");
        System.out.print(" ["+vec[1]+"] ");
        System.out.print(" ["+vec[2]+"] ");
        System.out.print(" ["+vec[3]+"] ");
        System.out.print(" ["+vec[4]+"] ");
    }
}
