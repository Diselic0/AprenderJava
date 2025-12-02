package sesión01;

import java.util.Scanner;

/**
 * LECCIÓN 1.3: TOMANDO DECISIONES (CONDICIONALES)
 * * * TEORÍA:
 * Hasta ahora, tu código se ejecutaba línea por línea, de arriba a abajo.
 * Pero, ¿y si quieres que ocurra algo SOLO si se cumple una condición?
 * * * 1. La sentencia IF (Si...):
 * Es como una bifurcación en la carretera.
 * "Si (llueve) { cojo paraguas }"
 * * * 2. La sentencia ELSE (Si no...):
 * Es la alternativa.
 * "Si (llueve) { cojo paraguas } Si no { cojo gafas de sol }"
 * * * 3. La sentencia ELSE IF (Sino, si...):
 * Para cuando hay más de dos opciones.
 * "Si (es rojo) { parar } Sino, si (es verde) { avanzar } Sino { precaución }"
 * * * 4. La sentencia SWITCH (Interruptor/Menú):
 * Útil cuando tienes una variable que puede valer cosas muy específicas (opción 1, opción 2...).
 * Es más ordenado que escribir 20 "else if" seguidos.
 */
public class Condicionales {

    public static void main(String[] args) {
        
        System.out.println("--- EJEMPLOS TEÓRICOS ---");
        
        int hora = 14;
        
        // Ejemplo IF-ELSE IF-ELSE
        if (hora < 12) {
            System.out.println("Buenos días.");
        } else if (hora < 20) {
            System.out.println("Buenas tardes.");
        } else {
            System.out.println("Buenas noches.");
        }

        // Ejemplo SWITCH
        int opcionMenu = 2;
        switch (opcionMenu) {
            case 1:
                System.out.println("Has elegido: Iniciar Juego");
                break; // IMPORTANTE: 'break' rompe la ejecución para que no siga bajando a los otros casos
            case 2:
                System.out.println("Has elegido: Cargar Partida");
                break;
            default: // Se ejecuta si no coincide con ningún caso anterior
                System.out.println("Opción desconocida");
        }

        System.out.println("\n--- TUS EJERCICIOS ---");
        
        // Ejercicio 1: Par o Impar
        verificarParidad(7);
        verificarParidad(10);

        // Ejercicio 2: Clasificador de edades
        clasificarEdad(15);
        clasificarEdad(45);

        // Ejercicio 3: Calculadora simple con Switch
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora: Introduce dos números y una operación (+, -, *, /)");
        // Para este ejercicio simulamos los datos, pero podrías usar scanner.nextInt()
        calcular(10, 5, '+'); 
        calcular(10, 5, '/');
        
        scanner.close();
    }

    /**
     * EJERCICIO 1: Par o Impar con IF
     * Imprime por consola si el número es par o impar.
     * Pista: Usa el operador módulo (%) que vimos en la lección anterior.
     * Si (numero % 2 == 0) es par. Si no (else), es impar.
     */
    public static void verificarParidad(int numero) {
        // TODO: Escribe un if/else para imprimir "El número X es PAR" o "IMPAR"
        
    }

    /**
     * EJERCICIO 2: Rango de Edades (Else If)
     * Imprime una categoría según la edad:
     * - Menor de 12: "Niño"
     * - Entre 12 y 17 (incluidos): "Adolescente"
     * - Entre 18 y 64 (incluidos): "Adulto"
     * - 65 o más: "Jubilado"
     * * Pista: El orden importa. Empieza preguntando por el más pequeño (o el más grande).
     */
    public static void clasificarEdad(int edad) {
        // TODO: Escribe la estructura if - else if - else
        
    }

    /**
     * EJERCICIO 3: Switch
     * Dependiendo del carácter 'operacion', realiza la matemática correspondiente e imprime el resultado.
     * Casos: '+', '-', '*', '/'
     * Default: Imprimir "Operación no válida".
     */
    public static void calcular(int a, int b, char operacion) {
        // TODO: Crea un switch(operacion)
        /*
         switch(operacion) {
            case '+': 
                // imprimir suma...
                break;
            // resto de casos...
         }
         */
    }
}