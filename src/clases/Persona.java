package clases;

import javax.swing.*;

public class Persona {

    private int dni;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String direccion;
    private String ciudadProv;

    public Persona(int dni, String nombre, String apellido, String fechaNac, String direccion, String ciudadProv) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.ciudadProv = ciudadProv;
    }

    public Persona (){

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadProv() {
        return ciudadProv;
    }

    public void setCiudadProv(String ciudadProv) {
        this.ciudadProv = ciudadProv;
    }

    public void imprimirDatosPersona(){
        System.out.println("\nDNI:"+dni);
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido:"+apellido);
        System.out.println("Fecha Nacimiento:"+fechaNac);
        System.out.println("Direccion:"+direccion);
        System.out.println("Ciudad Provincia:"+ciudadProv);
    }

    public void registrarDatos(){
        dni= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI"));
        nombre=JOptionPane.showInputDialog("Ingrese el nombre");
        apellido=JOptionPane.showInputDialog("Ingrese el apellido");
        fechaNac=JOptionPane.showInputDialog("Ingrese la fecha de nacimiento");
        direccion=JOptionPane.showInputDialog("Ingrese la direccion");
        ciudadProv=JOptionPane.showInputDialog("Ingrese ciudad de procedencia");
    }

}
