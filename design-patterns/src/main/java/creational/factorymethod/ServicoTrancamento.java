package creational.factorymethod;

public class ServicoTrancamento implements IServico {

    public String executar(){
        return "Trancamento realizado";
    }

    public String cancelar(){
        return "Trancamento cancelado";
    }
}
