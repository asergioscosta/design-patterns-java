package creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Evasão");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço Inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Jubilamento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço Inválido", e.getMessage());
        }
    }

}