package modelo;

import java.io.Serializable;

public class eventos implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String description;
    private String fecha;
    private int idlugar;


    public eventos() {

    }

    public eventos(String nombre, String description, String fecha, int idlugar) {
        this.nombre = nombre;
        this.description = description;
        this.fecha = fecha;
        this.idlugar = idlugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdlugar() {
        return idlugar;
    }

    public void setIdlugar(int idlugar) {
        this.idlugar = idlugar;
    }
}

