package DTOs;

import android.graphics.drawable.Drawable;
import android.renderscript.Double2;

/**
 * Created by Ismael on 12/08/2016.
 */
public class ServicioDTO {

    protected int Id;
    protected Drawable Foto;
    protected String NombreServicio;
    protected Integer Precio;

    public ServicioDTO() {
    }

    public ServicioDTO(int id, Drawable foto, String nombreServicio, Integer precio) {
        Id = id;
        Foto = foto;
        NombreServicio = nombreServicio;
        Precio = precio;
    }

    public ServicioDTO(int id, String nombreServicio, Integer precio) {
        Id = id;
        NombreServicio = nombreServicio;
        Precio = precio;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Drawable getFoto() {
        return Foto;
    }

    public void setFoto(Drawable foto) {
        Foto = foto;
    }

    public String getNombreServicio() {
        return NombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        NombreServicio = nombreServicio;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer precio) {
        Precio = precio;
    }
}
