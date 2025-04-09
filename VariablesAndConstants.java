import java.util.Arrays;

public class VariablesAndConstants {

    public static void main(String[] args) {

        // Variables

        String name = "Allan";
        System.out.println(name);

        name = "AllanYSalazarG";
        System.out.println(name);

        // name = 29; Error (no podemos cambiar el tipo de dato)

        int age = 29;
        System.out.println(age);

        var email = "allanyudielsalazargarcia@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes

        final String EMAIL = "allanyudielsalazargarcia@gmail.com"; // Constantes se ponen en MAYUSCULAS (buena practica)
        // email = "salazargarciaallanyudiel@gmail.com"; Es constante
        System.out.println(EMAIL);

    }
}
