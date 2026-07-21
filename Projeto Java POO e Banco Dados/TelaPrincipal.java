import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;

public class TelaPrincipal extends JFrame {
    
    public TelaPrincipal() {
        // Configurações básicas da janela
        setTitle("Sistema com Banco de Dados");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Cria um painel e um botão
        JPanel painel = new JPanel();
        JButton btnTestarConexao = new JButton("Testar Conexão");
        
        // Adiciona evento de clique ao botão
        btnTestarConexao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama a classe de conexão feita no Passo 1
                Connection con = ConexaoBanco.conectar();
                if (con != null) {
                    JOptionPane.showMessageDialog(null, "Conectado ao MySQL com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Falha na conexão. Verifique o console.");
                }
            }
        });
        
        painel.add(btnTestarConexao);
        add(painel);
    }

    public static void main(String[] args) {
        // Roda a interface gráfica
        SwingUtilities.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }
}