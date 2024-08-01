/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_4;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;


/**
 *
 * @author jorgy
 */
public class Hospital {
     private final Dia_4 conexion;
    public Hospital() {
        conexion = new Dia_4();
    }

        
    public static void Ingresar_hospital() {
        Hospital dao = new Hospital();
        Scanner scanner = new Scanner(System.in);
   
            System.out.println("Ingresar datos del hospital:");
            System.out.print("Nombre del hospital: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Direccion: ");
            String direccion = scanner.nextLine();
            int i = 0;
            while (i != 10){
                    System.out.println("");
                    i = 1 + i;
                }
            
           
            dao.insertarHospital(nombre, direccion);
            // Cerramos el scanner al finalizar
 
    }
     
    public void insertarHospital(String nombre, String direccion) {
        Connection conn = null;
        PreparedStatement pstmt = null;
 
        try {
            conn = conexion.conectarMySQL();
            String query = "INSERT INTO hospital (nombre,direccion) VALUES (?,?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombre);
            pstmt.setString(2, direccion);
            pstmt.executeUpdate();
            System.out.println("Hospital agregado correctamente.");
        } catch (SQLException e) {
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }

public static void Ver_hospital() {
        Hospital dao = new Hospital();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = dao.conexion.conectarMySQL();
            String query = "SELECT * FROM hospital";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            System.out.println("Lista de hospitales:");
            while (rs.next()) {
                int id = rs.getInt("id"); 
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Dirección: " + direccion);
            }
            System.out.println("----------");
        } catch (SQLException e) {
            System.out.println("Error al recuperar los datos del hospital: " + e.getMessage());
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar el PreparedStatement: " + e.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
public static void Eliminar_hospital() {
        Hospital.Ver_hospital();
        Hospital dao = new Hospital();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del hospital a eliminar: ");
        int id = scanner.nextInt();

        dao.eliminarHospital(id);
    }

    public void eliminarHospital(int id) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = conexion.conectarMySQL();
            String query = "DELETE FROM hospital WHERE id = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            int i = 0;
            while (i != 10){
                    System.out.println("");
                    i = 1 + i;
                }

            if (rowsAffected > 0) {
                System.out.println("Hospital eliminado correctamente.");
            } else {
                System.out.println("No se encontró el hospital con el ID especificado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el hospital: " + e.getMessage());
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar el PreparedStatement: " + e.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
    }
}
