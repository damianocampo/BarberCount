package DTOs;

import android.graphics.drawable.Drawable;

/**
 * Created by ocamp on 11/08/2016.
 */
public class EmpleadoDTO {
    protected int Id;
    protected Drawable Foto;
    protected String NombreCompleto;
    protected String Correo;


    public EmpleadoDTO() {
    }
    public EmpleadoDTO(Drawable Foto, String NombreCompleto, String Correo){
        this.Foto = Foto;
        this.NombreCompleto = NombreCompleto;
        this.Correo = Correo;
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

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

}
