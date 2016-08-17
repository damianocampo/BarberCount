package Entidades;

/**
 * Created by Ismael on 12/08/2016.
 */
public class Producto {
    private String IdProducto;
    private String Nombre;
    private String Descripcion;
    private double Precio;
    private String Tipo;
    private int Cantidad;
    private  Negocio Negocio;


    public Producto() {
    }

    public Producto(String idProducto, String nombre, double precio) {
        IdProducto = idProducto;
        Nombre = nombre;
        Precio = precio;
    }

    public Producto(String idProducto, String nombre, String descripcion, double precio, Entidades.Negocio negocio, int cantidad, String tipo) {
        IdProducto = idProducto;
        Nombre = nombre;
        Descripcion = descripcion;
        Precio = precio;
        Negocio = negocio;
        Cantidad = cantidad;
        Tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String idProducto) {
        IdProducto = idProducto;
    }
}
