package com.example.demo.entities;

public class Empleado {
    //Atributos
    private String nombreEmpleado;
    private String correoEmpleado;
    private String rolEmpleado;
    private int idEmpleado;
    private Empresa empresaEmpleado;

    // Método constructor


    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String correoEmpleado, String rolEmpleado, int idEmpleado, Empresa empresaEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.idEmpleado = idEmpleado;
        this.empresaEmpleado = empresaEmpleado;
    }
    // Métodos getter and setter
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rollEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }
}
