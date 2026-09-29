public class EstructurasBasicas {

    public static void main(String[] args) {

        // 1. ejercicio definir variable y asignar nombres

        String nombre = "Abraham";
        String ciudad = "Madrid";
        int edad = 27;


        System.out.println( nombre);
        System.out.println(edad);
        System.out.println( ciudad);


        // 2. ejercicio definir variable puntuacion con valor = 0 y modificarla 3 veces.

        int puntuacion = 0;
        System.out.println("puntuacion: "+ puntuacion);


        puntuacion = 5;
        System.out.println("primera modificacion: "+puntuacion);

        puntuacion = 10;
        System.out.println("segunda modificacion: " +puntuacion);

        puntuacion = 15;
        System.out.println("puntuacion final: "+ puntuacion);

        /*
        3.Define cinco variables con diferentes tipos de datos
         (String, int, boolean, double, char) y muestra tanto su valor como su tipo.
         */

        String str = "Abraham - tipo: string";
        System.out.println("nombre: "+ str + "tipo: string");
        int edad1 = 25;
        System.out.println("edad: "+ edad1 + " tipo: int");
        boolean estudiante = true;
        System.out.println("es estudiante?: "+estudiante + " tipo: boolean");
        double altura = 1.75;
        System.out.println("Altura: "+ altura + " tipo: double");
        char inicial = 'A';
        System.out.println("Inicial: "+ inicial+ " tipo: char");

    }

}
