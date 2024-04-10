package modelo;

import java.io.Serializable;

public class eventos implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private String description;
    private String fecha;


    public eventos() {

    }

    public int getid(){
        return id;
    }

    public void setid(int id){
        this.id=id;
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

}
