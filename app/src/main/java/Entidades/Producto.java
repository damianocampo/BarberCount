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


    public Producto(String idProducto, String nombre, int precio) {
        IdProducto = idProducto;
        Nombre = nombre;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
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
