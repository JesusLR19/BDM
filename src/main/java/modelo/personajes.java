package modelo;

import java.io.Serializable;

public class personajes implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private String lugarOrigen;
    private String description;

    public personajes() {

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

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
