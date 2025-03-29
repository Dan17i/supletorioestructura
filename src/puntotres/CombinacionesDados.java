package puntotres;
/**
 * (1.25) Escribir un programa en Java que, de manera recursiva, genere y muestre todas las combinaciones posibles de los n dados.
 * @author Daniel Jurado
 * **/
public class CombinacionesDados {

    // La Variable para contar el número total de combinaciones
    private static int totalCombinaciones = 0;
    // Función recursiva que genera todas las combinaciones posibles de n dados
    public static void generarCombinaciones(int n, int[] combinacion, int index) {
        // Caso base: si hemos llenado todos los dados, imprimimos la combinación
        if (index == n) {
            imprimirCombinacion(combinacion);
            totalCombinaciones++;
            return;
        }

        // Llamada recursiva para cada valor posible de un dado (1 a 6)
        for (int i = 1; i <= 6; i++) {
            combinacion[index] = i;  // Asignar el valor actual al dado
            generarCombinaciones(n, combinacion, index + 1);  // Llamada recursiva para el siguiente dado
        }
    }

    // Función para imprimir una combinación
    public static void imprimirCombinacion(int[] combinacion) {
        for (int i = 0; i < combinacion.length; i++) {
            System.out.print(combinacion[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;  // Número de dados
        int[] combinacion = new int[n];  // Arreglo para almacenar los resultados de los dados

        System.out.println("Las Combinaciones posibles de " + n + " dados:");
        generarCombinaciones(n, combinacion, 0);  // Iniciar la generación recursiva
        System.out.println("----------------------------");
        System.out.println("Total de combinaciones: " + totalCombinaciones + " |");
        System.out.println("----------------------------");
    }
}

