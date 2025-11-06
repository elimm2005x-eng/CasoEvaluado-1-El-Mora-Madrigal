/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author elimm
 */
public class Vendedor {
    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;
    private boolean tieneVehiculo;
    

    public Vendedor(String nombre, String cedula, String codigo, String sucursal, boolean tieneVehiculo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.tieneVehiculo = tieneVehiculo;
        
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

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isTieneVehiculo() {
        return tieneVehiculo;
    }

    public void setTieneVehiculo(boolean tieneVehiculo) {
        this.tieneVehiculo = tieneVehiculo;
    }
    
    
    
    
    
}
