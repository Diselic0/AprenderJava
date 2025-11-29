package sesión01;

import java.util.Scanner; // Importamos la herramienta para leer de la consola

/**
 * Introducción a java, Hola Mundo.
 * - Entrada: Scanner (Leer del teclado). Es similar al 'scanf' de C o 'input' de Python.
 */

public class HolaMundo {
    // Este es el punto de entrada. Cuando das a "Run", Java busca esto.
    public static void main(String[] args) {
        
       
        // System.out.println imprime una línea de texto en la consola y salta a la siguiente línea.
        System.out.println("Este metodo imprime en pantalla"); 
        
       
        // print (sin ln) no hace salto de línea
        System.out.print("Esto se imprime ");
        
        System.out.println("en la misma línea.");

        System.out.println("\n--- TUS EJERCICIOS ---");
        
        // Llamada a tu ejercicio (ahora mismo no hace nada, tienes que completarlo abajo)
        imprimirPresentacion();
    }

    /**
     * EJERCICIO 1:
     * Utiliza System.out.println para imprimir:
     * 1. Tu nombre completo.
     * 2. Una frase favorita.
     */
    public static void imprimirPresentacion() {
        // TODO: Escribe aquí tu código (borra este comentario cuando empieces)
        
        
    }
    
    
    /**
     * EJERCICIO 2:
     * 1. Pregunta al usuario su edad usando System.out.println.
     * 2. Usa el scanner (variable 'teclado') para leer lo que escribe.
     * Pista: Para leer texto usa teclado.nextLine(). 
     * (Para leer números se usa nextInt(), pero por ahora leemos texto).
     * 3. Imprime una frase como: "Vaya, parece que tienes [edad] años".
     */
    public static void interactuarConUsuario(Scanner teclado) {
        // TODO: Escribe aquí tu código.
        // 1. Preguntar
        // 2. Leer ( String edad = teclado.nextLine(); )
        // 3. Responder
        
    }
}
