package br.com.acsul.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo = new Campo(3, 3);
	
	@Test
	void testeVizinhoRealDistancia1() {
		Campo vizinho = new Campo(6,5);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
				assertTrue(resultado);
				
	}

	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
}
