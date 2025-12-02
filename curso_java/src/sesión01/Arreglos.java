package sesión01;

/**
 * LECCIÓN 1.5: ARREGLOS (ARRAYS) Y MATRICES
 * * * TEORÍA:
 * 1. Array Unidimensional (Vector): Tren con vagones. [0][1][2]...
 * 2. Array Multidimensional (Matriz): Hoja de cálculo. [fila][columna]
 */
public class Arreglos {

    public static void main(String[] args) {

        System.out.println("--- EJEMPLO TEÓRICO ---");
        int[] misNumeros = new int[3]; 
        misNumeros[0] = 5;             
        misNumeros[1] = 10;            
        misNumeros[2] = 15;            
        
        System.out.println("El valor de la posición 1 es: " + misNumeros[1]); 

        String[] dias = {"Lunes", "Martes", "Miércoles"};
        System.out.println("Recorriendo días:");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("- " + dias[i]);
        }

        System.out.println("\n--- TUS EJERCICIOS ---");

        // Ejercicio 1: Crear y sumar
        System.out.println("\n-- 1. Suma de Notas --");
        double suma = sumarNotas();
        System.out.println("Suma total: " + suma); 

        // Ejercicio 2: Encontrar el máximo
        System.out.println("\n-- 2. Máximo valor --");
        int[] datos = {10, 50, 5, 90, 20}; 
        int maximo = encontrarMaximo(datos);
        System.out.println("El mayor es: " + maximo);

        // Ejercicio 3: Matrices (Tablero)
        System.out.println("\n-- 3. Dibujando Matriz --");
        dibujarTablero();

        // Ejercicio 4: Transpuesta de Matriz
        System.out.println("\n-- 4. Transponer Matriz --");
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // Debería convertirse en:
        // 1 4 7
        // 2 5 8
        // 3 6 9
        transponerMatriz(original);
    }

    /**
     * EJERCICIO 1: Declaración y Recorrido
     */
    public static double sumarNotas() {
        // TODO: Crea array y suma sus valores
        return 0.0;
    }

    /**
     * EJERCICIO 2: Lógica con Arrays
     */
    public static int encontrarMaximo(int[] numeros) {
        // TODO: Encuentra el mayor
        return 0;
    }

    /**
     * EJERCICIO 3: Matrices (2 Dimensiones)
     */
    public static void dibujarTablero() {
        // TODO: Crea matriz 3x3 y rellénala
    }

    /**
     * EJERCICIO 4: La Transpuesta (NIVEL JEFE)
     * La transpuesta de una matriz consiste en cambiar FILAS por COLUMNAS.
     */
    public static void transponerMatriz(int[][] matriz) {

    }
}