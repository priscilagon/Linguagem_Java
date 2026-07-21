// A palavra "interface" define um contrato de métodos que as classes assinantes devem implementar obrigatoriamente.
public interface ControlavelAmbiental {
    
    // Métodos em interfaces são abstratos e públicos por padrão. 
    // Eles apenas definem "o que" deve ser feito, deixando o "como" para as classes (Carro e Caminhao).
    void realizarVistoriaGases();
    
    // Método que exige o retorno de um booleano (verdadeiro/falso) sobre a emissão do laudo.
    boolean emitirLaudoSeguranca();
}