// Importa a classe Connection, que gerencia a conexão com o banco de dados
import java.sql.Connection;
// Importa a classe DriverManager, responsável por carregar o driver do banco
import java.sql.DriverManager;
// Importa a classe SQLException para tratar erros de banco de dados
import java.sql.SQLException;

// Declaração da classe principal de conexão
public class ConexaoBanco {
    // Define a URL do banco de dados MySQL (localhost, porta 3306, banco 'meu_banco')
    private static final String URL = "jdbc:mysql://localhost:3306/meu_banco";
    // Define o usuário de acesso ao MySQL
    private static final String USUARIO = "root";
    // Define a senha de acesso ao MySQL
    private static final String SENHA = "root";

    // Método público e estático que retorna um objeto Connection
    public static Connection conectar() {
        // Tenta executar o bloco de código sujeito a erros
        try {
            // Retorna a conexão estabelecida usando as credenciais fornecidas
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        // Captura exceções do tipo SQLException (erros de banco)
        } catch (SQLException e) {
            // Imprime o erro no console para depuração
            System.out.println("Erro ao conectar: " + e.getMessage());
            // Retorna nulo indicando que a conexão falhou
            return null;
        }
    }
}