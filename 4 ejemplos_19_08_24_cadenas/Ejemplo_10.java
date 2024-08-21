package ejemplos;
public class Ejemplo_10 {
    public static void main(String[] args) {
        //Otra forma de usar Vectores
        String nombre[] = {"Paula","Leticia","Natalio","Angela","Luordes"};
        for (int i = 0; i < nombre.length; i++) {
            System.out.print("["+nombre[i]+"] ");
        }
        System.out.println("");
        String apellidos[] = {"Alvarez","Aquise","Huacoto","Mamani","Vargas"};
        for (int i = 0; i < apellidos.length; i++) {
            System.out.print("["+apellidos[i]+"] ");
        }
        System.out.println("");
        int edades[] = {15,18,21,21,19};
        for (int i = 0; i < edades.length; i++) {
            System.out.print("["+edades[i]+"] ");
        }
        System.out.println("");
        int ci[] = {13565405,10913980,9105629,15475444,14534125};
        for (int i = 0; i < ci.length; i++) {
            System.out.print("["+ci[i]+"] ");
        }
        System.out.println("");
        double estatura[] = {1.50,1.62,1.68,1.53,1.40};
        for (int i = 0; i < estatura.length; i++) {
            System.out.print("["+estatura[i]+"] ");
        }
    }
}
