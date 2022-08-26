package com.example.demo.entities;

public class Empleado {
    //Atributos
    private String nombreEmpleado;
    private String correoEmpleado;
    private String rollEmpleado;
    private int idEmpleado;
    private Empresa empresaEmpleado;

    // Método constructor


    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String correoEmpleado, String rollEmpleado, int idEmpleado, Empresa empresaEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rollEmpleado = rollEmpleado;
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

    public String getRollEmpleado() {
        return rollEmpleado;
    }

    public void setRollEmpleado(String rollEmpleado) {
        this.rollEmpleado = rollEmpleado;
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
