// Define o pacote organizacional chamado 'aulapratica1', agrupando as classes desta atividade[cite: 4]
package aulapratica1;

// Declaração da classe pública chamada 'Pessoa', que servirá de modelo para criar objetos[cite: 4]
public class Pessoa {
    
    // Declaração dos atributos privados (Encapsulamento):
    // O atributo 'codigo' armazena um valor inteiro, acessível diretamente apenas dentro desta classe[cite: 4]
    private int codigo;
    
    // O atributo 'nome' armazena uma cadeia de texto (String), também restrita ao escopo local[cite: 4]
    private String nome;
    
    // MÉTODO CONSTRUTOR:
    // Responsável por inicializar os atributos do objeto no momento exato em que ele é instanciado na memória[cite: 4]
    public Pessoa(int codigo, String nome){
        // A palavra-chave 'this' diferencia o atributo interno da classe do parâmetro de mesmo nome recebido no construtor[cite: 4]
        this.codigo=codigo;
        this.nome=nome;
    }
    
    // MÉTODOS ACESSORES (GETTERS) E MODIFICADORES (SETTERS):
    
    // Método público acessor para consultar o código cadastrado[cite: 4]
    public int getCodigo(){
        // Retorna para quem chamou o valor atual armazenado no atributo privado 'codigo'[cite: 4]
        return codigo;
    }
    
    // Método público modificador para atualizar ou redefinir o código[cite: 4]
    public void setCodigo(int codigo){
        // Atribui o novo valor de código recebido por parâmetro à variável interna da instância[cite: 4]
        this.codigo=codigo;
    }
    
    // Método público acessor para consultar o nome cadastrado[cite: 4]
    public String getNome(){
        // Retorna o valor de texto atualmente salvo no atributo 'nome'[cite: 4]
        return nome;
    }
    
    // Método público modificador para alterar o nome do objeto em tempo de execução[cite: 4]
    public void setNome(String nome){
        // Substitui o texto do atributo interno 'nome' pela nova string fornecida como argumento[cite: 4]
        this.nome=nome;
    }
}