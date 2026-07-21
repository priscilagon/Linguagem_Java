// Herda de Automovel e implementa as regras da interface ControlavelAmbiental.
public class Carro extends Automovel implements ControlavelAmbiental {
    
    // Atributos específicos da classe Carro.
    private int quantidadePortas;
    private String tipoCarroceria; // Ex: Sedan, Hatch, SUV, Cupê

    // Construtor que inicializa dados do carro e envia os dados base para a classe pai.
    public Carro(String marca, String modelo, int ano, double preco, int quantidadePortas, String tipoCarroceria) {
        super(marca, modelo, ano, preco); // Inicializando a herança.
        this.quantidadePortas = quantidadePortas;
        this.tipoCarroceria = tipoCarroceria;
    }

    // Implementação da regra de vistoria adaptada para as emissões normais de um carro (CO2).
    @Override
    public void realizarVistoriaGases() {
        System.out.println("Realizando teste de emissões de CO2 para o carro de passeio (" + getModelo() + ")...");
        System.out.println("Teste concluído! Baixa emissão de gases poluentes.");
    }

    @Override
    public boolean emitirLaudoSeguranca() {
        System.out.println("Laudo Técnico emitido para Carro de Passageiros.");
        return true; 
    }

    // Adiciona as informações de portas e carroceria na impressão da ficha técnica genérica.
    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica(); // Executa o print padrão da superclasse.
        System.out.println("Qtd Portas: " + this.quantidadePortas);
        System.out.println("Carroceria: " + this.tipoCarroceria);
        System.out.println("----------------------------------\n");
    }
}