/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasql;

import java.util.Date;

/**
 *
 * @author camper
 */
public class Paciente {
    private int id;
    private String nombre;
    private Date fechaNacimiento;
    private int edad;
    private String cedula;
    private String direccion;
    private String telefono;
    private String email;  
    private String alergias;
    private String tipoSangre;
    private int pabellonId;
    private int doctorId;
    private String seguroMedico;
    
    // Constructor
    public Paciente (int id, String nombre, Date fechaNacimiento, int edad, Date fechaIngreso, String cedula, String direccion, String telefono, String email, String alergias, String tipoSangre, int pabellonId, int doctorId, String seguroMedico){
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.alergias = alergias;
        this.tipoSangre = tipoSangre;
        this.pabellonId = pabellonId;
        this.doctorId = doctorId;
        this.seguroMedico = seguroMedico;
    }
   // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
 public int getPabellonId() {
        return pabellonId;
    }

    public void setPabellonId(int pabellonId) {
        this.pabellonId = pabellonId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(String seguroMedico) {
        this.seguroMedico = seguroMedico;
    }
    // Método para representar al paciente como una cadena de texto
    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", grupoSanguineo='" + tipoSangre + '\'' +
                ", alergias='" + alergias + '\'' +
                 ", pabellonId='" + pabellonId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", seguroMedico='" + seguroMedico + '\'' +
                  '}';
}
}

// HECHO //