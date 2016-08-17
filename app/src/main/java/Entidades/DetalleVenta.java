package Entidades;

/**
 * Created by ocamp on 15/08/2016.
 */
public class DetalleVenta {

    private String IdDetalleVenta;
    private int Cantidad;
    private double PrecioUnitario;
    private double TotalPrecioVenta;
    private Venta Venta;
    private Producto Producto;


    public DetalleVenta(){
    }

    public String getIdDetalleVenta() {
        return IdDetalleVenta;
    }

    public void setIdDetalleVenta(String idDetalleVenta) {
        IdDetalleVenta = idDetalleVenta;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        PrecioUnitario = precioUnitario;
    }

    public double getTotalPrecioVenta() {
        return TotalPrecioVenta;
    }

    public void setTotalPrecioVenta(double totalPrecioVenta) {
        TotalPrecioVenta = totalPrecioVenta;
    }

    public Venta getVenta() {
        return Venta;
    }

    public void setVenta(Venta venta) {
        Venta = venta;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto producto) {
        Producto = producto;
    }
}
