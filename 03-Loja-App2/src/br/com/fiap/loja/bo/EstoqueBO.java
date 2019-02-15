package br.com.fiap.loja.bo;

import org.apache.log4j.Logger;

import br.com.fiap.loja.ProdutoTO;

public class EstoqueBO {
	
	private static Logger log = Logger.getLogger(EstoqueBO.class);

	
	public static ProdutoTO consultarProduto(int codigo){

	
			if(codigo == 401) {
				log.debug(codigo+ "-" + "camiseta branca");
				return new ProdutoTO(codigo,2.99,4,"camiseta branca");
			} else if (codigo == 402){
				log.debug(codigo+ "-" + "camiseta branca");
				return new ProdutoTO(codigo,2.99,4,"camiseta azul");
			} else if (codigo == 403) {
				log.debug(codigo+ "-" + "camiseta branca");
				return new ProdutoTO(codigo,2.99,4,"camiseta rosa");
			} else {
				log.debug(codigo+ "-" + "camiseta branca");
				return new ProdutoTO(-1,0,0,"camiseta branca");
			}
		}
	

}
