import javax.swing.*;
import java.util.Date;

public class EmpleadoEventual extends Empleado {

    private int honorariosHora;
    private String fechaTerminoContrato;

    public EmpleadoEventual(int DNI, String nombre, String apellido, String fechaNac, String direccion, String ciudadProv, int codEmpleado, int numHorasExtras, String fechaIngreso, String area, String cargo, int honorariosHora, String fechaTerminoContrato) {
        super(DNI, nombre, apellido, fechaNac, direccion, ciudadProv, codEmpleado, numHorasExtras, fechaIngreso, area, cargo);
        this.honorariosHora = honorariosHora;
        this.fechaTerminoContrato = fechaTerminoContrato;
    }

    public EmpleadoEventual () {

    }

    public int getHonorariosHora() {
        return honorariosHora;
    }

    public void setHonorariosHora(int honorariosHora) {
        this.honorariosHora = honorariosHora;
    }

    public String getFechaTerminoContrato() {
        return fechaTerminoContrato;
    }

    public void setFechaTerminoContrato(String fechaTerminoContrato) {
        this.fechaTerminoContrato = fechaTerminoContrato;
    }
    @Override
    public void registrarDatos(){
        super.registrarDatos();
        honorariosHora=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el honorario por hora"));
        fechaTerminoContrato=JOptionPane.showInputDialog("Ingrese la fecha de termino de contrato");
    }


    public void imprimirDatosEmpleadoEventual(){
        super.ImprimirDatosEmpleado();
        System.out.println("Honorarios por Hora" +honorariosHora);
        System.out.println("Fecha termino contrato"+fechaTerminoContrato);
    }

}
