public class Operators {

    public static void main(String[] args) {

        // Operadores

        // Aritmeticos

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        a -= 2;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        // Comparación (Relacionales)

        System.out.println(a == b); // Igualdad
        System.out.println(a == 5);
        System.out.println(a != b); // Desigualdad
        System.out.println(a > b); // Mayor
        System.out.println(a >= b); // Mayor o igual
        System.out.println(a < b); // Menor
        System.out.println(a <= b); // Menor o igual

        // Lógicos

            // AND
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);

            // OR
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

            // NOT

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(3 > 2) || 5 == 2);

        // Unarios

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}
