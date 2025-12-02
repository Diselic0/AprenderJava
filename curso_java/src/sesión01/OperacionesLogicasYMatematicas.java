package sesión01;

/**
 * LECCIÓN 1.2.2: OPERADORES MATEMÁTICOS Y LÓGICOS
 * * * 1. OPERADORES MATEMÁTICOS:
 * + (Suma), - (Resta), * (Multiplicación), / (División)
 * % (Módulo o Resto): Devuelve lo que sobra de una división. 
 * Ej: 10 % 3 = 1 (Porque 10 / 3 es 3 y sobra 1). Muy útil para saber si un número es par.
 * * * 2. OPERADORES RELACIONALES (Comparan y devuelven boolean: true/false):
 * > (Mayor que), < (Menor que), >= (Mayor o igual), <= (Menor o igual)
 * == (Igual a - ¡OJO! son dos iguales), != (Distinto de)
 * * * 3. OPERADORES LÓGICOS (Combinan condiciones):
 * && (AND / Y): Ambas condiciones deben ser verdaderas. (Tengo dinero Y tengo tiempo).
 * || (OR / O): Al menos una debe ser verdadera. (Pago en efectivo O con tarjeta).
 * ! (NOT / NO): Invierte el valor (Si es true, lo vuelve false).
 */
public class OperacionesLogicasYMatematicas {

    public static void main(String[] args) {
        

        // 1. Matemáticas: Módulo
        boolean esPar = esNumeroPar(4);
        System.out.println("¿Es 4 par?           -> Tu resultado: " + esPar + " | Esperado: true");

        // 2. Relacionales: Mayor de edad
        boolean puedeVotar = esMayorDeEdad(17);
        System.out.println("¿Puede votar con 17? -> Tu resultado: " + puedeVotar + " | Esperado: false");

        // 3. Lógica compleja (AND): Montaña rusa
        // Requisitos: Medir más de 120cm Y tener más de 10 años
        boolean pasaAtraccion = puedeSubirAtraccion(130, 9); 
        System.out.println("¿Sube (130cm, 9años)?-> Tu resultado: " + pasaAtraccion + " | Esperado: false");

        // 4. Lógica compleja (OR): Descuento
        // Requisitos: Ser jubilado (>=65) O ser niño (<=5)
        boolean tieneDescuento = aplicaDescuento(30);
        System.out.println("¿Dto con 30 años?    -> Tu resultado: " + tieneDescuento + " | Esperado: false");

        
        // --- ZONA DE DEBUGGING ---
        // Descomenta la siguiente línea para provocar un error y practicar con el debugger.
        // provocarErrorEnEjecucion();
    }

    /**
     * EJERCICIO 1 (Módulo):
     * Devuelve true si el número es par, false si es impar.
     */
    public static boolean esNumeroPar(int numero) {
        // TODO: Completa la lógica
        return false; 
    }

    /**
     * EJERCICIO 2 (Relacional):
     * Devuelve true si la edad es mayor o igual a 18.
     */
    public static boolean esMayorDeEdad(int edad) {
        // TODO: Completa la lógica
        return false; 
    }

    /**
     * EJERCICIO 3 (Lógico AND &&):
     * Para subir a la atracción debes medir más de 120cm Y tener más de 10 años.
     */
    public static boolean puedeSubirAtraccion(int alturaCm, int edad) {
        // TODO: Usa el operador &&
        return false; 
    }

    /**
     * EJERCICIO 4 (Lógico OR ||):
     * Tienen descuento los mayores de 65 (incluidos) O los menores de 5 (incluidos).
     */
    public static boolean aplicaDescuento(int edad) {
        // TODO: Usa el operador ||
        return false; 
    }

    /**
     * EJERCICIO DEBUGGER:
     * Este método contiene un error clásico que no se ve al escribir (compila bien),
     * pero falla al ejecutarse.
     * * INSTRUCCIONES PARA EL ALUMNO:
     * 1. Ejecuta el programa y observa el error en la consola (ArithmeticException).
     * 2. Haz clic en el enlace azul de la consola que dice "at leccion01...:85".
     * 3. Pon un punto rojo (breakpoint) en esa línea haciendo doble clic en el margen izquierdo.
     * 4. Ejecuta en modo "Debug" (el bicho verde) y mira las variables.
     */
    public static void provocarErrorEnEjecucion() {
        System.out.println("\n--- INICIANDO PROTOCOLO DE AUTODESTRUCCIÓN ---");
        int numerador = 10;
        int denominador = 0; 	
        
        // Aquí explotará
        int resultado = numerador / denominador;
        
        System.out.println("Si lees esto, el universo se ha roto: " + resultado);
    }
}