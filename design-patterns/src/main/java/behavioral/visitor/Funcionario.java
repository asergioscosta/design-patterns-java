package behavioral.visitor;

public class Funcionario implements Pessoa {

    private int matricula;
    private String nome;
    private float salario;

    public Funcionario(int matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFuncionario(this);
    }
}
