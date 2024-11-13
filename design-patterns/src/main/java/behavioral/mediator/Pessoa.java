package behavioral.mediator;

public class Pessoa {

    public String elogiarSecretaria(String mensagem) {
        return Ouvidoria.getInstance().receberElogioSecretaria(mensagem);
    }

    public String reclamarSecretaria(String mensagem) {
        return Ouvidoria.getInstance().receberReclamacaoSecretaria(mensagem);
    }

    public String sugerirSecretaria(String mensagem) {
        return Ouvidoria.getInstance().receberSugestaoSecretaria(mensagem);
    }
}
