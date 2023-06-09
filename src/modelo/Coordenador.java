package modelo;

import dao.PresencaDAO
import dao.UsuarioDAO;

public class Coordenador extends Usuario {
	private PresencaDAO presencaDAO;
    private UsuarioDAO usuarioDAO;

    public Coordenador() {
        // Inicialize as instâncias do DAO
        presencaDAO = new PresencaDAO();
        usuarioDAO = new UsuarioDAO();
    }

    public void verificarParticipacaoAluno(Aluno aluno) {
        int totalPresencas = presencaDAO.contarPresencasPorAluno(aluno.getId());
        System.out.println("O aluno " + aluno.getNome() + " participou de " + totalPresencas + " eventos.");
    }

    public void calcularPontosTotais(Aluno aluno) {
        int pontosTotais = presencaDAO.calcularPontosTotaisPorAluno(aluno.getId());
        System.out.println("O aluno " + aluno.getNome() + " acumulou " + pontosTotais + " pontos de horas ACC.");
    }

    public void visualizarAlunos() {
        List<Aluno> alunos = usuarioDAO.buscarAlunos();
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}


