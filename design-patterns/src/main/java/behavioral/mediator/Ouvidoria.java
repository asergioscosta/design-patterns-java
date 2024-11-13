package behavioral.mediator;

public class Ouvidoria {

    private static Ouvidoria instance = new Ouvidoria();

    public Ouvidoria() {};

    public static Ouvidoria getInstance() {
        return instance;
    }

    public String receberElogioSecretaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstance().receberElogio(mensagem);
    }

    public String receberReclamacaoSecretaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstance().receberReclamacao(mensagem);
    }

    public String receberSugestaoSecretaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstance().receberSugestao(mensagem);
    }

}
