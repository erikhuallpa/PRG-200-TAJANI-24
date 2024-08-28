package procedimientos;
public class Ejemplo3_DatosPersonales {
    public static void DatosPersonales(String nombre, String apellido, int edad, double estatura){
        System.out.println("Tu Nombre es: "+nombre);
        System.out.println("Tu Apellido es: "+apellido);
        System.out.println("Tu Edad es: "+edad);
        System.out.println("Tu Estatura es: "+estatura);
        System.out.println("===========================");
    }
    
    public static void main(String[] args) {
        DatosPersonales("Paula", "Alvarez", 18, 1.50);        
        DatosPersonales("Leticia","Aquise",19,1.55);
        DatosPersonales("Natalio","Huacoto",18,1.66);
        DatosPersonales("Gonzalo","Huanaco",20,1.63);
        DatosPersonales("Angy","Ayca",19,1.58);
        DatosPersonales("Luz","Vargas",18,1.56);
    }
}
