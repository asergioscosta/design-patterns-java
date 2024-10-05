package behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarUmAluno() {
        Turma turma = new Turma(2024, 2, "Arquitetura de Software", "Turma A");
        Aluno aluno = new Aluno("Aluno");
        aluno.matricular(turma);
        turma.lancarNotas();
        assertEquals("Aluno, nota lançada na Turma{ano=2024, semestre=2, nomeDisciplina='Arquitetura de Software', nomeTurma='Turma A'}", aluno.getUltimaNotificacao());
    }

    @Test
    void deveRetornarAlunos() {
        Turma turma = new Turma(2024, 2, "Arquitetura de Software", "Turma A");
        Aluno aluno1 = new Aluno("Aluno 1");
        Aluno aluno2 = new Aluno("Aluno 2");
        aluno1.matricular(turma);
        aluno2.matricular(turma);
        turma.lancarNotas();
        assertEquals("Aluno 1, nota lançada na Turma{ano=2024, semestre=2, nomeDisciplina='Arquitetura de Software', nomeTurma='Turma A'}", aluno1.getUltimaNotificacao());
        assertEquals("Aluno 2, nota lançada na Turma{ano=2024, semestre=2, nomeDisciplina='Arquitetura de Software', nomeTurma='Turma A'}", aluno2.getUltimaNotificacao());
    }

    @Test
    void naodeveRetornarAluno() {
        Turma turma = new Turma(2024, 2, "Arquitetura de Software", "Turma A");
        Aluno aluno = new Aluno("Aluno");
        aluno.matricular(turma);
        assertEquals(null, aluno.getUltimaNotificacao());
    }

    @Test
    void deveRetornarAlunoTurmaA() {
        Turma turmaA = new Turma(2024, 2, "Arquitetura de Software", "Turma A");
        Turma turmaB = new Turma(2024, 2, "Arquitetura de Software", "Turma A");
        Aluno aluno1 = new Aluno("Aluno 1");
        Aluno aluno2 = new Aluno("Aluno 2");
        aluno1.matricular(turmaA);
        aluno2.matricular(turmaB);
        turmaA.lancarNotas();
        assertEquals("Aluno 1, nota lançada na Turma{ano=2024, semestre=2, nomeDisciplina='Arquitetura de Software', nomeTurma='Turma A'}", aluno1.getUltimaNotificacao());
        assertEquals(null, aluno2.getUltimaNotificacao());
    }
}