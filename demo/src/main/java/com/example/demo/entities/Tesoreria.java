package com.example.demo.entities;

public class Tesoreria {
    private float montoMovimiento;
    private float montosPositivos;
    private float montosNegativos;
    private String conceptoMovimiento;
    private String usuarioContabilidad;

    public Tesoreria (){};

    public Tesoreria (float montoMovimiento, float montosPositivos, float montosNegativos, String conceptoMovimiento, String usuarioContabilidad) {
        this.montoMovimiento = montoMovimiento;
        this.montosPositivos = montosPositivos;
        this.montosNegativos = montosNegativos;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioContabilidad = usuarioContabilidad;
    }

    public float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public float getMontosPositivos() {
        return montosPositivos;
    }

    public void setMontosPositivos(float montosPositivos) {
        this.montosPositivos = montosPositivos;
    }

    public float getMontosNegativos() {
        return montosNegativos;
    }

    public void setMontosNegativos(float montosNegativos) {
        this.montosNegativos = montosNegativos;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioContabilidad() {
        return usuarioContabilidad;
    }

    public void setUsuarioContabilidad(String usuarioContabilidad) {
        this.usuarioContabilidad = usuarioContabilidad;
    }
}

