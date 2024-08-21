package ejemplos;
public class Ejemplo_8 {
    public static void main(String[] args) {
        //1ra Forma "+"
        String cadena = "Viva";
        String cadena2 = " Bolivar,";                
        System.out.println(cadena + cadena2 + " Campeon... 2024");
        //2da Forma
        String cadena3 = cadena.concat(cadena2);
        System.out.println(cadena3+" Campeon... 2024");
        //Mostrar su nombre completo pero utilizando variables.
        //Usar 3 variables, Nombre, Paterno, Materno.
        String nombre, paterno, materno;
        nombre = "Alejandro ";
        paterno = "Quispe ";
        materno = "Apaza";
        System.out.println(nombre+paterno+materno);
    }
}
