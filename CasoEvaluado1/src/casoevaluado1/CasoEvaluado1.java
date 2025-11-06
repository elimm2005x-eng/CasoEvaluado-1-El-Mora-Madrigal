
package casoevaluado1;
import javax.swing.JOptionPane;
/**
 *
 * @author elimm
 */
public class CasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sucursal = JOptionPane.showInputDialog("Ingrese el nombre de la sucursal a la cual pertenece:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del agente de ventas:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del agente de ventas:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del agente de ventas:");
        String vehiculo = JOptionPane.showInputDialog("¿El agente de ventas tiene carro? (si/no):");
        
        boolean tieneVehiculo = false;
        if (vehiculo.equalsIgnoreCase("si")) {
            tieneVehiculo = true;
        }
        
        Vendedor vendedor = new Vendedor(nombre, cedula, codigo, sucursal, tieneVehiculo);
        
        int puntosVendedor = 0;
        int totalMonto = 0;
        String nombreMes;
        double comision = 0;
        String bonoExtra = null;
        
        int totalFacturas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas facturas desea registrar?"));
        int contador = 1;

       
        while (contador <= totalFacturas) {

            JOptionPane.showMessageDialog(null, "Registro de factura #" + contador);

            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cedula del cliente:");
            String codigoFactura = JOptionPane.showInputDialog("Ingrese el código de la actividad:");
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes en el que se realizo (1-12):"));
            
            while (mes < 1 || mes > 12) {
                mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes valido entre (1-12)"));
            }
            int proElectronico = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos de electronicos tiene la factura?:"));
            int proAutomotriz = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos de electronicos tiene la factura?:"));
            int proContructor = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos de electronicos tiene la factura"));
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura correspondiente:"));
            while (montoFactura < 0) {
                montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Monto de factura invalido, ingrese un monto valido:"));
            }
            
            Cliente cliente = new Cliente(nombreCliente, cedulaCliente, codigoFactura, proElectronico, proAutomotriz, proContructor, montoFactura, mes);
            
            int puntos = 0;
            double bonoFactura = 0;
            double comisiones = 0;
            
            if (cliente.getProElectricos() >= 1 && cliente.getProAutomotrices() >= 1 && cliente.getProConstruccion() >= 1 )
                puntos = puntos + 3;
                bonoFactura = bonoFactura + 0.10;
            
                if (cliente.getProElectricos() >= 3) {
                puntos = puntos + 1;
                }
                if (cliente.getProAutomotrices()> 4) {
                puntos = puntos + 1;
                }
                if (cliente.getProConstruccion()>= 1) {
                puntos = puntos + 2;
                }
                else {
                    if (cliente.getProElectricos() >= 3) {
                    puntos = puntos + 1;
                    bonoFactura = bonoFactura + 0.04;
                    }
                    else {
                        bonoFactura = bonoFactura + 0.02;}
                    }
                    if (cliente.getProAutomotrices()> 4) {
                    puntos = puntos + 1;
                    bonoFactura = bonoFactura + 0.04;
                    }
                    else {
                        bonoFactura = bonoFactura + 0.02;
                    }
                    if (cliente.getProConstruccion()>= 1) {
                    puntos = puntos + 2;
                    bonoFactura = bonoFactura + 0.08;
                    }
                    
                if (totalFacturas > 3 || cliente.getMontoFactura()>300000){
                    comisiones = comisiones + 20000; 
                    bonoExtra = "Si";
                }
                else {
                    bonoExtra = "no";
                }
                if (cliente.getMontoFactura()> 50000) {
                    puntos = puntos + 1;
                    bonoFactura = bonoFactura + 0.05;
                }
                
                
                
                
                comisiones = comisiones + (bonoFactura * cliente.getMontoFactura());
                comision = comisiones;
                puntosVendedor = puntos;
                totalMonto = (int) cliente.getMontoFactura();
                contador = contador + 1;
            
            }
       
            String mensaje = "El agente vendedor: " + vendedor.getNombre()+" codigo: " + vendedor.getCodigo() + 
                "\nVendio un total de: " + totalMonto + " en facturas"+
                "\nObtuvo un total: " + comision +" en comisiones"+
                "\nEl agente vendedor: " + bonoExtra +" logro el objetivo de llegar al BONO EXTRA"+
                "\nPuntos obtenidos por el vendedor: " + puntosVendedor +
                "\nEl agente cuenta con vehiculo propio: " + tieneVehiculo + 
                "\nSucursal: " + sucursal;
            
            JOptionPane.showMessageDialog(null, mensaje);
            
            
        }
    }
    

