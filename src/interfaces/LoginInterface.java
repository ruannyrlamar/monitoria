package interfaces;

import java.util.Scanner;
import modelo.Aluno;
import modelo.Coordenador;
import modelo.Usuario;

public class LoginInterface {
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        realizarLogin();
    }

    private static void realizarLogin() {
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
            exibirMenuAluno(aluno);
        } else if (nomeUsuario.equals("coordenador1") && senha.equals("senha456")) {
            Coordenador coordenador = new Coordenador();
            coordenador.setId(1);
            coordenador.setNome("Coordenador 1");
            coordenador.setSenha(senha);
            coordenador.setTipo("coordenador");
            exibirMenuCoordenador(coordenador);
        } else {
            System.out.println("Credenciais inválidas. Tente novamente.");
            realizarLogin();
        }
    }

    private static void exibirMenuAluno(Aluno aluno) {
        System.out.println("=== Menu Aluno ===");
        // Implemente a lógica do menu do aluno aqui
    }

    private static void exibirMenuCoordenador(Coordenador coordenador) {
        System.out.println("=== Menu Coordenador ===");
        // Implemente a lógica do menu do coordenador aqui
    }
}