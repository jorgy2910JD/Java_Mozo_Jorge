/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_7;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
/**
 *
 * @author Jorge Luis Mozo 
 */

public class ConexionBD {
    private Connection con;
    
    public Connection conectarMySQL() { 
     Properties props = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("Config.properties")) {
            if (input == null) {
                throw new IllegalStateException("Archivo Config.properties no encontrado");
            }

            props.load(input);

            String Driver = props.getProperty("DRIVER");
            String jdbc = props.getProperty("jdbc");
            String User = props.getProperty("User");
            String Password = props.getProperty("Clave");

            if (jdbc == null || User == null || Password == null) {
                throw new IllegalStateException("Una o más propiedades de conexión no están definidas");
            }

            Class.forName(Driver);
            con = DriverManager.getConnection(jdbc, User, Password);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (IOException | ClassNotFoundException | SQLException | IllegalStateException e) {
            System.err.println("Error en la conexión :(, error: " + e);
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.toString());
        }
        return con;
    } 
 }
