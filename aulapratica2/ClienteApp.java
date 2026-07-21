// Indica o pacote do programa
package aulapratica2;

// Classe executável do sistema bancário/comercial
public class ClienteApp {
    
    // Método principal, ponto de entrada para execução da Máquina Virtual Java (JVM)
    public static void main(String[] args){
        
       // INSTANCIAÇÃO DE UMA PESSOA FÍSICA
       // Cria o objeto 'clientepf1', passando nome, endereço e CPF para o construtor de ClientePF
       ClientePF clientepf1 = new ClientePF(" João Lucas Oliveira","Av.Tapajós,19, Centro","999.888.02.89");
       
       // INSTANCIAÇÃO DE UMA PESSOA JURÍDICA
       // Cria o objeto 'clientepj1', passando nome, endereço e CNPJ para o construtor de ClientePJ
       ClientePJ clientepj1 = new ClientePJ(" Maria das Graças Voz","Rua Horinzonte,609, Cidade Nova","88.999.777/0001-22");
        
       // USO DE MÉTODOS HERDADOS
       // Chama os métodos getNome() e getEndereco(). Embora não estejam escritos em ClientePF,
       // eles foram herdados automaticamente da superclasse Cliente.
       System.out.println("cliente pf dados:"+clientepf1.getNome() + " "+ clientepf1.getEndereco());
       
       // IMPRESSÃO DOS OBJETOS (Polimorfismo / Sobrescrita)
       // Invoca o método toString() sobrescrito em ClientePF, exibindo nome, endereço e CPF
       System.out.println(clientepf1.toString());
        
       // Invoca o método toString() sobrescrito em ClientePJ, exibindo nome, endereço e CNPJ
       System.out.println(clientepj1.toString()); 
    }   
}