package impuntuales.kisde.com.proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // URL de conexión, usuario y contraseña de la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/tu_base_de_datos";
    private static final String USER = "root";
    private static final String PASSWORD = "tu_contraseña";

    // Método para obtener la conexión a la base de datos
    public static Connection getConnection() {
        try {
            // Intentar obtener la conexión
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // Si ocurre un error, imprimir el mensaje y retornar null
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
            return null;
        }
    }
}
