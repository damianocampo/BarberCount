package Entidades;

/**
 * Created by Ismael on 12/08/2016.
 */
public class Producto {
    private String IdProducto;
    private String Nombre;
    private int Precio;

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

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String idProducto) {
        IdProducto = idProducto;
    }
}
