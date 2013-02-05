package state;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaquinaDoPokemonTests {

	@Test
	public void test_colocar_brinquedos() {
		MaquinaDoPokemon maquinaDoPokemon = new MaquinaDoPokemon();
		assertEquals("Maquina com 10 brinquedo(s).", maquinaDoPokemon.colocarBrinquedos(10));
	}
	
	@Test
	public void test_estado_sem_moeda(){
		MaquinaDoPokemon maquinaDoPokemon = new MaquinaDoPokemon(10);
		assertEquals("Vc girou, mas sem moeda.", maquinaDoPokemon.acionarAlavanca());
		assertEquals("Vc nao colocou uma moeda.", maquinaDoPokemon.devolverMoeda());
		assertEquals("Coloque a moeda primeiro.", maquinaDoPokemon.entregarBrinquedo());
		assertEquals("Ok, moeda recebida.", maquinaDoPokemon.colocarMoeda());
	}
	
	@Test
	public void test_estado_com_moeda(){
		MaquinaDoPokemon maquinaDoPokemon = new MaquinaDoPokemon(10);
		assertEquals("Ok, moeda recebida.", maquinaDoPokemon.colocarMoeda());
		assertEquals("Cabe apenas uma moeda, jah tem uma.", maquinaDoPokemon.colocarMoeda());
		assertEquals("Gire a alavanca, ou pegue a moeda de volta.", maquinaDoPokemon.entregarBrinquedo());
		assertEquals("Vc vira a alavanca e um brinquedo aparece!", maquinaDoPokemon.acionarAlavanca());
	}
	
	@Test
	public void test_estado_sem_brinquedos(){
		MaquinaDoPokemon maquinaDoPokemon = new MaquinaDoPokemon();
		assertEquals("Vc girou, mas os brinquedos acabaram.", maquinaDoPokemon.acionarAlavanca());
		assertEquals("Vc nao colocou uma moeda.", maquinaDoPokemon.devolverMoeda());
		assertEquals("Maquina vazia", maquinaDoPokemon.entregarBrinquedo());
		assertEquals("Nao dah para colocar a moeda. Maquina vazia", maquinaDoPokemon.colocarMoeda());
	}
	
}
