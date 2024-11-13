package behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveRetornarAluno() {
        Aluno aluno = new Aluno(1, "Augusto", (new Curso("Sistemas de Informação")));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Aluno{matricula=1, nome='Augusto', curso=Sistemas de Informação}", visitor.exibir(aluno));

    }

    @Test
    void deveRetornarProfessor() {
        Professor professor = new Professor(1, "Victor", "Doutorado");
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Professor{matricula=1, nome='Victor', titulacao='Doutorado'}", visitor.exibir(professor));
    }

    @Test
    void deveRetornarFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Ana", 3659.0f);
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{matricula=1, nome='Ana', salario=3659.0}", visitor.exibir(funcionario));
    }

}