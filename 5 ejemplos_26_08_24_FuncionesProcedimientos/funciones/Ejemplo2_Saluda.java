package funciones;

public class Ejemplo2_Saluda {
    public static String Saluda(String nombre){
        String s = "Hola "+nombre+" - PRG-200";        
        return s;
    }
    public static void main(String[] args) {        
        System.out.println(Saluda("Paula"));
        System.out.println(Saluda("Leticia"));
        System.out.println(Saluda("Natalio"));
        System.out.println(Saluda("Gonzalo"));
        System.out.println(Saluda("Angy"));
        System.out.println(Saluda("Luz"));
    }
}
