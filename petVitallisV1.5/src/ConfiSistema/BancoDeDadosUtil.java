package ConfiSistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDadosUtil {

    public static Connection conectar(String servidor, String usuario, String senha, String banco) throws SQLException {
        String url = "jdbc:mysql://" + servidor + "/" + banco;
        return DriverManager.getConnection(url, usuario, senha);
    }

    // Método para desconectar do banco de dados
    public static void desconectar(Connection connection) throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    // Método para verificar a conexão com o servidor
    public static boolean verificarConexao(String servidor, String usuario, String senha, String banco) {
        try {
            Connection connection = conectar(servidor, usuario, senha, banco);
            desconectar(connection);
            return true; // Conexão bem-sucedida
        } catch (SQLException ex) {
            return false; // Falha na conexão
        }
 }
}
    