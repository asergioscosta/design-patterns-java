package creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTrancamentoTest {

    @Test
    void deveExecutarTrancamento() {
        IServico servico = ServicoFactory.obterServico("Trancamento");
        assertEquals("Trancamento realizado", servico.executar());
    }

    @Test
    void deveCancelarTrancamento() {
        IServico servico = ServicoFactory.obterServico("Trancamento");
        assertEquals("Trancamento cancelado", servico.cancelar());
    }
}