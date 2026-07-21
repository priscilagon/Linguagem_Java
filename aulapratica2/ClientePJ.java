// Pertence ao pacote 'aulapratica2'
package aulapratica2;

// Aplicação de HERANÇA: ClientePJ estende a superclasse Cliente
public class ClientePJ extends Cliente{
    
    // Atributo específico para pessoas jurídicas: Cadastro Nacional da Pessoa Jurídica[cite: 9]
    private String cnpj;
    
    // CONSTRUTOR DA SUBCLASSE[cite: 9]:
    // Recebe os parâmetros necessários para inicializar a classe mãe e o atributo local[cite: 9]
    public ClientePJ(String nome, String endereco,String cnpj){
        // Chama o construtor da superclasse Cliente para atribuir 'nome' e 'endereco'[cite: 6, 9]
        super(nome,endereco);
        // Atribui o CNPJ recebido à variável de instância local[cite: 9]
        this.cnpj=cnpj;
    }
    
    // Método acessor para consultar o CNPJ[cite: 9]
    public String getCnpj()
    {
        return cnpj;
    }
    
    // Método modificador para atualizar o CNPJ[cite: 9]
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
    
    // SOBRESCRITA DE MÉTODO (OVERRIDING)[cite: 9]:
    // Customiza a saída de texto para o perfil de empresa[cite: 9]
    public String toString(){
        // Aproveita o retorno do toString() da superclasse e acrescenta o CNPJ[cite: 6, 9]
        return super.toString()+"cnpj:"+cnpj;
    }   
}