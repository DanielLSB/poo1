/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mutsu
 */
public class Empleado extends Persona{
    private String codigo,puesto;

    public Empleado(){}
    public Empleado(String codigo, String puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.puesto = puesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
System.out.println("Codigo empleado:" + getCodigo());
System.out.println("Puesto:" + getPuesto());
System.out.println("Nombres:" + getNombres());
System.out.println("Nombres:" + getNombres());
System.out.println("Apellidos:" + getApellidos());
System.out.println("Direccion" + getDireccion());
System.out.println("Telefono" + getTelefono());
System.out.println("Fecha_nacimiento:" + getFecha_nacimiento());
    }
    
    @Override
    public void modificar(){
System.out.println("Codigo_empleado: " + getCodigo());
System.out.println("Puesto: " + getPuesto());      
System.out.println("Nombres: " + getNombres());
System.out.println("Apellidos: " + getApellidos());
System.out.println("Direccion: " + getDireccion());
System.out.println("Telefono: " + getTelefono());
System.out.println("Fecha_nacimiento:" + getFecha_nacimiento());
    
    }

        }