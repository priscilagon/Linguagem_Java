// "extends Automovel" indica herança. "implements ControlavelAmbiental" indica que assina o contrato da interface.
public class Caminhao extends Automovel implements ControlavelAmbiental {
    
    // Atributos específicos da classe Caminhao.
    private double capacidadeCarga;
    private int quantidadeEixos;

    // Construtor de Caminhao que recebe tanto os dados da superclasse quanto os seus próprios.
    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga, int quantidadeEixos) {
        // "super" repassa os argumentos comuns para o construtor da classe pai (Automovel).
        super(marca, modelo, ano, preco); 
        this.capacidadeCarga = capacidadeCarga;
        this.quantidadeEixos = quantidadeEixos;
    }

    // A anotação @Override indica que este método está sobrescrevendo o método exigido pela interface.
    @Override
    public void realizarVistoriaGases() {
        // Lógica específica de vistoria para caminhões (fumaça preta).
        System.out.println(" Iniciando teste de opacidade de fumaça preta no escapamento do Caminhão (" + getModelo() + ")...");
        System.out.println("Nível de partículas dentro do limite permitido pela legislação de carga pesada.");
    }

    @Override
    public boolean emitirLaudoSeguranca() {
        System.out.println("Laudo de Segurança Ambiental de Transporte Pesado validado.");
        return true; // Retorna validação positiva para caminhões.
    }

    // Sobrescrevendo o método da superclasse para adicionar características específicas do caminhão na ficha técnica.
    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica(); // Chama o método original da classe Automovel para exibir os dados básicos.
        System.out.println("Capacidade de Carga: " + this.capacidadeCarga + " Toneladas");
        System.out.println("Número de Eixos: " + this.quantidadeEixos);
        System.out.println("----------------------------------\n");
    }
}