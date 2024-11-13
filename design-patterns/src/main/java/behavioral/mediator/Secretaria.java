package behavioral.mediator;

public class Secretaria implements Setor {

    private static Secretaria instance = new Secretaria();

    private Secretaria() {};

    public static Secretaria getInstance() {
        return instance;
    }

    public String receberElogio(String mensagem) {
        return "A Secretaria agradece seu elogio: " + mensagem;
    }

    public String receberReclamacao(String mensagem) {
        return "A Secretaria agradece sua reclamação e estará avaliando: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A secretaria agradece sua sugestão: " + mensagem;
    }
}
