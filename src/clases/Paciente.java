package clases;

import javax.swing.*;

public class Paciente extends Persona {

    private int numHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private String medicamentosAlergia;

    public Paciente(int DNI, String nombre, String apellido, String fechaNac, String direccion, String ciudadProv, int numHistoriaClinica, String sexo, String grupoSanguineo, String medicamentosAlergia) {
        super(DNI, nombre, apellido, fechaNac, direccion, ciudadProv);
        this.numHistoriaClinica = numHistoriaClinica;
        this.sexo = sexo;
        this.grupoSanguineo = grupoSanguineo;
        this.medicamentosAlergia = medicamentosAlergia;
    }

    public Paciente (){

    }

    public int getNumHistoriaClinica() {
        return numHistoriaClinica;
    }

    public void setNumHistoriaClinica(int numHistoriaClinica) {
        try {
            this.numHistoriaClinica= Integer.parseInt(String.valueOf(numHistoriaClinica));
        }catch (NumberFormatException e){
            System.out.println("¡Error! El numero de la historia clinica debe ser un valor numerico");

        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getMedicamentosAlergia() {
        return medicamentosAlergia;
    }

    public void setMedicamentosAlergia(String medicamentosAlergia) {
        this.medicamentosAlergia = medicamentosAlergia;
    }

    @Override
    public void registrarDatos(){
        super.registrarDatos();
        numHistoriaClinica=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de historia clinica"));
        sexo=JOptionPane.showInputDialog("Ingrese el sexo");
        grupoSanguineo=JOptionPane.showInputDialog("Ingrese el grupo sanguineo");
        medicamentosAlergia=JOptionPane.showInputDialog("Ingrese los medicamentos alergicos");
    }

    public void ImprimirDatosPaciente(){
        super.imprimirDatosPersona();
        System.out.println("Numero Histria Clinica:"+numHistoriaClinica);
        System.out.println("Sexo:"+sexo);
        System.out.println("Grupo Sanguineo:"+grupoSanguineo);
        System.out.println("Medicamentos Alergicos:"+medicamentosAlergia);
    }
}
