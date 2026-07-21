// Indica que este arquivo executável pertence ao mesmo pacote 'aulapratica1' da classe modelo[cite: 5]
package aulapratica1;

// Declaração da classe principal de execução chamada 'PessoaApp'[cite: 5]
public class PessoaApp {
    
    // Método principal 'main', ponto obrigatório onde a execução do programa Java inicia[cite: 5]
    public static void main(String[] args){
        
        // INSTANCIAÇÃO DO PRIMEIRO OBJETO:
        // Cria na memória um novo objeto chamado 'pessoa1' do tipo 'Pessoa' usando o operador 'new'[cite: 5]
        // O construtor é chamado passando o código inteiro 1 e a string "Elder" como argumentos iniciais[cite: 4, 5]
        Pessoa pessoa1 = new Pessoa(1,"Elder");
        
        // INSTANCIAÇÃO DO SEGUNDO OBJETO:
        // Cria um segundo objeto independente chamado 'pessoa2', atribuindo-lhe o código 2 e o nome "Ana"[cite: 4, 5]
        Pessoa pessoa2 = new Pessoa(2,"Ana");
        
        // CONSULTA DE DADOS VIA GETTER:
        // Imprime no console uma mensagem concatenada com o resultado do método acessor 'getNome()' de pessoa1[cite: 4, 5]
        // A saída impressa na tela será: "o nome do objeto pessoa1 eh: Elder"[cite: 5]
        System.out.println("o nome do objeto pessoa1 eh: "+pessoa1.getNome());
        
        // ATUALIZAÇÃO DE DADOS VIA SETTER:
        // Utiliza o método modificador 'setNome' para substituir de forma segura o texto do atributo 'nome' do objeto pessoa1[cite: 4, 5]
        // O valor interno de 'pessoa1' muda de "Elder" para "Helder"[cite: 4, 5]
        pessoa1.setNome("Helder");
        
        // VERIFICAÇÃO DA ALTERAÇÃO:
        // Executa novamente a consulta com 'getNome()' para comprovar que a mudança foi aplicada na memória do objeto[cite: 4, 5]
        // A nova saída impressa no console será: "o nome do objeto pessoa1 eh: Helder"[cite: 5]
        System.out.println("o nome do objeto pessoa1 eh: "+pessoa1.getNome());
    }
}