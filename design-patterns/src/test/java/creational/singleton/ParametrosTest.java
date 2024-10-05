package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    void deveRetornarNomeEscola() {
        Parametros.getInstance().setNomeEscola("Escola");
        assertEquals("Escola", Parametros.getInstance().getNomeEscola());
    }

    @Test
    void deveRetornarNomeUsuario() {
        Parametros.getInstance().setUsuarioLogado("Usuario");
        assertEquals("Usuario", Parametros.getInstance().getUsuarioLogado());
    }

}