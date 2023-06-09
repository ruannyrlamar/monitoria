package modelo;

public class Aluno extends Usuario {
	private EventoDAO eventoDAO;
    private PresencaDAO presencaDAO;

    public Aluno() {
        // Inicialize as instâncias do DAO
        eventoDAO = new EventoDAO();
        presencaDAO = new PresencaDAO();
    }

    public void criarEventoACC(Evento evento) {
        eventoDAO.inserirEvento(evento);
    }

    public void marcarPresenca(Evento evento) {
        Presenca presenca = new Presenca(evento.getId(), this.getId(), new Date());
        presencaDAO.registrarPresenca(presenca);
    }

    public void visualizarEventosPassados() {
        List<Evento> eventosPassados = eventoDAO.buscarEventosPassados();
        for (Evento evento : eventosPassados) {
            System.out.println(evento.getNome() + " - " + evento.getHorario());
        }
    }
}

//Nesse exemplo, assumimos que existem as classes Evento, Presenca e os respectivos DAOs EventoDAO e PresencaDAO.
//É importante notar que a lógica exata desses métodos pode variar dependendo das implementações específicas do seu projeto.
//No método criarEventoACC(), chamamos o método inserirEvento() do eventoDAO para salvar o evento no banco de dados.
//No método marcarPresenca(), criamos um objeto Presenca com as informações necessárias, como o ID do evento, ID do aluno e a data atual.
//Em seguida, chamamos o método registrarPresenca() do presencaDAO para salvar a presença no banco de dados.
//No método visualizarEventosPassados(), chamamos o método buscarEventosPassados() do eventoDAO para obter a lista de eventos passados do aluno.
//Em seguida, percorremos essa lista e exibimos as informações relevantes, como o nome e horário do evento.
//Essa é uma implementação básica apenas para demonstrar a lógica geral dos métodos. É importante adaptar essa implementação de acordo com as
//especificidades do seu sistema e suas classes DAO reais, considerando a lógica de acesso ao banco de dados e as validações necessárias. 
//



