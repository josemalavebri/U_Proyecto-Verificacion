
package Data.SQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static Connection conn = null;

    public static Connection connect() {
        try {
            if (conn == null || conn.isClosed()) {
                    String dbPath = "C:/Users/Falconi/Documents/NetBeansProjects/U_Proyecto-Verificacion/ConsultorioMedico/db/ConsultorioMedico.db";
                String url = "jdbc:sqlite:" + dbPath;
                    conn = DriverManager.getConnection(url);
                    System.out.println("Conexión exitosa a SQLite");

            } 
        } catch (SQLException e) {
                    System.out.println("Error de conexión: " + e.getMessage());
        }
        return conn;
    }

    public static void close() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
}
