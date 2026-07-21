// Indica que o arquivo pertence ao mesmo pacote organizacional 'aulapratica2'
package aulapratica2;

// A palavra-chave 'extends' estabelece a HERANÇA: ClientePF é uma subclasse (filha) de Cliente
public class ClientePF extends Cliente{
    
    // Atributo exclusivo deste perfil de cliente: Cadastro de Pessoa Física
    private String cpf;
    
    // CONSTRUTOR DA SUBCLASSE:
    // Recebe os dados gerais (nome, endereço) e o dado específico (cpf)
    public ClientePF(String nome, String endereco,String cpf){
        // A palavra-chave 'super' invoca o construtor da superclasse (Cliente) para inicializar nome e endereço
        super(nome,endereco);
        // Inicializa o atributo 'cpf', que pertence exclusivamente a esta subclasse
        this.cpf=cpf;
    }
    
    // Getter para consultar o CPF
    public String getCpf()
    {
        return cpf;
    }
    
    // Setter para alterar o CPF
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
     
    // SOBRESCRITA DE MÉTODO (OVERRIDING)[cite: 8]:
    // Redefine o método toString() herdado da superclasse para adicionar o CPF na impressão
    public String toString(){
        // 'super.toString()' chama a representação textual da classe mãe ("nome:...endereco:...") e concatena com o CPF
        return super.toString()+"cpf:"+cpf;
    }
}