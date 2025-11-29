package sesión01;


/**
 * Sesión 1.2: VARIABLES Y TIPOS DE DATOS
 * * TEORÍA:
 * Imagina la memoria del ordenador como un almacén gigante lleno de estanterías.
 * Una VARIABLE es una "caja" en ese almacén donde guardamos un dato.
 * * 1. Declaración: Decirle a Java "resérvame una caja de tipo X y ponle la etiqueta Y".
 * Ejemplo: int edad;
 * * 2. Asignación: Meter algo en la caja.
 * Ejemplo: edad = 25;
 * * TIPOS DE CAJAS (Primitivos):
 * - int:     Números enteros (5, -10, 4000). Ocupa 32 bits.
 * - double:  Números con decimales (3.14, -0.01). Ocupa 64 bits (más grande).
 * - boolean: Solo dos valores: true (verdadero) o false (falso). Es una bombilla (encendido/apagado).
 * - char:    UN solo carácter ('a', 'Z', '@'). Va con comillas simples.
 * * EL TIPO ESPECIAL (No es primitivo, es un Objeto):
 * - String:  Cadena de texto ("Hola mundo"). Va con comillas dobles.
 */
public class VariablesYTypos {

	 public static void main(String[] args) {
	        
	        // --- ZONA DE EJEMPLOS ---
	        System.out.println("--- EJEMPLOS TEÓRICOS ---");
	        
	        int numeroCajas = 5;
	        double precio = 12.99;
	        boolean esDivertido = true;
	        char letra = 'J';
	        String curso = "Curso de Java";

	        System.out.println("El precio es: " + precio); // El símbolo '+' concatena (une) texto y variables
	        System.out.println("¿Es divertido? " + esDivertido);


	        System.out.println("\n--- COMPROBANDO TUS EJERCICIOS ---");
	        
	        // Probamos la suma
	        int resultadoSuma = sumar(10, 5); 
	        System.out.println("Suma (10 + 5) -> Tu resultado: " + resultadoSuma + " | Esperado: 15");

	        // Probamos la calculadora de IVA
	        double precioFinal = calcularPrecioConIVA(100.0);
	        System.out.println("IVA (100.0)   -> Tu resultado: " + precioFinal + " | Esperado: 121.0");

	        // Probamos unir textos
	        String saludo = crearSaludo("Ana");
	        System.out.println("Saludo        -> Tu resultado: " + saludo);
	    }

	    /**
	     * EJERCICIO 1: Operaciones básicas
	     * Completa la función para que devuelva la suma de a y b.
	     * @param a Primer número (int)
	     * @param b Segundo número (int)
	     * @return La suma de ambos
	     */
	    public static int sumar(int a, int b) {
	        // TODO: Crea una variable llamada 'resultado', guarda la suma y devuélvela.
	        // O simplemente: return a + b;
	        return 0; // Cambia esto
	    }

	    /**
	     * EJERCICIO 2: Tipos double y operadores
	     * Calcula el precio final multiplicando el precio base por 1.21 (IVA del 21%).
	     * @param precioBase El precio sin impuestos
	     * @return El precio con IVA
	     */
	    public static double calcularPrecioConIVA(double precioBase) {
	        // TODO: Realiza la multiplicación y devuelve el resultado
	        return 0.0; // Cambia esto
	    }

	    /**
	     * EJERCICIO 3: String y concatenación
	     * Debe devolver una frase que diga: "Hola [nombre], bienvenido a Java".
	     * @param nombre El nombre de la persona
	     * @return La frase completa
	     */
	    public static String crearSaludo(String nombre) {
	        // TODO: Usa el operador + para unir las partes
	        return ""; // Cambia esto
	    }
}
