package br.com.fiap.loja.bo;

import br.com.fiap.loja.ProdutoTO;

public class EstoqueBO {
	
	public static ProdutoTO consultarProduto(int codigo){
	
			if(codigo == 401) {
				return new ProdutoTO(codigo,2.99,4,"camiseta branca");
			} else if (codigo == 402){
				return new ProdutoTO(codigo,2.99,4,"camiseta azul");
			} else if (codigo == 403) {
				return new ProdutoTO(codigo,2.99,4,"camiseta rosa");
			} else {
				return new ProdutoTO(-1,0,0,"camiseta branca");
			}
		}
	

}
