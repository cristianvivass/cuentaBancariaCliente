/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;

/**
 *
 * @author Cristian Vivas
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private String correoElectronico;
    
    Cliente(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = "00/00/00";
        this.direccion = "0";
        this.ocupacion = "0";
        this.telefono = "(000)000-0000";
        this.correoElectronico= "0";
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getOcupacion(){
        return ocupacion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido =  apellido;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setOcupacion(String acupacion){
        this.ocupacion = ocupacion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setCorreoElectronico(String email){
        this.correoElectronico = correoElectronico;
}
    }
