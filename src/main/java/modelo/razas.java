package modelo;

import java.io.Serializable;

public class razas implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private String descripcion;

    public razas(){

    }
    public razas(int id,String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public int getid_Razas(){
        return id;
    }

    public void setid_Razas(int id){
        this.id=id;
    }

    public String getNombre_Razas() {
        return nombre;
    }

    public void setNombre_Razas(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion_Razas() {
        return descripcion;
    }

    public void setDescripcion_Razas(String descripcion) {
        this.descripcion = descripcion;
    }
}
