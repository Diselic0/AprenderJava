package sesión01;

/**
 * LECCIÓN 1.4: REPETICIÓN (BUCLES)
 * * * TEORÍA:
 * Principio DRY (Don't Repeat Yourself - No te repitas).
 * Si quieres imprimir 500 números, no escribes 500 "System.out.println". Usas un bucle.
 * * * 1. Bucle WHILE (Mientras...):
 * Se repite MIENTRAS una condición sea verdadera.
 * Cuidado: Si la condición nunca cambia a falsa, tendrás un "Bucle Infinito" (el programa se cuelga).
 * Estructura: 
 * while (condicion) { haz algo; }
 * * * 2. Bucle FOR (Para...):
 * Es el más usado cuando sabes CUÁNTAS veces quieres repetir algo (ej: 10 veces).
 * Estructura compacta: 
 * for (inicio; condicion_parada; paso) { ... }
 * Ej: for (int i = 0; i < 10; i++) 
 * - int i = 0; -> Empezamos en 0.
 * - i < 10;    -> Repetimos mientras i sea menor que 10.
 * - i++;       -> Al terminar la vuelta, sumamos 1 a i.
 */
public class Bucles {

    public static void main(String[] args) {

        System.out.println("--- EJEMPLOS TEÓRICOS ---");

        // Ejemplo WHILE: Cuenta atrás
        System.out.println("Iniciando cuenta atrás con WHILE...");
        int contador = 3;
        while (contador > 0) {
            System.out.println(contador);
            contador = contador - 1; // IMPORTANTE: Modificar la variable para no crear un bucle infinito
        }
        System.out.println("¡Despegue!");

        // Ejemplo FOR: Imprimir 3 veces
        System.out.println("Repitiendo con FOR...");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Vuelta número: " + i);
        }

        System.out.println("\n--- TUS EJERCICIOS ---");

        // Ejercicio 1: Tabla de multiplicar
        System.out.println("\n-- Tabla del 5 --");
        //imprimirTablaMultiplicar(5);

        // Ejercicio 2: Suma acumulativa
        System.out.println("\n-- Suma 1 a 5 --");
        int total = sumarNumeros(5); 
        System.out.println("La suma total es: " + total); // Debería dar 15 (1+2+3+4+5)
        
        // Ejercicio 3: Contador de pares (Mezcla bucle + if)
        System.out.println("\n-- Pares hasta el 10 --");
        imprimirParesHasta(10);
        
        // Ejercicio 4: Rampas de Asteriscos (Bucles anidados)
        System.out.println("\n-- Rampa Izquierda (Altura 5) --");
        dibujarRampaIzquierda(5);
        
        System.out.println("\n-- Rampa Derecha (Altura 5) --");
        dibujarRampaDerecha(5);
    }

    /**
     * EJERCICIO 1: Tabla de multiplicar (FOR)
     * Debe imprimir:
     * 5 x 1 = 5
     * 5 x 2 = 10
     * ...
     * 5 x 10 = 50
     */
    public static void imprimirTablaMultiplicar(int numeroBase) {
        // TODO: Crea un bucle for que vaya desde i = 1 hasta i <= 10.
        // Dentro, imprime la multiplicación de 'numeroBase' * 'i'.
        
    }

    /**
     * EJERCICIO 2: El Acumulador (FOR)
     * Debes sumar todos los números desde el 1 hasta el 'limite'.
     * Ejemplo: si limite es 3, sumas 1 + 2 + 3 = 6.
     */
    public static int sumarNumeros(int limite) {
        int sumaAcumulada = 0; // Aquí iremos guardando el total
        
        // TODO: Crea un bucle desde 1 hasta 'limite'.
        // En cada vuelta, suma el valor de 'i' a 'sumaAcumulada'.
        // sumaAcumulada = sumaAcumulada + i;
        
        return sumaAcumulada;
    }

    /**
     * EJERCICIO 3: Bucle + Condicional (FOR + IF)
     * Recorre los números desde 0 hasta el 'maximo'.
     * Imprime el número SOLO si es par.
     */
    public static void imprimirParesHasta(int maximo) {
        // TODO: Bucle del 0 al maximo.
        // Dentro del bucle, pon un IF. Si (i % 2 == 0) -> imprímelo.
        
    }
    
    /**
     * EJERCICIO 4: Rampa Izquierda
     * Debe imprimir esto (para altura 5):
     * *
     * **
     * ***
     * ****
     * *****
     * Pista: Necesitas un bucle dentro de otro.
     */
    public static void dibujarRampaIzquierda(int altura) {

    }

    /**
     * EJERCICIO 4: Rampa Derecha
     * Debe imprimir esto (para altura 5):
     *     *
     *    **
     *   ***
     *  ****
     * *****
     */
    public static void dibujarRampaDerecha(int altura) {
    	
    }
    
}