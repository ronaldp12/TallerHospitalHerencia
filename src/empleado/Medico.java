package empleado;

import javax.swing.*;

public class Medico extends EmpleadoPlanilla {

    private String especialidad;
    private int numConsultorio;

    public Medico(int DNI, String nombre, String apellido, String fechaNac, String direccion, String ciudadProv, int codEmpleado, int numHorasExtras, String fechaIngreso, String area, String cargo, double salarioMensual, int porcHoraExtra, String especialidad, int numConsultorio) {
        super(DNI, nombre, apellido, fechaNac, direccion, ciudadProv, codEmpleado, numHorasExtras, fechaIngreso, area, cargo, salarioMensual, porcHoraExtra);
        this.especialidad = especialidad;
        this.numConsultorio = numConsultorio;
    }

    public Medico(String especialidad, int numConsultorio) {
        this.especialidad = especialidad;
        this.numConsultorio = numConsultorio;
    }

    public Medico(){

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumConsultorio() {
        return numConsultorio;
    }

    public void setNumConsultorio(int numConsultorio) {
        this.numConsultorio = numConsultorio;
    }

    @Override
    public void registrarDatos(){
        super.registrarDatos();
        especialidad= JOptionPane.showInputDialog("Ingrese la especialidad");
        numConsultorio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de consultorio"));
    }

    public void imprimirDatosMedico(){
        super.imprimirDatosPersona();
        System.out.println("Especialidad:"+especialidad);
        System.out.println("Numero Consultorio:"+numConsultorio);
    }
}
