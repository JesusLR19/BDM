package datos;
import modelo.personajes;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonajesDAO {
    public static final String insertSQL = "INSERT INTO PERSONAJES(idpersonaje,nombre,lugarorigen,descripcion) VALUES (?,?,?,?)";
    public static final String updateSQL = "UPDATE PERSONAJES SET nombre =?, lugarorigen=?, descripcion=? WHERE idpersonaje=?";

    public List<personajes> ListaP(){
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet result = null;

        List<personajes> Personajes = new ArrayList<>();
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT * FROM PERSONAJES");
            result = state.executeQuery();
            while (result.next()){
                int id_personaje = result.getInt("idpersonaje");
                String nombre = result.getString("nombre");
                String lugarO = result.getString("lugarorigen");
                String descrip = result.getString("descripcion");

                personajes person = new personajes(id_personaje,nombre,lugarO,descrip);
                Personajes.add(person);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }
        return Personajes;
    }
    public void agregarPersonaje(personajes personaje1){
        Connection conn = null;
        PreparedStatement state = null;
        int registros = 0;

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setInt(1,personaje1.getid());
            state.setString(2,personaje1.getNombre());
            state.setString(3,personaje1.getLugarOrigen());
            state.setString(4,personaje1.getDescription());

            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }

    public int modificarPersonajes(personajes personaje2){
        Connection conn = null;
        PreparedStatement state = null;
        int registros = 0;

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,personaje2.getNombre());
            state.setString(2,personaje2.getLugarOrigen());
            state.setString(3,personaje2.getDescription());

            registros = state.executeUpdate();
            if (registros > 0) System.out.println("Tu registro se ha modificado exitosamente");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
        return registros;
    }
}
