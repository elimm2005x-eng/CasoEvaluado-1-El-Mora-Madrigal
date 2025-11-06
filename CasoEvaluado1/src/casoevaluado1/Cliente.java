/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author elimm
 */
public class Cliente {
    private String nombre;
    private String cedula;
    private String codigo;
    private int proElectricos;
    private int proAutomotrices;
    private int proConstruccion;
    private double montoFactura;
    private int mes;
    

    public Cliente(String nombre, String cedula, String codigo, int proElectricos, int proAutomotrices, int proConstruccion, double montoFactura, int mes) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.proElectricos = proElectricos;
        this.proAutomotrices = proAutomotrices;
        this.proConstruccion = proConstruccion;
        this.montoFactura = montoFactura;
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getProElectricos() {
        return proElectricos;
    }

    public void setProElectricos(int proElectricos) {
        this.proElectricos = proElectricos;
    }

    public int getProAutomotrices() {
        return proAutomotrices;
    }

    public void setProAutomotrices(int proAutomotrices) {
        this.proAutomotrices = proAutomotrices;
    }

    public int getProConstruccion() {
        return proConstruccion;
    }

    public void setProConstruccion(int proConstruccion) {
        this.proConstruccion = proConstruccion;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    
}

        