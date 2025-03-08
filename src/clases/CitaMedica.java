package clases;

import empleado.Medico;

import javax.swing.*;

public class CitaMedica {

    private Paciente paciente;
    private Medico medico;
    private String servicio;
    private String fechaCita;
    private String horaCita;
    ModeloDatos mimodeloDatos;

    public CitaMedica(Paciente paciente, Medico medico, String servicio, String fechaCita, String horaCita) {
        this.paciente = paciente;
        this.medico = medico;
        this.servicio = servicio;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }

    public CitaMedica(){

    }


    public void registrarCitaMedica(){
        String documentoPaciente= JOptionPane.showInputDialog("Ingrese el documento del paciente");
        Paciente pacienteEncontrado=mimodeloDatos.consultarPacientePorDocumento(documentoPaciente);

        if (documentoPaciente!=null){
            String nombreMedico= JOptionPane.showInputDialog("Ingrese el nombre del medico");
            Medico medicoEncontrado=mimodeloDatos.consultarMedicoPorNombre(nombreMedico);

            if (medicoEncontrado!=null){
                String servicio=JOptionPane.showInputDialog("Ingrese el servicio de la cita medica");
                String fechaCita=JOptionPane.showInputDialog("Ingrese la fecha de la cita");
                String horaCita= JOptionPane.showInputDialog("Ingrese la hora de la cita");
                String lugar= "Lugar de la cita "+ medico.getNumConsultorio();

                CitaMedica citaMedica=new CitaMedica(pacienteEncontrado,medicoEncontrado,servicio,fechaCita,horaCita);
                mimodeloDatos.registrarCitaMedica(citaMedica);
            }else {
                System.out.println("Nombre del medico no encontrado");
            }
        }else {
            System.out.println("Documento del paciente no encontrado");
        }
    }

    public void imprimirCitaMedica(){
        System.out.println("Nombre del clases.Paciente:" + paciente.getNombre());
        System.out.println("Nombre del medico:" + medico.getNombre());
        System.out.println("Servicio:" + servicio);
        System.out.println("Fecha de la cita:" + fechaCita);
        System.out.println("Hora de la cita:" + horaCita);
    }

}
