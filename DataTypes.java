public class DataTypes {


    public static void main(String[] args) {

        // Tipos de datos primitivos

        int myInt = 29;
        System.out.println(myInt);

        double myDouble = 1.81;
        System.out.println(myDouble);
        // float, long, byte

        char myChar = 'a'; // chars usan comillas simples y solo es un solo caracter
        System.out.println(myChar);

        boolean myBoolean = true;
        System.out.println(myBoolean);

        String myString = "Hola, Java"; // String es un objeto y se usan comillas dobles
        System.out.println(myString);

        // Tipo de dato en tiempo de compilación

        System.out.println(myString.getClass().getSimpleName());

    }
}
