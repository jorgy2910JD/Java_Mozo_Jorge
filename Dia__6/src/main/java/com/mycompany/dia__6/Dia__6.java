/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia__6;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Dia__6 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Partido partido = null;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Registrar partido de Liga");
            System.out.println("2. Registrar partido de PlayOffs");
            System.out.println("3. Finalizar partido");
            System.out.println("4. Mostrar información del partido");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Equipo Local:");
                    String equipoLocalLiga = scanner.nextLine();
                    System.out.println("Equipo Visitante:");
                    String equipoVisitanteLiga = scanner.nextLine();
                    System.out.println("Fecha:");
                    String fechaLiga = scanner.nextLine();
                    System.out.println("Jornada:");
                    int jornadaLiga = scanner.nextInt();
                    scanner.nextLine();  // Consumir el salto de línea
                    partido = new Liga(equipoLocalLiga, equipoVisitanteLiga, fechaLiga, jornadaLiga);
                    break;
                case 2:
                    System.out.println("Equipo Local:");
                    String equipoLocalPlayOffs = scanner.nextLine();
                    System.out.println("Equipo Visitante:");
                    String equipoVisitantePlayOffs = scanner.nextLine();
                    System.out.println("Fecha:");
                    String fechaPlayOffs = scanner.nextLine();
                    System.out.println("Ronda:");
                    String rondaPlayOffs = scanner.nextLine();
                    partido = new PlayOff(equipoLocalPlayOffs, equipoVisitantePlayOffs, fechaPlayOffs, rondaPlayOffs);
                    break;
                case 3:
                    if (partido != null) {
                        partido.finalizarPartido();
                    } else {
                        System.out.println("No hay partido registrado.");
                    }
                    break;
                case 4:
                    if (partido != null) {
                        System.out.println(partido.obtenerInformacion());
                        System.out.println("Ganador: " + partido.obtenerGanador());
                    } else {
                        System.out.println("No hay partido registrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
} 

