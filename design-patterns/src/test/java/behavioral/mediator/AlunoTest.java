package behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveElogiarSecretaria() {
        Aluno aluno = new Aluno();
        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Secretaria agradece seu elogio: Ótimo atendimento da Secretaria",
                aluno.elogiarSecretaria("Ótimo atendimento da Secretaria"));
    }

    @Test
    void deveReclamarSecretaria() {
        Aluno aluno = new Aluno();
        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Secretaria agradece sua reclamação e estará avaliando: Atendimento demorado",
                aluno.reclamarSecretaria("Atendimento demorado"));
    }

    @Test
    void deveSugerirSecretaria() {
        Aluno aluno = new Aluno();
        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A secretaria agradece sua sugestão: Ampliar horário de atendimento",
                aluno.sugerirSecretaria("Ampliar horário de atendimento"));
    }
}