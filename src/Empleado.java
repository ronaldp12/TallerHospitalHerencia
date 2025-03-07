import javax.swing.*;
import java.util.Date;

public class Empleado extends Persona {

    private int codEmpleado;
    private int numHorasExtras;
    private String fechaIngreso;
    private String area;
    private String cargo;

    public Empleado(int DNI, String nombre, String apellido, String fechaNac, String direccion, String ciudadProv, int codEmpleado, int numHorasExtras, String fechaIngreso, String area, String cargo) {
        super(DNI, nombre, apellido, fechaNac, direccion, ciudadProv);
        this.codEmpleado = codEmpleado;
        this.numHorasExtras = numHorasExtras;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
    }

    public Empleado (){

    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public int getNumHorasExtras() {
        return numHorasExtras;
    }

    public void setNumHorasExtras(int numHorasExtras) {
        this.numHorasExtras = numHorasExtras;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void ImprimirDatosEmpleado(){
        super.imprimirDatosPersona();
        System.out.println("Codigo Empleado:"+codEmpleado);
        System.out.println("Numero Horas Extras:"+numHorasExtras);
        System.out.println("Fecha Ingreso:"+fechaIngreso);
        System.out.println("Area:"+area);
        System.out.println("Cargo:"+cargo);
    }

    @Override
    public void registrarDatos (){
        super.registrarDatos();
        codEmpleado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del empleado"));
        numHorasExtras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas extras"));
        fechaIngreso=JOptionPane.showInputDialog("Ingrese la fecha de ingreso");
        area=JOptionPane.showInputDialog("Ingrese el area");
        cargo=JOptionPane.showInputDialog("Ingrese el cargo");
    }
}
