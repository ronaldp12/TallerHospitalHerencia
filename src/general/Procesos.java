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
    int opcion=0, opcion2=0, opcion3=0;

    public Procesos(){

        modeloDatos= new ModeloDatos();

        do {
            opcion=menuPrincipal();
            eleccionRegistro(opcion);

        }while(opcion!=8);

    }

    public int menuPrincipal(){

        return opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu Hospital" +
                "\n1. Registrar empleado por planilla" +
                "\n2. Registrar empleado de forma eventual" +
                "\n3. Registrar Medico" +
                "\n4. Registrar Paciente" +
                "\n5. Registrar Cita medica" +
                "\n6. Menu Imprimir" +
                "\n7. Menu Consultar"+
                "\n8. Salir"));
    }

    public void menuImprimir(){
         opcion2=Integer.parseInt(JOptionPane.showInputDialog("Menu Imprimir" +
                "\n1. Imprimir empleado planilla" +
                "\n2. Imprimir empleado de forma eventual" +
                "\n3. Imprimir medico" +
                "\n4. Imprimir paciente" +
                "\n5. Imprimir cita medica"+
                "\n6. Volver al menu anterior"));

        switch (opcion2){
            case 1:
                modeloDatos.mostrarEmpleadoPlanilla();
                modeloDatos.mostrarMedico();
                break;
            case 2:
                modeloDatos.mostrarEmpleadoEventual();
                break;
            case 3:
                modeloDatos.mostrarMedico();
                break;
            case 4:
                modeloDatos.mostrarPaciente();
                break;
            case 5:
                modeloDatos.mostrarCitaMedica();
                break;
            case 6:
                break;
            default:System.out.println("Ingresa una opcion valida");
        }
    }

    public void menuConsultar(){
        opcion3=Integer.parseInt(JOptionPane.showInputDialog("Menu Consultar" +
                "\n1. Consultar Paciente por DNI" +
                "\n2. Consultar Empleado Eventual por DNI" +
                "\n3. Consultar Empleado por Planilla por DNI" +
                "\n4. Consultar Medico por DNI " +
                "\n5. Volver al menu anterior"));

        switch (opcion3){
            case 1:
                modeloDatos.consultarPacienteDocumento();
                break;
            case 2:
                modeloDatos.consultarEmpEventualDocumento();
                break;
            case 3:
                modeloDatos.consultarEmpPlanillaDocumento();
                break;
            case 4:
                modeloDatos.consultarMedicoDocumento();
                break;
            case 5:
                break;
            default:System.out.println("Ingrese una opcion valida");
                break;
        }
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
                    menuImprimir();
                    break;
                case 7:
                    menuConsultar();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }


    }

}
