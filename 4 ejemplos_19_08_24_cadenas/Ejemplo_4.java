package ejemplos;
public class Ejemplo_4 {
    public static void main(String[] args) {
        String cadena = "LIBROS";    
        String letras = cadena.substring(2, 5);
        System.out.println(cadena + " - su letras es: "+ letras);
        
        letras = cadena.substring(0, 2);
        System.out.println(cadena + " - su letras es: "+ letras);
        
//        String cadena2 = "Hola Mundo";    
//        char letra2 = cadena2.charAt(5);
//        System.out.println(cadena2 + " - su letra es: "+ letra2);
    }
}
