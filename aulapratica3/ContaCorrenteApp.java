// Informa que a classe executável pertence ao mesmo pacote organizacional 'aulapratica3'
package aulapratica3;

// Declaração da classe pública de execução 'ContaCorrenteApp'
public class ContaCorrenteApp{ 
        
        // Método principal 'main', que atua como o ponto de entrada e execução padrão do programa Java
        public static void main(String[] args){
             
            // INSTANCIAÇÃO DE UMA CONTA COMUM:
            // Cria um objeto chamado 'contacomum' do tipo 'ContaCorrente' usando o operador 'new'.
            // Ao passar dois inteiros (124, 542), o Java aciona automaticamente o PRIMEIRO construtror da classe.
            ContaCorrente contacomum = new ContaCorrente(124,542);
            
            // INSTANCIAÇÃO DE UMA CONTA ESPECIAL:
            // Cria um objeto chamado 'contaespecial' utilizando o operador 'new'[cite: 3].
            // Ao passar três parâmetros (124, 549, 1000.00f), o compilador aciona o SEGUNDO construtor[cite: 3].
            // A letra 'f' minúscula ao final do número 1000.00f indica explicitamente ao Java que se trata de um literal do tipo 'float'[cite: 3].
            ContaCorrente contaespecial = new ContaCorrente(124,549,1000.00f);  
      }   
}