// A palavra-chave "abstract" indica que esta classe não pode ser instanciada diretamente.
// Ela serve apenas como um modelo (superclasse) para outras classes herdarem.
public abstract class Automovel {
    
    // Modificador "private" garante o encapsulamento, impedindo o acesso direto aos atributos fora da classe.
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean motorLigado;

    // Construtor da classe: método especial chamado no momento da criação do objeto para inicializar os atributos.
    public Automovel(String marca, String modelo, int ano, double preco) {
        this.marca = marca; // O "this" referencia o atributo da classe, diferenciando-o do parâmetro do construtor.
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.motorLigado = false; // Todo automóvel é instanciado com o motor desligado por padrão.
    }

    // Método público que altera o estado do atributo motorLigado.
    public void ligarMotor() {
        if (!this.motorLigado) { // Verifica se o motor NÃO está ligado.
            this.motorLigado = true;
            System.out.println("O motor do " + this.modelo + " foi ligado.");
        } else {
            System.out.println("O motor do " + this.modelo + " já está ligado.");
        }
    }

    // Método para imprimir os dados básicos que são comuns a todos os automóveis.
    public void exibirFichaTecnica() {
        System.out.println("\n----------------------------------");
        System.out.println("       FICHA TÉCNICA - VEÍCULO    ");
        System.out.println("----------------------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        // "printf" é usado para formatar o preço com duas casas decimais (%.2f).
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        // Uso de operador ternário para exibir "LIGADO" se true, ou "DESLIGADO" se false.
        System.out.println("Motor: " + (this.motorLigado ? "LIGADO" : "DESLIGADO"));
    }

    // Getters e Setters: métodos públicos para acessar e modificar os atributos privados com segurança.
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}