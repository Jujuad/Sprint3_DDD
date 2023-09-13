package view;

import model.Veiculo;
import model.Pedido;
import model.Pagamento;
import model.Motorista;
import model.Guincho;
import model.Caminhao;

import java.util.Scanner;

public class TesteFuncionalidadesRelevantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // instâncias dos objetos
        Veiculo veiculo = new Veiculo(1000.0, 5.0, 2.0, "ABC123", "Sedan", "Marca", "Azul", "Carro", 4, "Sedan", 500.0, false);
        Pedido pedido = new Pedido("ABC123", "Rua Amor, 123", "Rua Banana, 456", "Teste nao sei", "poste amarelo", "Em andamento", "Melhor rota");
        Pagamento pagamento = new Pagamento(100.0f, "Cartão de Crédito", "Pendente");
        Motorista motorista = new Motorista("João", "123456789", true);
        Guincho guincho = new Guincho("Setor A", "Unidade 1", "Tipo X", 2000.0, true);
        Caminhao caminhao = new Caminhao("Galpão 1", "Serial 123", "XYZ789", 3000.0, 3.0, 10.0, "Modelo Y");

        int escolha;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Calcular Peso Total do Veículo");
            System.out.println("2. Formatar Pedido");
            System.out.println("3. Visualizar Detalhes de Pagamento");
            System.out.println("4. Verificar disponibilidade do Motorista");
            System.out.println("5. Visualizar Tensão Ideal do Guincho");
            System.out.println("6. Verificar peso do Caminhão");
            System.out.println("7. Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    double pesoTotal = veiculo.calcularPesoTotal(100.0); 
                    System.out.println("Peso Total do Veículo: " + pesoTotal);
                    break;
                case 2:
                    String formatoPedido = pedido.pedidoFormatado(); 
                    System.out.println("Formato do Pedido:");
                    System.out.println(formatoPedido);
                    break;
                case 3:
                    String detalhesPagamento = pagamento.visualizarDetalhesPagamento(); 
                    System.out.println("Detalhes de Pagamento:");
                    System.out.println(detalhesPagamento);
                    break;
                case 4:
                    System.out.println("Motorista: " + motorista.getNome() + " Disponível: " + motorista.isDisponibilidade());
                    break;
                case 5:
                    String tensaoIdealGuincho = guincho.calcularTensaoIdeal(veiculo); 
                    System.out.println(tensaoIdealGuincho);
                    break;
                case 6:
                    double pesoTotalCaminhao = caminhao.calcularPesoTotal(veiculo); 
                    System.out.println("Peso Total do Caminhão: " + pesoTotalCaminhao);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 7);

        scanner.close();
    }
}
