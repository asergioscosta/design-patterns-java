package creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFormaturaTest {

    @Test
    void deveExecutarMatricula() {
        IServico servico = ServicoFactory.obterServico("Formatura");
        assertEquals("Formatura realizada", servico.executar());
    }

    @Test
    void deveCancelarMatricula() {
        IServico servico = ServicoFactory.obterServico("Formatura");
        assertEquals("Formatura cancelada", servico.cancelar());
    }

}