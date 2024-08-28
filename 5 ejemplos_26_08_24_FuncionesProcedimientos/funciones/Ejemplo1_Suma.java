package funciones;
public class Ejemplo1_Suma {
    public static int Suma1(int a, int b){
        int s;
        s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        //1ra Forma
        int s = Suma1(5,5);
        System.out.println("La suma es: "+s);
        //2da forma
        System.out.println("La suma es: "+Suma1(9,3));
        System.out.println("La suma es: "+Suma1(15,9));
        System.out.println("La suma es: "+Suma1(55,53));
    }
}
