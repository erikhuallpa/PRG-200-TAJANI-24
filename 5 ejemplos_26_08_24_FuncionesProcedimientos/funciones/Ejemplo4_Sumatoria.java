package funciones;
public class Ejemplo4_Sumatoria {
    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static double Potencia(int base, int exponente) {
        double resultado;
        resultado = Math.pow(base, exponente);
        return resultado;
    }
    public static double Sumatoria(int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + Factorial(i) / Potencia(2, i);
        }
        return suma;
    }
    public static void main(String[] args) {        
        System.out.println(" La Sumatoria es: " + Sumatoria(1));
        System.out.println(" La Sumatoria es: " + Sumatoria(2));
        System.out.println(" La Sumatoria es: " + Sumatoria(3));
        System.out.println(" La Sumatoria es: " + Sumatoria(4));        
    }
}
