// Define o pacote organizacional chamado 'aulapratica3', agrupando as classes desta atividade
package aulapratica3;

// Declaração da classe pública chamada 'ContaCorrente'
public class ContaCorrente {
    
    // Declaração dos atributos privados da classe para garantir o Encapsulamento.
    // Os atributos 'numero' e 'agencia' armazenam valores inteiros.
    private int numero, agencia;
    
    // O atributo 'limite' armazena o valor do cheque especial usando o tipo de ponto flutuante 'float'.
    private float limite;
    
    // PRIMEIRO CONSTRUTOR (Conta Comum):
    // Responsável por inicializar objetos que precisam apenas de número e agência.
    public ContaCorrente(int numero, int agencia){
        // A palavra-chave 'this' referencia o atributo da própria classe.
        // O valor do parâmetro 'numero' recebido é atribuído à variável de instância 'this.numero'.
        this.numero=numero;
        
        // O valor do parâmetro 'agencia' recebido é atribuído à variável de instância 'this.agencia'.
        this.agencia=agencia;
    }
    
    // SEGUNDO CONSTRUTOR (Conta Especial - Aplicação de Sobrecarga/Overloading):
    // Responsável por inicializar objetos recebendo três parâmetros simultaneamente.
    public ContaCorrente(int numero, int agencia, float limite){
        // Atribui o número recebido por parâmetro ao atributo interno do objeto[cite: 2].
        this.numero=numero;
        
        // Atribui a agência recebida por parâmetro ao atributo interno do objeto[cite: 2].
        this.agencia=agencia;
        
        // Atribui o limite de crédito recebido ao atributo da classe 'this.limite'[cite: 2].
        this.limite=limite;
    }
    
}