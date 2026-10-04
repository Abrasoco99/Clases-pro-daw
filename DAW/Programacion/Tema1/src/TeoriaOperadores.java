public class TeoriaOperadores {

    public static void main(String[] args) {

        //Arimeticos: + - * / %
        int operador1 = 5;
        int operador2 = 2;
        int suma = operador1+operador2;
        int resta = operador1-operador2;
        int multiplicacion = operador1*operador2;
        double division = (double)operador1/operador2;
        // % el resto de la division de dos numeros.
        int modulo = operador1%operador2; //para ver si un numero es par ,  cuantos segundos entran en un minuto
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("el resto es: "+modulo);


        // Asignacion da un valor = =* -= *= /= %= ++

        operador1= 10;
        operador2 = 11;
        operador1++;
        operador1++;
        operador1++;
        operador1++; //14
        operador2--;
        operador2--;
        operador2--; //8
        operador1 += 14; //28
        operador2 -= 10; //-2
        operador1 *= 2; //56
        operador1 %= 2; //0
        System.out.println("el valor despues de haber operado es Operador1: "+operador1);
        System.out.println("el valor despues de haber operado es Operador2: "+operador2);

        //Relacionales comparan dos o mas variables entre si < <= > >= == !=
        operador1 = 10;
        operador2 = 10;
         boolean comparacion = operador1>operador2;
        System.out.println("La comparacion > es: "+comparacion);
        comparacion = operador1>=operador2;
        System.out.println("la comparacion >= es : "+comparacion);
        comparacion = operador1<operador2;
        System.out.println("La comparacion  < es: "+comparacion);
        comparacion = operador1<=operador2;
        System.out.println("La comparacion <= es: "+comparacion);
        comparacion = operador1==operador2;
        System.out.println("La comparacion == es : "+comparacion);
        comparacion = operador1!=operador2;
        System.out.println("La comparacion != es: "+comparacion);
        String palabra1 = "programacion";
        String palabra2 = "Programacion";
        boolean compararPalabras = palabra1.equals(palabra2);
        compararPalabras = !palabra1.equalsIgnoreCase(palabra2);
        System.out.println("la comparacion de palabras es: "+compararPalabras);



        //logicos sentencias && ||
        //puertas logicas : && AND || -> OR

        operador1 = 10;
        operador2 = 20;
      boolean  comparacionAnd = operador2 > 0 && operador1 < 10; //false
      boolean  comparacionOr = operador1 < 10 || operador2 < 20 || operador1*2 >= operador2; //false

        System.out.println("la comparacionAnd es : "+ comparacionAnd);
        System.out.println("la comparacionOR es : "+ comparacionOr);







    }
}
