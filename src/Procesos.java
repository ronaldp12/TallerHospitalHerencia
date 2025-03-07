import javax.swing.*;
import java.util.ArrayList;

public class Procesos {

    ArrayList<Medico> medicos=new ArrayList<>();
    ArrayList<EmpleadoEventual> empleadoEventuales=new ArrayList<>();
    ArrayList<EmpleadoPlanilla> empleadoPlanillas=new ArrayList<>();
    ArrayList<Paciente> pacientes=new ArrayList<>();
    ArrayList<CitaMedica> citasMedicas=new ArrayList<>();
    ModeloDatos modeloDatos;
    int opcion=0;

    public Procesos(){

        modeloDatos= new ModeloDatos();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu Hospital" +
                    "\n1. Registrar empleado por planilla" +
                    "\n2. Registrar empleado de forma eventual" +
                    "\n3. Registrar Medico" +
                    "\n4. Registrar Paciente" +
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
        empleadoEventuales.add(empleadoEventual);
        modeloDatos.registrarPersona(empleadoEventual);
    }

    public void pedirDatosEmpleadoPlanilla(){
        EmpleadoPlanilla empleadoPlanilla= new EmpleadoPlanilla();
        empleadoPlanilla.registrarDatos();
        empleadoPlanillas.add(empleadoPlanilla);
        modeloDatos.registrarPersona(empleadoPlanilla);
    }

    public void pedirDatosMedico(){
        Medico medico=new Medico();
        medico.registrarDatos();
        medicos.add(medico);
        modeloDatos.registrarPersona(medico);
    }

    public void pedirDatosPaciente(){
        Paciente paciente= new Paciente();
        paciente.registrarDatos();
        pacientes.add(paciente);
        modeloDatos.registrarPersona(paciente);
    }

    public void programarCitaMedica(){
        CitaMedica citaMedica= new CitaMedica();
        citaMedica.registrarCitaMedica();
        citasMedicas.add(citaMedica);
    }

    public void mostrarEmpleadoPlanilla(){
        for (EmpleadoPlanilla empleadoPlanilla: empleadoPlanillas){
            empleadoPlanilla.ImprimirDatosEmpleadoPlanilla();
        }
    }

    public void mostrarEmpleadoEventual(){
        for (EmpleadoEventual empleadoEventual: empleadoEventuales){
            empleadoEventual.imprimirDatosEmpleadoEventual();
        }
    }

    public void mostrarMedico(){
        for (Medico medico: medicos){
            medico.imprimirDatosMedico();
        }
    }

    public void mostrarPaciente(){
        for (Paciente paciente: pacientes){
            paciente.ImprimirDatosPaciente();
        }
    }

    public void mostrarCitaMedica(){
        for (CitaMedica citaMedica: citasMedicas){
            citaMedica.imprimirCitaMedica();
        }
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
                    mostrarEmpleadoPlanilla();
                    break;
                case 7:
                    mostrarEmpleadoEventual();
                    break;
                case 8:
                    mostrarMedico();
                    break;
                case 9:
                    mostrarPaciente();
                    break;
                case 10:
                    mostrarCitaMedica();
                    break;
                case 11:
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }


    }

}
