package adapter;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BancoCriptoTest {

    @Test
    void retornaValorBitcoinBanco(){
        BancoCripto bancoCripto = new BancoCripto();
        bancoCripto.setMoeda("A");

        assertEquals("318000",bancoCripto.getMoeda());
    }

    @Test
    void retornaValorDolarBanco(){
        BancoCripto bancoCripto = new BancoCripto();
        bancoCripto.setMoeda("A");

        assertEquals("1",bancoCripto.getDolar());
    }
}
