/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia1;

/**
 *
 * @author jorgy
 */
public enum Rutas {
    NODEJS("Ruta NodeJs"),
    JAVA("Ruta Java"),
    NETCORE("Ruta NetCore");
    
    private String nombre;
    
    Rutas(String nombre) {
        this.nombre = nombre;
        }  
        public String getNombre() {
        return nombre;
        }
}
   
