package one.digitalinnovation.gof.facade;

import subSistema1.CrmService;
import subSistema2.CepApi;

public class Facade {

	public void migrarClientes(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
