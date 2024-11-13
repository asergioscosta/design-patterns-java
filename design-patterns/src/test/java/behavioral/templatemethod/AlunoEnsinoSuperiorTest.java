package behavioral.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoSuperiorTest {

    @Test
    void deveRetornarAprovarAluno() {
        AlunoEnsinoSuperior aluno = new AlunoEnsinoSuperior();
        aluno.setNota1(7.5f);
        aluno.setNota2(8.5f);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarReprovarAluno() {
        AlunoEnsinoSuperior aluno = new AlunoEnsinoSuperior();
        aluno.setNota1(7.0f);
        aluno.setNota2(6.0f);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarInformarAluno() {
        AlunoEnsinoSuperior aluno = new AlunoEnsinoSuperior();
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        aluno.setNome("Augusto");
        aluno.setMatricula(1);
        assertEquals("AlunoGraduacao{matricula=1, nome='Augusto', resultado=Aprovado}", aluno.getInfo());
    }
}