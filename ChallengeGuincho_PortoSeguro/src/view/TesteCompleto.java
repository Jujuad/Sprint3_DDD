package view;

import java.util.Scanner;
import model.Cliente;
import model.Veiculo;
import model.Usuario;
import model.Pedido;
import model.Pagamento;
import model.Motorista;
import model.Guincho;
import model.GerenciadorMotorista;
import model.GerenciadorCaminhao;
import model.GerenciadorGuincho;
import model.Caminhao;

public class TesteCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // valores setados em funcao do objetivo de teste da main
        Cliente cliente = new Cliente("Giovanni", "Empresa seila", "09146448888", "12345678910113", "11987668245");
        Usuario usuario = new Usuario("joaninha.doe", "senha123");
        Pedido pedido = new Pedido("ABC123", "Rua Amor, 123", "Rua Banana, 456", "Teste nao sei", "poste amarelo", "Em andamento", "Melhor rota");
        Veiculo veiculo = new Veiculo(1500.0, 4.5, 1.8, "ABC1234", "Cargo 816", "Ford", "Preto", "Carga", 4,"Tradicional", 900.0, false);
        Pagamento pagamento = new Pagamento(100.0f, "Cartão de debito", "Pendente");
        Motorista motorista = new Motorista("João Augusto", "123456789", true);
        Guincho guincho = new Guincho("Setor A", "Unidade 1", "Tipo 1", 1500.0, true);
        Caminhao caminhao = new Caminhao("Galpão 1", "12345", "ABC1234", 5000.0, 3.5, 10.0, "Modelo Hard");
        GerenciadorMotorista gerenciadorMotorista = new GerenciadorMotorista();
        GerenciadorCaminhao gerenciadorCaminhao = new GerenciadorCaminhao();
        GerenciadorGuincho gerenciadorGuincho = new GerenciadorGuincho();
        
        
        // teste cliente 
        System.out.println("Etapa 1 - Cliente, pedidos e pagamento");
        // atualização de cadastro de cliente
        System.out.println("Atualização de Perfil");
        System.out.print("Novo nome do solicitante: ");
        String novoNomeSolicitante = scanner.nextLine();
        System.out.print("Novo nome da empresa: ");
        String novoNomeEmpresa = scanner.nextLine();
        System.out.print("Novo CPF do solicitante: ");
        String novoCpfSolicitante = scanner.nextLine();
        System.out.print("Novo CNPJ da empresa: ");
        String novoCnpjEmpresa = scanner.nextLine();
        System.out.print("Novo telefone: ");
        String novoTelefone = scanner.nextLine();

        cliente.atualizarPerfil(novoNomeSolicitante, novoNomeEmpresa, novoCpfSolicitante, novoCnpjEmpresa, novoTelefone);

        // visualizar detalhes do pagamento
        System.out.println("Detalhes do Pagamento");
        cliente.visualizarDetalhesPagamento(pagamento);

        // adicionar pedido
        System.out.println("Pedido realizado: " + pedido.pedidoFormatado());
        cliente.adicionarPedido(pedido);
        cliente.listarPedidos();
        
        // cancelar pedido
        System.out.println("Cancelar Pedido");
        cliente.cancelarPedido(pedido);
        System.out.println("Pedidos após o cancelamento:");
        cliente.listarPedidos();

        // adicionar cartão
        System.out.println("Adicionar Cartão");
        System.out.print("Número do cartão: ");
        String numeroCartao = scanner.nextLine();
        System.out.print("Nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.print("CVV: ");
        String cvv = scanner.nextLine();

        cliente.adicionarCartao(numeroCartao, nomeCompleto, cvv);

        // listar cartões para verificacao
        System.out.println("Listar Cartões");
        cliente.listarCartoes();

        
        
        // teste usuario
        System.out.println("Etapa 2 - Usuario");
        
        // login com o usuário
        String inputUsername = "joaninha.doe";
        String inputSenha = "senha123";
        usuario.login(inputUsername, inputSenha);

        // verificar se o usuário está logado
        if (usuario.isLogado()) {
            System.out.println("Usuário logado: " + usuario.getUsername());
        } else {
            System.out.println("Usuário não está logado.");
        }

        // registrar um novo usuário
        String newUsername = "jacare.socorro";
        String newSenha = "novasenha";
        usuario.register(newUsername, newSenha);
        
        
        
        
        
        // teste veículo
        System.out.println("Etapa 3 - Veículo");
        
        // peso total - veículo
        System.out.print("Peso por eixo: ");
        double pesoEixo = scanner.nextDouble();

        double pesoTotal = veiculo.calcularPesoTotal(pesoEixo);
        System.out.println("Peso total do veículo: " + pesoTotal);
        
        
        
        
        
        // teste guincho
        System.out.println("Etapa  4 -  Guincho");
        
        String tensaoIdeal = guincho.calcularTensaoIdeal(veiculo);
        System.out.println("Tensao ideal do guincho: " + tensaoIdeal);
       
        
        
        
        // teste caminhao
        System.out.println("Etapa  5 - Caminhao");
        
        double pesoTotalCaminhao = caminhao.calcularPesoTotal(veiculo);
        double alturaTotal = caminhao.calcularAlturaTotal(veiculo);
        double comprimentoTotal = caminhao.calcularComprimentoTotal(veiculo);

        System.out.println("Peso total: " + pesoTotalCaminhao);
        System.out.println("Altura total: " + alturaTotal);
        System.out.println("Comprimento total: " + comprimentoTotal);
        
        
        
        // teste gerenciador de motorista
        System.out.println("Etapa  6 -  Gerenciador de Motorista");
        
        System.out.print("Digite o nome do motorista: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do motorista: ");
        String telefone = scanner.nextLine();
        System.out.print("O motorista está disponível? (S/N): ");
        String disponibilidadeInput = scanner.nextLine();
        boolean disponibilidade = disponibilidadeInput.equalsIgnoreCase("S");
        
        
        Motorista motoristaNovo = new Motorista(nome, telefone, disponibilidade);
        
        // adicionando o motorista ao gerenciador
        gerenciadorMotorista.adicionarMotorista(motoristaNovo);
        gerenciadorMotorista.adicionarMotorista(motorista);
        
        // removendo o motorista ao gerenciador
        gerenciadorMotorista.removerMotorista(motorista);
        
        // listando os motoristas disponiveis
        gerenciadorMotorista.listarMotoristasDisponiveis();
        
        
        
        
        
        // teste gerenciador de guincho
        System.out.println("Etapa  7 -  Gerenciador de Guincho");
        
        System.out.print("Digite o setor do guincho: ");
        String setor = scanner.nextLine();
        System.out.print("Digite a unidade do guincho: ");
        String unidade = scanner.nextLine();
        System.out.print("Digite o tipo do guincho: ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o peso do guincho: ");
        double peso = scanner.nextDouble();
        System.out.print("O guincho está disponível? (S/N): ");
        String disponibilidadeInput1 = scanner.nextLine();
        boolean disponibilidade1 = disponibilidadeInput1.equalsIgnoreCase("S");
        
        Guincho guinchoNovo = new Guincho(setor, unidade, tipo, peso, disponibilidade1);

        // adicionar guincho ao gerenciador
        gerenciadorGuincho.adicionarGuincho(guinchoNovo);
        gerenciadorGuincho.adicionarGuincho(guincho);

        // remover guincho do gerenciador
        gerenciadorGuincho.removerGuincho(guincho);

        // listar guinchos disponíveis
        System.out.println("Guinchos disponíveis:");
        gerenciadorGuincho.listarGuinchosDisponiveis();
        
        

        
        
        
        // teste gerenciador de caminhao
        System.out.println("Etapa  8 -  Gerenciador de Caminhao");
        
        System.out.print("Informe o galpao: ");
        String galpao = scanner.nextLine();
        System.out.print("Digite o numero Serial do Caminhao: ");
        String numeroSerial = scanner.nextLine();
        System.out.print("Digite a placa do Caminhao: ");
        String placa = scanner.nextLine();
        System.out.print("Digite o peso do Caminhao: ");
        double pesoCaminhao = scanner.nextDouble();
        System.out.print("Digite a altura do Caminhao: ");
        double alturaCaminhao = scanner.nextDouble();
        System.out.print("Digite a comprimento do Caminhao: ");
        double comprimentoCaminhao = scanner.nextDouble();
        System.out.print("Digite o modelo do Caminhao: ");
        String modelo = scanner.nextLine();
        
        Caminhao caminhaoNovo = new Caminhao(galpao, numeroSerial, placa , pesoCaminhao , alturaCaminhao , comprimentoCaminhao, modelo);

        // adicionar caminhao ao gerenciador
        gerenciadorCaminhao.adicionarCaminhao(caminhaoNovo);
        gerenciadorCaminhao.adicionarCaminhao(caminhao);


        // remover caminhao do gerenciador
        gerenciadorCaminhao.removerCaminhao(caminhao);

        // listar caminhao disponíveis
        System.out.println("Caminhoes disponíveis:");
        gerenciadorCaminhao.listarCaminhoesDisponiveis();
        
       
        
    }
}

