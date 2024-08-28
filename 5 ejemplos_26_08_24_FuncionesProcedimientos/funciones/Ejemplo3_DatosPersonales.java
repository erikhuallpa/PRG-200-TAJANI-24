package funciones;

public class Ejemplo3_DatosPersonales {
    public static String DatosPersonales(String nombre, String apellido, int edad, double estatura){
        String s = "Su Nombre es: "+nombre;
        s += "\nSu Apellido es: "+apellido;
        s += "\nSu Edad es: "+edad;
        s += "\nSu Estatura es: "+estatura;
        s += "\n============================";
        return s;
    }
    
    public static void main(String[] args) {        
        System.out.println(DatosPersonales("Paula","Alavarez",18,1.50));
        System.out.println(DatosPersonales("Leticia","Aquise",19,1.55));
        System.out.println(DatosPersonales("Natalio","Huacoto",18,1.66));
        System.out.println(DatosPersonales("Gonzalo","Huanaco",20,1.63));
        System.out.println(DatosPersonales("Angy","Ayca",19,1.58));
        System.out.println(DatosPersonales("Luz","Vargas",18,1.56));
    }
}
