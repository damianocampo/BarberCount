package Entidades;

/**
 * Created by ocamp on 11/08/2016.
 */
public class Empleado {
    private String NombreCompleto;
    private String Correo;


    public Empleado() {
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
