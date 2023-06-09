package interfaces;

import java.util.Scanner;
import modelo.Aluno;
import modelo.Coordenador;
import modelo.Usuario;

public class MainInterface {
	
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Lógica para autenticação do usuário
        Usuario usuario = realizarLogin();

        // Verifica o tipo de usuário autenticado
        if (usuario instanceof Aluno) {
            Aluno aluno = (Aluno) usuario;
            exibirMenuAluno(aluno);
        } else if (usuario instanceof Coordenador) {
            Coordenador coordenador = (Coordenador) usuario;
            exibirMenuCoordenador(coordenador);
        } else {
            System.out.println("Usuário inválido");
        }
    }

    private static Usuario realizarLogin() {
        System.out.println("=== Sistema de Login ===");
        System.out.print("Digite seu nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        // Lógica para autenticar o usuário no banco de dados
        // Você pode utilizar um DAO para verificar as credenciais e retornar o usuário correspondente

        // Exemplo de autenticação de usuário
        if (nomeUsuario.equals("aluno1") && senha.equals("senha123")) {
            Aluno aluno = new Aluno();
            aluno.setId(1);
            aluno.setNome("Aluno 1");
            aluno.setSenha(senha);
            aluno.setTipo("aluno");
            return aluno;
        } else if (nomeUsuario.equals("coordenador1") && senha.equals("senha456")) {
            Coordenador coordenador = new Coordenador();
            coordenador.setId(1);
            coordenador.setNome("Coordenador 1");
            coordenador.setSenha(senha);
            coordenador.setTipo("coordenador");
            return coordenador;
        }

        return null; // Retorna null caso as credenciais sejam inválidas
    }

    private static void exibirMenuAluno(Aluno aluno) {
        System.out.println("=== Menu Aluno ===");
        System.out.println("1. Criar Evento ACC");
        System.out.println("2. Marcar Presença");
        System.out.println("3. Visualizar Eventos Passados");
        System.out.print("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                // Lógica para criar evento ACC
                break;
            case 2:
                // Lógica para marcar presença
                break;
            case 3:
                // Lógica para visualizar eventos passados
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static void exibirMenuCoordenador(Coordenador coordenador) {
        System.out.println("=== Menu Coordenador ===");
        System.out.println("1. Verificar Participação do Aluno");
        System.out.println("2. Calcular Pontos Totais");
        System.out.println("3. Visualizar Alunos");
        System.out.print("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                // Lógica para verificar participação do aluno
                break;
            case 2:
                // Lógica para calcular pontos totais
                break;
            case 3:
                // Lógica para visualizar alunos
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}