package Conexion;
import java.sql.*;
public class ConexionMain {
    //CLASE PARA PROBAR LA CONEXION A LA BASE DE DATOS
    public static void main(String[]args){
        try{
            Connection conn = Conexion.getConnection();

            String sql = "SELECT * FROM razas";
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setString(1,"L%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int idraza = rs.getInt("idraza");
                String nombre = rs.getString("nombre");
                String desc = rs.getString("descripcion");
                System.out.println("ID="+ idraza + "\nNombre:" + nombre +"\nDescripcion:" + desc);
            }
        }catch (SQLException ex){
            ex.printStackTrace(System.out.printf("La conexion fallo"));
        }
    }
}
