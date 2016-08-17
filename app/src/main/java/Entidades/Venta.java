package Entidades;

import java.util.Date;
import java.util.List;

/**
 * Created by ocamp on 16/08/2016.
 */
public class Venta {
    private String IdVenta;
    private double Total;
    private Date Fecha;
    private String NumeroVenta;
    private List<DetalleVenta> DetalleVenta;


     public Venta(){

     }

    public String getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(String idVenta) {
        IdVenta = idVenta;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getNumeroVenta() {
        return NumeroVenta;
    }

    public void setNumeroVenta(String numeroVenta) {
        NumeroVenta = numeroVenta;
    }

    public List<DetalleVenta> getDetalleVenta() {
        return DetalleVenta;
    }

    public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
        DetalleVenta = detalleVenta;
    }
}
