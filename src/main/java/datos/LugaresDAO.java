package datos;
import modelo.lugares;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class LugaresDAO {
    public static final String insertSQL = "INSERT INTO LUGARES(idlugar,nombre,descripcion,region) VALUES (?,?,?,?)";
    public static final String updateSQL = "UPDATE LUGARES SET nombre=?, descripcion=?, region=? WHERE idlugar=?";

    public List<lugares> Listar(){
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet result = null;

        List<lugares> Lugares = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT * FROM LUGARES");
            result = state.executeQuery();

            while (result.next()){
                int idlugar = result.getInt("idlugar");
                String nombre = result.getString("nombre");
                String descripcion = result.getString("descripcion");
                String region = result.getString("region");

                lugares lugar = new lugares(idlugar,nombre,descripcion,region);
                Lugares.add(lugar);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(result);
            Conexion.close(conn);
        }
        return Lugares;
    }

    public void AgregarLugar(lugares lugar1){
        Connection conn = null;
        PreparedStatement state = null;
        int registros = 0;

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setInt(1,lugar1.getid());
            state.setString(2,lugar1.getNombre());
            state.setString(3,lugar1.getDescription());
            state.setString(4,lugar1.getRegion());

            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }

    public int modificarLugar(lugares lugar2){
        Connection conn = null;
        PreparedStatement state = null;
        int registros = 0;

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,lugar2.getNombre());
            state.setString(2,lugar2.getDescription());
            state.setString(3,lugar2.getRegion());

            registros = state.executeUpdate();
            if (registros > 0) System.out.println("Tu registro se ha modificado con exito");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
        return registros;
    }

}
