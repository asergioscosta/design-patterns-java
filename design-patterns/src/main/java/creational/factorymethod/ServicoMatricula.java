package creational.factorymethod;

public class ServicoMatricula implements IServico {

    public String executar() {
        return "Matricula realizada";
    }

    public String cancelar() {
        return "Matricula cancelada";
    }
}
