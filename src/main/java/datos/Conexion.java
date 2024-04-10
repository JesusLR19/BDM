package datos;
import java.sql.*;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
public class Conexion {
    private static String user = "postgres";
    private static String pswd = "211910"; //Colocar la contraseña que tengan en su bd
    private static String bd = "tierra_sr_anillos"; //colocar el nombre que le pusieron a la bd
    private static String server = "jdbc:postgresql://localhost:5432/" + bd;
    private static String driver =  "org.postgresql.Driver";

    private static BasicDataSource ds;

    public static DataSource getDataSource(){
        if (ds == null){
            ds = new BasicDataSource();
            ds.setUrl(server);
            ds.setUsername(user);
            ds.setPassword(pswd);
            ds.setInitialSize(50);
            ds.setDriverClassName(driver);
        }
        return ds;
    }

    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs){
        try {
            rs.close();
        }catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void close(PreparedStatement ps){
        try{
            ps.close();
        }catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void close(Connection conn){
        try{
            conn.close();
        }catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
