package behavioral.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    @Test
    void deveRetornarAprovarAluno() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(7);
        aluno.setNota2(7);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarReprovarAluno() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(5);
        aluno.setNota2(6);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarInformarAluno() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(5);
        aluno.setNota2(6);
        aluno.setNome("Augusto");
        aluno.setMatricula(1);
        assertEquals("Aluno{matricula=1, nome='Augusto', resultado=Reprovado}", aluno.getInfo());
    }
}