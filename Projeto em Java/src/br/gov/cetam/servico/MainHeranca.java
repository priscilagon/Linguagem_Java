public class MainHeranca {
    
    // Ponto de entrada (entry point) da aplicação Java.
    public static void main(String[] args) {
        System.out.println("==== SISTEMA DE CONTROLE AMBIENTAL E DE QUALIDADE - CETAM POO ====\n");

        // Instanciando diferentes categorias de carros de passeio (Sedan, Hatch, SUV e Cupê)
        Carro carro1 = new Carro("Toyota", "Corolla", 2024, 150000.00, 4, "Sedan");
        Carro carro2 = new Carro("Chevrolet", "Onix", 2023, 85000.00, 4, "Hatch");
        Carro carro3 = new Carro("Honda", "HR-V", 2025, 160000.00, 4, "SUV");
        Carro carro4 = new Carro("Porsche", "911 Carrera", 2026, 900000.00, 2, "Cupê");

        // Instanciando um Caminhão para fiscalização pesada
        Caminhao caminhao1 = new Caminhao("Scania", "R 540", 2024, 720000.00, 80.0, 6);
        
        // 1. Simulação de Teste de Emissão Ambiental para os Carros (Polimorfismo de Interface)
        // Ao chamar estes métodos, o comportamento exibido será o definido especificamente dentro da classe Carro.
        System.out.println("=== VISTORIA AMBIENTAL: VEÍCULOS DE PASSEIO ===");
        carro1.realizarVistoriaGases();
        System.out.println("Laudo Aprovado? " + carro1.emitirLaudoSeguranca());

        System.out.println();
        carro4.realizarVistoriaGases();
        System.out.println("Laudo Aprovado? " + carro4.emitirLaudoSeguranca());

        // 2. Simulação de Teste para o Caminhão
        // Aqui também ocorre polimorfismo, mas exibindo a mensagem direcionada para Caminhões (fumaça preta).
        System.out.println("\n=== VISTORIA AMBIENTAL: VEÍCULO PESADO ===");
        caminhao1.realizarVistoriaGases();
        System.out.println("Laudo de Carga Pesada Aprovado? " + caminhao1.emitirLaudoSeguranca());

        // 3. Exibição das Fichas Técnicas (Polimorfismo de Sobrescrita)
        // Cada objeto vai chamar o seu respectivo "exibirFichaTecnica()", demonstrando o comportamento correto para Carro ou Caminhao.
        System.out.println("\n=== FICHAS TÉCNICAS DA FROTA ATUAL ===");
        carro1.exibirFichaTecnica();
        carro2.exibirFichaTecnica();
        carro3.exibirFichaTecnica();
        carro4.exibirFichaTecnica();
        caminhao1.exibirFichaTecnica();
    }
}