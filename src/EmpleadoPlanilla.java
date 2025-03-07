import javax.swing.*;
import java.util.Date;

public class EmpleadoPlanilla extends Empleado {

    private double salarioMensual;
    private int porcHoraExtra;

    public EmpleadoPlanilla(int DNI, String nombre, String apellido, String fechaNac, String direccion, String ciudadProv, int codEmpleado, int numHorasExtras, String fechaIngreso, String area, String cargo, double salarioMensual, int porcHoraExtra) {
        super(DNI, nombre, apellido, fechaNac, direccion, ciudadProv, codEmpleado, numHorasExtras, fechaIngreso, area, cargo);
        this.salarioMensual = salarioMensual;
        this.porcHoraExtra = porcHoraExtra;
    }

    public EmpleadoPlanilla(){

    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public int getPorcHoraExtra() {
        return porcHoraExtra;
    }

    public void setPorcHoraExtra(int porcHoraExtra) {
        this.porcHoraExtra = porcHoraExtra;
    }

    @Override
    public void registrarDatos (){
        super.registrarDatos();
        salarioMensual=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario mensual"));
        porcHoraExtra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje de horas extras"));
    }

    public void ImprimirDatosEmpleadoPlanilla(){
        super.ImprimirDatosEmpleado();
        System.out.println("Salario mensual:"+salarioMensual);
        System.out.println("Porcentaje horas extra:"+porcHoraExtra);
    }

}
