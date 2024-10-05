package creational.factorymethod;

public class ServicoFormatura implements IServico {

    public String executar() {
        return "Formatura realizada";
    }

    public String cancelar() {
        return "Formatura cancelada";
    }
}
