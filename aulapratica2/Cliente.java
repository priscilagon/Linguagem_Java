// Define o pacote organizacional chamado 'aulapratica2', agrupando os arquivos da atividade
package aulapratica2;

// Declaração da superclasse pública 'Cliente', que servirá de base para outras classes
public class Cliente {
    
    // Atributos privados (Encapsulamento): comuns a qualquer tipo de cliente
    private String nome;
    private String endereco;
    
    // MÉTODO CONSTRUTOR DA SUPERCLASSE[cite: 6]:
    // Inicializa o nome e o endereço do cliente no momento da instanciação[cite: 6]
    public Cliente(String nome, String endereco){
        // 'this.nome' refere-se ao atributo da classe; 'nome' é o parâmetro recebido[cite: 6]
        this.nome=nome;
        this.endereco=endereco;
    }
    
    // MÉTODOS ACESSORES (GETTERS) E MODIFICADORES (SETTERS)[cite: 6]:
    
    // Retorna o nome cadastrado no cliente[cite: 6]
    public String getNome(){
        return nome;
    }
    
    // Retorna o endereço cadastrado no cliente[cite: 6]
    public String getEndereco(){
        return endereco;
    }
    
    // Atualiza ou define o nome do cliente[cite: 6]
    public void setNome(String nome){
        this.nome=nome;
    }
    
    // Atualiza ou define o endereço do cliente[cite: 6]
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    
    // MÉTODO TOSTRING[cite: 6]:
    // Retorna uma representação textual padrão com os dados gerais do cliente[cite: 6]
    public String toString( ){
        return "nome:"+nome+"endereco:"+endereco;
    }
}