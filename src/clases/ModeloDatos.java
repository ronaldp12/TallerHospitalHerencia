package clases;

import empleado.EmpleadoEventual;
import empleado.EmpleadoPlanilla;
import empleado.Medico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ModeloDatos {

    HashMap<String, Paciente>pacientesMap;
    HashMap<String, EmpleadoPlanilla>empleadoPlanillaMap;
    HashMap<String, EmpleadoEventual>empleadoEventualMap;
    HashMap<String, Medico>medicoMap;

    ArrayList<CitaMedica> citasMedicas=new ArrayList<>();

    public ModeloDatos() {
        pacientesMap = new HashMap<String, Paciente>();
        empleadoPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
        empleadoEventualMap = new HashMap<String, EmpleadoEventual>();
        medicoMap = new HashMap<String, Medico>();
        citasMedicas= new ArrayList<>();
    }

    public void registrarPersona(EmpleadoPlanilla miEmpleadoPlanilla){
        if (empleadoEventualMap.containsKey(String.valueOf(miEmpleadoPlanilla.getDni()))){
            System.out.println("El empleado de planilla ya se encuentra registrado");
        }else{
            empleadoPlanillaMap.put(String.valueOf(miEmpleadoPlanilla.getDni()), miEmpleadoPlanilla);
            System.out.println("Se ha registrado el empleado planilla "+miEmpleadoPlanilla.getNombre()+" Satisfactoriamente");
        }
    }

    public void registrarPersona(EmpleadoEventual miEmpleadoEventual){
        if (empleadoEventualMap.containsKey(String.valueOf(miEmpleadoEventual.getDni()))){
            System.out.println("El empleado eventual ya se encuentra resgistrado");
        }else{
            empleadoEventualMap.put(String.valueOf(miEmpleadoEventual.getDni()), miEmpleadoEventual);
            System.out.println("Se ha registrado el empleado eventual "+miEmpleadoEventual.getNombre()+" Satisfactoriamente");
        }
    }

    public void registrarPersona(Medico miMedico){
        if (medicoMap.containsKey(String.valueOf(miMedico.getDni()))){
            System.out.println("El medico ya se encuentra registrado");
        }else{
            medicoMap.put(String.valueOf(miMedico.getDni()), miMedico);
            System.out.println("Se ha registrado el medico "+miMedico.getNombre()+" Satisfactoriamente");
        }
    }

    public void registrarPersona(Paciente miPaciente){
        if (pacientesMap.containsKey(String.valueOf(miPaciente.getDni()))) {
            System.out.println("El paciente ya se encuentra registrado");
        } else {
            pacientesMap.put(String.valueOf(miPaciente.getDni()), miPaciente);
            System.out.println("Se ha registrado el paciente " + miPaciente.getNombre() + " satisfactoriamente");
        }

    }

    public void registrarCitaMedica(CitaMedica miCita){
        citasMedicas.add(miCita);
        System.out.println("Se ha registrado la cita exitosamente");
        miCita.imprimirCitaMedica();
    }

    public Paciente consultarPacientePorDocumento(String documentoPaciente){

        Paciente miPaciente=null;
        if (pacientesMap.containsKey(documentoPaciente)){
            miPaciente=pacientesMap.get(documentoPaciente);
        }
        return miPaciente;
    }

    public Medico consultarMedicoPorNombre(String nombreMedico){

        for (Medico medico: medicoMap.values()){
            if (medico.getNombre().equalsIgnoreCase(nombreMedico)){
                return medico;
            }
        }
        return null;

    }

    public void mostrarEmpleadoPlanilla(){
        System.out.println("Empleados de planilla registrados\n");

        if (empleadoPlanillaMap.size()>0){
            for (EmpleadoPlanilla empleadoPlanilla : empleadoPlanillaMap.values()) {
                empleadoPlanilla.ImprimirDatosEmpleadoPlanilla();
            }
        }else {
            System.out.println("No existen empleados de planilla registrados");
        }

    }

    public void mostrarEmpleadoEventual(){
        System.out.println("Empleados eventuales registrados\n");

        if (empleadoEventualMap.size()>0){
            for (EmpleadoEventual empleadoEventual: empleadoEventualMap.values()){
                empleadoEventual.imprimirDatosEmpleadoEventual();
            }
        }else {
            System.out.println("No existen empleados eventuales registrados");
        }

    }

    public void mostrarMedico(){
        System.out.println("Medicos registrados\n");
        if (medicoMap.size()>0){
            for (Medico medico: medicoMap.values()){
                medico.imprimirDatosMedico();
            }
        }else {
            System.out.println("No existen medicos registrados");
        }

    }

    public void mostrarPaciente(){
        System.out.println("Pacientes registrados\n");

        if (pacientesMap.size()>0){
            for (Paciente paciente: pacientesMap.values()){
                paciente.ImprimirDatosPaciente();
            }
        }else {
            System.out.println("No existen pacientes registrados");
        }
    }

    public void mostrarCitaMedica(){

        System.out.println("Citas Programadas\n");

        if (citasMedicas.size()>0){
            for (CitaMedica citaMedica: citasMedicas){
                citaMedica.imprimirCitaMedica();
            }
        } else {
            System.out.println("No existen citas medicas programadas");
        }
    }

    public void consultarEmpPlanillaDocumento() {
        String documentoEmpPlanilla = JOptionPane.showInputDialog("Ingrese el documento del empleado a consultar");
        EmpleadoPlanilla empleadoPlanilla = null;

        if (empleadoPlanillaMap.containsKey(documentoEmpPlanilla)) {
            empleadoPlanilla = empleadoPlanillaMap.get(documentoEmpPlanilla);

            empleadoPlanilla.ImprimirDatosEmpleadoPlanilla();
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }


    public void consultarEmpEventualDocumento(){
        String documentoEmpEventual=JOptionPane.showInputDialog("Ingrese el documento del empleado a consultar");
        EmpleadoEventual miEmpleadoEventual=null;

        if (empleadoEventualMap.containsKey(documentoEmpEventual)){
            miEmpleadoEventual=empleadoEventualMap.get(documentoEmpEventual);
            miEmpleadoEventual.imprimirDatosEmpleadoEventual();
        } else{
            System.out.println("Empleado no encontrado");
        }
    }

    public void consultarPacienteDocumento(){
        String documentoPaciente=JOptionPane.showInputDialog("Ingrese el documento del paciente a consultar");
        Paciente miPaciente=null;

        if (pacientesMap.containsKey(documentoPaciente)){
            miPaciente= pacientesMap.get(documentoPaciente);
            miPaciente.ImprimirDatosPaciente();
        }else {
            System.out.println("Empleado no encontrado");
        }
    }

    public void consultarMedicoDocumento(){
        String documentoMedico=JOptionPane.showInputDialog("Ingrese le documento del medico a consultar");
        Medico miMedico= null;

        if (medicoMap.containsKey(documentoMedico)){
            miMedico= medicoMap.get(documentoMedico);
            miMedico.imprimirDatosMedico();
        }else {
            System.out.println("Medico no encontrado");
        }
    }
}
