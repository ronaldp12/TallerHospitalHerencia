package general;

import clases.CitaMedica;
import clases.ModeloDatos;
import clases.Paciente;
import empleado.EmpleadoEventual;
import empleado.EmpleadoPlanilla;
import empleado.Medico;

import javax.swing.*;
import java.util.ArrayList;

public class Procesos {

    ArrayList<CitaMedica> citasMedicas=new ArrayList<>();
    ModeloDatos modeloDatos;
    int opcion=0;

    public Procesos(){

        modeloDatos= new ModeloDatos();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu Hospital" +
                    "\n1. Registrar empleado por planilla" +
                    "\n2. Registrar empleado de forma eventual" +
                    "\n3. Registrar empleado.Medico" +
                    "\n4. Registrar clases.Paciente" +
                    "\n5. Registrar Cita medica" +
                    "\n6. Imprimir empleado planilla" +
                    "\n7. Imprimir empleado de forma eventual" +
                    "\n8. Imprimir medico" +
                    "\n9. Imprimir paciente" +
                    "\n10. Imprimir cita medica" +
                    "\n11. Salir"));
            eleccionRegistro(opcion);

        }while(opcion!=11);

    }

    public void pedirDatosEmpleadoEventual(){
        EmpleadoEventual empleadoEventual= new EmpleadoEventual();
        empleadoEventual.registrarDatos();
        modeloDatos.registrarPersona(empleadoEventual);
    }

    public void pedirDatosEmpleadoPlanilla(){
        EmpleadoPlanilla empleadoPlanilla= new EmpleadoPlanilla();
        empleadoPlanilla.registrarDatos();
        modeloDatos.registrarPersona(empleadoPlanilla);
    }

    public void pedirDatosMedico(){
        Medico medico=new Medico();
        medico.registrarDatos();
        modeloDatos.registrarPersona(medico);
    }

    public void pedirDatosPaciente(){
        Paciente paciente= new Paciente();
        paciente.registrarDatos();
        modeloDatos.registrarPersona(paciente);
    }

    public void programarCitaMedica(){
        CitaMedica citaMedica= new CitaMedica();
        citaMedica.registrarCitaMedica();
        citasMedicas.add(citaMedica);
    }



    public void eleccionRegistro( int opcion){

            switch (opcion) {
                case 1:
                    int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados a registrar"));
                    for (int i = 0; i < cant; i++) {
                        pedirDatosEmpleadoPlanilla();
                    }
                    break;
                case 2:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados a registrar"));
                    for (int i = 0; i < cant; i++) {
                        pedirDatosEmpleadoEventual();
                    }
                    break;
                case 3:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de medicos a registrar"));
                    for (int i = 0; i < cant; i++) {
                        pedirDatosMedico();
                    }
                    break;
                case 4:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pacientes a registrar"));
                    for (int i = 0; i < cant; i++) {
                        pedirDatosPaciente();
                    }
                    break;
                case 5:
                    programarCitaMedica();
                    break;
                case 6:
                    modeloDatos.mostrarEmpleadoPlanilla();
                    break;
                case 7:
                    modeloDatos.mostrarEmpleadoEventual();
                    break;
                case 8:
                    modeloDatos.mostrarMedico();
                    break;
                case 9:
                    modeloDatos.mostrarPaciente();
                    break;
                case 10:
                    modeloDatos.mostrarCitaMedica();
                    break;
                case 11:
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }


    }

}
