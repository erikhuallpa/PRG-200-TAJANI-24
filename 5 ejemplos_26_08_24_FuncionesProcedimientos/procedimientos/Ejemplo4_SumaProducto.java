package procedimientos;
public class Ejemplo4_SumaProducto {
    public static void Suma(int a, int b){
        int suma = a + b;
        System.out.println("La suma es: "+suma);
    }
    
    public static void Producto(int a, int b){
        int prod = a * b;
        System.out.println("El Producto es: "+prod);
    }
    public static void main(String[] args) {
        Suma(5, 5);
        Producto(5, 5);
    }
}
