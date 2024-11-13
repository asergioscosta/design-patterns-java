package behavioral.visitor;

public class Professor implements Pessoa {

    private int matricula;
    private String nome;
    private String titulacao;

    public Professor(int matricula, String nome, String titulacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProfessor(this);
    }
}
