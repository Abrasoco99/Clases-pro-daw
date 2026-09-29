import java.util.Scanner;

public class Teoria {

    /**
     * Clase dedicada a la ejecucion del programa
     */
    // comienzo de clase
    // para definir metodos
    /*
    Probando linea multiple para escribir
    con dos lineas

     */

    // TODO Prestar atencion a las clases del profesor Borja
    public static void main(String[] args) {

        System.out.println("Mi primer programa");
        //VARIABLES:
        // variable sirve para guardar un dato y utlizarlo -> tipo, vombre de variable y valor
        // segun tel tipo de dato que guardo: palabras/numeros/ boolean
        // segun el origen del dato que tengo guardado: primitivos / complejos
        // Segun su posibilidad de cambiar el valor: mutables/no mutable(constante)
        //Segun su scope- de clase o metodo

        final String DNI = "123A";
        System.out.println(DNI);
        String nombre = "Abraham";
        String apellidos = "Socorro";
        String apellidos1 = "Liria";
        char letra = 'A';
        int edad = 27;
        double altura = 1.80;
        float alturafloat = 1.80f;
        boolean acierto = false;
        //clase padre de java que engloba todo
        Object cosa = 1;


        //byte, short, long guardar numeros
        //%s -> palabra
        // %d -> numero sin decimales
        // %f -> numero con decimales
        System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años", nombre, apellidos, apellidos1, edad);

        //Scanner permite realizar lecturas por teclado

        Scanner lector = new Scanner(System.in);
        System.out.println("Indicame tu nombre");

        //Dependiendo del tipo de dato que quieras leer la variable lector tiene metodos para ello.
    }



    }
