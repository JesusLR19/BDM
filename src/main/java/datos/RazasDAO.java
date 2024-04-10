package datos;
import Conexion.Conexion;
import modelo.razas;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class RazasDAO {
    public static final String insertSQL = "INSERT INTO RAZAS(idpersonaje,nombre,lugarorigen,descripcion,idraza) VALUES (?,?,?,?,?)";
    public static final String updateSQL = "UPDATE RAZAS SET nombre=?, lugarorigen=?, descripcion=?, idraza=? WHERE idpersona=?";

    public List<razas> Listar(){
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet result = null;

        List<razas> raza = new ArrayList<>();

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT * FROM RAZAS");
            result = state.executeQuery();
            while (result.next()){
                int idraza = result.getInt("idraza");
                String nombre = result.getString("nombre");
                String descripcion = result.getString("descripcion");

                razas Razas = new razas(idraza,nombre,descripcion);
                raza.add(Razas);

            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }
        return raza;
    }

    public void agregarRaza(razas raz){
        Connection conn = null;
        PreparedStatement state = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setInt(1,raz.getid_Razas());
            state.setString(2,raz.getNombre_Razas());
            state.setString(3, raz.getDescripcion_Razas());

            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }

    public int modificarRazas(razas raz1){
        Connection conn = null;
        PreparedStatement state = null;
        int registros = 0;

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,raz1.getNombre_Razas());
            state.setString(2, raz1.getDescripcion_Razas());

            registros = state.executeUpdate();
            if(registros > 0 ) System.out.println("Tu registro de razas ha sido actualizado");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
        return registros;
    }
}
