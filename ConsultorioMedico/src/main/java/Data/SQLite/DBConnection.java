
package Data.SQLite;

import com.sun.tools.javac.Main;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

    private static Connection conn = null;

    private static final String dbName = "ConsultorioMedico.db";
    private static final String userHome = System.getProperty("user.home");
    private static final String destDir = userHome + File.separator + "ConsultorioMedico";
    private static final String destPath = destDir + File.separator + dbName;

    public static void installDB() {
        File destFile = new File(destPath);
        if (!destFile.exists()) {
            try {
                Files.createDirectories(Paths.get(destDir));
                
                try (InputStream is = DBConnection.class.getResourceAsStream("/" + dbName)) {
                    if (is == null) {
                        System.out.println("❌ No se encontró el archivo embebido: /" + dbName);
                        return;
                    }

                    Files.copy(is, destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("📄 Base de datos copiada a: " + destPath);
                } 

            } catch (IOException e) {
                System.out.println("❌ Error copiando la base de datos:");
                e.printStackTrace();
            }
        } else {
            System.out.println("📄 Base de datos ya existe en: " + destPath);
        }
    }

    public static Connection connect() {
        try {
            if (conn == null || conn.isClosed()) {
                String url = "jdbc:sqlite:" + destPath;
                conn = DriverManager.getConnection(url);
                System.out.println("✅ Conexión exitosa a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }
    
    
    
    /*
    public static Connection connect() {
        try {
            if (conn == null || conn.isClosed()) {
                    String dbPath = "C:/Users/josem/Downloads/Archivos/Proyecto_verificacion/Proyecto_Verificacion/ConsultorioMedico/db/ConsultorioMedico.db";
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
    }*/
    
}
