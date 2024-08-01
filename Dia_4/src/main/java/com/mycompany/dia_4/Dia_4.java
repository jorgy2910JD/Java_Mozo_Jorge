/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jorgy
 */
public class Dia_4 { // Se hará la conexion con MySQL

    public String driver = "com.mysql.cj.jdbc.Driver" ;
    
    // Nombre de la database 
    public String database = "hospital" ;
    
    //Host
    public String hostname = "172.16.101.157" ;
    
    //Puerto 
    public String port = "3306" ;
    
    // Ruta de la base de datos 
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +"?useSSL=false";
    
    // UserName 
    public String username = "root";
    
    // User Password
    public String password = "1099738869" ;
    
    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
        }

        return conn;
    }
    
}
