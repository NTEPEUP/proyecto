/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;
  import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Nelson
 */
public class can {
    
  



    public static void main(String[] args) {
        // Crear un mapa para almacenar los candidatos y sus votos
        Map<String, Integer> candidatos = new HashMap<>();
        candidatos.put("Candidato A", 0);
        candidatos.put("Candidato B", 0);
        candidatos.put("Candidato C", 0);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Sistema de Votación");
            System.out.println("1. Votar");
            System.out.println("2. Ver resultados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Lista de candidatos:");
                    for (String candidato : candidatos.keySet()) {
                        System.out.println(candidato);
                    }

                    System.out.print("Ingrese el nombre del candidato al que desea votar: ");
                    scanner.nextLine(); // Consumir el salto de línea anterior
                    String candidatoVotado = scanner.nextLine();

                    if (candidatos.containsKey(candidatoVotado)) {
                        int votosActuales = candidatos.get(candidatoVotado);
                        candidatos.put(candidatoVotado, votosActuales + 1);
                        System.out.println("¡Has votado por " + candidatoVotado + "!");
                    } else {
                        System.out.println("Candidato no válido. Vuelva a intentarlo.");
                    }
                    break;

                case 2:
                    System.out.println("Resultados de la votación:");
                    for (String candidato : candidatos.keySet()) {
                        int votos = candidatos.get(candidato);
                        System.out.println(candidato + ": " + votos + " votos");
                    }
                    break;

                case 3:
                    System.out.println("¡Gracias por participar en la votación!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}


