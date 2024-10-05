package creational.factorymethod;

public class ServicoFactory {

    public static IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("creational.factorymethod.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Serviço Inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço Inválido");
        }
        return (IServico) objeto;
    }
}
