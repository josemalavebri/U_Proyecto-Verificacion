
package Data.SQLite;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Paciente;


public class PacientexternalRepository extends ExternalRepository<Paciente> {

    @Override
    public ArrayList<Paciente> all() {
        String sql = "SELECT p.id, p.correo, per.cedula, per.nombre, per.apellido, per.edad, per.telefono, per.genero " +
                     "FROM Paciente p " +
                     "INNER JOIN Persona per ON p.id = per.id";

        ArrayList<Paciente> pacientes = new ArrayList<>();

        try (Connection conn = DBConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                int cedula = rs.getInt("cedula");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                String correo = rs.getString("correo");
                int telefono = rs.getInt("telefono");
                String genero = rs.getString("genero");

                Paciente paciente = new Paciente(id, cedula, nombre, apellido, edad, correo, telefono, genero);
                pacientes.add(paciente);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener pacientes: " + e.getMessage());
        }

        return pacientes;
    }

    @Override
    public boolean add(Paciente entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Paciente entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

}
