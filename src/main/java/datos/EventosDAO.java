package datos;
import modelo.eventos;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class EventosDAO {
    public static final String inserSQL = "INSERT INTO EVENTOS(nombre,descripcion,fecha,idlugar) VALUES (?,?,?,?)";
    public static final String updateSQL = "UPDATE EVENTOS SET descripcion=?,fecha=?,idlugar=? WHERE nombre=?";

    public List<eventos> Listar(){
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet result = null;

        List<eventos> evento = new ArrayList<>();

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT * FROM EVENTOS");
            result = state.executeQuery();
            while (result.next()){
                String nombre = result.getString("nombre");
                String descripcion = result.getString("descripcion");
                String fecha = result.getString("fecha");
                int idlugar = result.getInt("idlugar");

                eventos event = new eventos(nombre,descripcion,fecha,idlugar);
                evento.add(event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }
        return evento;
    }
    public void AgregarEvento(eventos evento1){
        Connection conn = null;
        PreparedStatement state = null;
        int registros = 0;

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,evento1.getNombre());
            state.setString(2,evento1.getDescription());
            state.setString(3,evento1.getFecha());
            state.setInt(4,evento1.getIdlugar());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }

    public int modificarEventos(eventos eventos2){
        Connection conn = null;
        PreparedStatement state = null;
        int registros = 0;

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,eventos2.getNombre());
            state.setString(2, eventos2.getDescription());
            state.setString(3,eventos2.getFecha());
            state.setInt(4,eventos2.getIdlugar());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
        return registros;
    }

}
